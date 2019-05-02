package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import json.models.RedditJsonModel;
import json.models.RedditJsonModel.Child;
import models.RedditModel;

public class RedditService {
	
	public DatabaseService _databaseService;
	
	public RedditService()
	{
		_databaseService = new DatabaseService();
	}

	// maps RedditJsonModel to RedditModel
	public List<RedditModel> GetRedditPostsFromJson(RedditJsonModel model){

		List<RedditModel> redditList = new ArrayList<RedditModel>();
		
		for (Child child : model.data.children) {
			if(child.data.url.contains(".jpg")) {
				RedditModel redditModel = new RedditModel();
				redditModel.setImageUrl(child.data.url);
				redditModel.setTitle(child.data.title);
				redditModel.setIsPosted(false);
				
				redditList.add(redditModel);
			}
		}
		return redditList;
	}
	
	// sorts out posts that haven't been saved yet
	public List<RedditModel> GetNewRedditPosts(List<RedditModel> postList) throws SQLException{
		List<RedditModel> newPostsList = new ArrayList<RedditModel>();
		
		for(RedditModel model : postList) {
			boolean isInDatabase = _databaseService.CheckForDuplicatePost(model.imageUrl);
			if(!isInDatabase)
			{
				newPostsList.add(model);
			}
		}
		return newPostsList;
		
	}
	
	// loops through new posts and inserts into database
	public void InsertNewRedditTweets(List<RedditModel> newPostsList) throws SQLException {
		for(RedditModel model: newPostsList)
		{
			_databaseService.InsertRedditPost(model.title, model.imageUrl, model.isPosted);
		}
	}
}
