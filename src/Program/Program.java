package program;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import json.models.RedditJsonModel;
import models.RedditModel;
import models.TwitterModel;
import services.JsonService;
import services.RedditService;
import services.DatabaseService;
import services.TwitterService;
import twitter4j.TwitterException;

public class Program {

	public static String subredditUrl;

	public static void main(String[] args) throws Exception {

		Greeting();

		System.out.println("Starting bot process...");
		RedditProcess();
		TwitterProcess();
    }

    public static void Greeting(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Reddit Twitter Bot");
		System.out.println("==================");
		System.out.println("Enter in the subreddit you'd like to retrieve images from.");
		System.out.println("~~~~~~Please add .json to the end of the link.");
		System.out.println("~~~~~~EXAMPLE: https://reddit.com/r/popular/.json");
		System.out.println("Subreddit Url: ");
		subredditUrl = scanner.next();
	}

	public static void TwitterProcess() throws SQLException, TwitterException, IOException, InterruptedException {
		DatabaseService _databaseService = new DatabaseService();
		TwitterService _twitterService = new TwitterService();

		// get reddit tweet not posted yet
		TwitterModel twitterModel = _databaseService.GetNonPostedTweet();

		if (twitterModel != null)
		{
			// post tweet
			_twitterService.PublishTweet(twitterModel.title, twitterModel.imageUrl);

			//update db
			_databaseService.UpdatePostedTweet(twitterModel.id);

			TimeUnit.MINUTES.sleep(2);
			TwitterProcess();
		}
		else
		{
			RedditProcess(); // program breaks here now :)
		}


	}

	public static void RedditProcess() throws IOException, SQLException, InterruptedException {
		JsonService _jsonService = new JsonService();
		RedditService _redditService = new RedditService();


		// get json of subreddit
		RedditJsonModel rjm = _jsonService.readRedditJson(subredditUrl);

		// get list of images from json
		List<RedditModel> postList = _redditService.GetRedditPostsFromJson(rjm);

		// check if posts are already in database
		List<RedditModel> newPostsList = _redditService.GetNewRedditPosts(postList);

		// save reddit posts to db
		if(newPostsList.size() > 0) _redditService.InsertNewRedditTweets(newPostsList);
	}
}
