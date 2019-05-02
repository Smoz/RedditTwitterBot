package program;

import java.util.List;

import json.models.RedditJsonModel;
import models.RedditModel;
import models.TwitterModel;
import services.JsonService;
import services.RedditService;
import services.DatabaseService;
import services.TwitterService;

public class Program {

	public static void main(String[] args) throws Exception {
		JsonService _jsonService = new JsonService();
		RedditService _redditService = new RedditService();
		DatabaseService _databaseService = new DatabaseService();
		TwitterService _twitterService = new TwitterService();
		
		// get json of subreddit
		RedditJsonModel rjm = _jsonService.readRedditJson("https://www.reddit.com/r/popular/.json");
		
		// get list of images from json
		List<RedditModel> postList = _redditService.GetRedditPostsFromJson(rjm);
		
		// check if posts are already in database
		List<RedditModel> newPostsList = _redditService.GetNewRedditPosts(postList);
		
		// save reddit posts to db
		if(newPostsList.size() > 0) {
			_redditService.InsertNewRedditTweets(newPostsList);
		}

		// get reddit tweet not posted yet
		TwitterModel twitterModel = _databaseService.GetNonPostedTweet();

		// post tweet
		_twitterService.PublishTweet(twitterModel.title, twitterModel.imageUrl);

		//update db
		_databaseService.UpdatePostedTweet(twitterModel.id);

    }
}
