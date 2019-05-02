package program;

import java.util.List;

import json.models.RedditJsonModel;
import models.RedditModel;
import services.JsonService;
import services.RedditService;

public class Program {

	public static void main(String[] args) throws Exception {
		JsonService _jsonService = new JsonService();
		RedditService _redditService = new RedditService();
		
		// get json of subreddit
		RedditJsonModel rjm = _jsonService.readRedditJson("https://www.reddit.com/r/popular/.json");
		
		// get list of images from json
		List<RedditModel> postList = _redditService.GetRedditPosts(rjm);
		
		// check if posts are already in database
		List<RedditModel> newPostsList = _redditService.GetNewRedditPosts(postList);
		
		// save reddit posts to db
		if(newPostsList.size() > 0) {
			_redditService.InsertNewRedditTweets(newPostsList);
		}
		
    }
}
