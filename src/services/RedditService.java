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

	// gets Reddit post 
	public List<RedditModel> GetRedditPosts(RedditJsonModel model){
		RedditModel redditModel = new RedditModel();
		List<RedditModel> redditList = new ArrayList<RedditModel>();
		
		for (Child child : model.data.children) {
			if(child.data.url.contains(".jpg")) {
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
		List<RedditModel> newPostList = new ArrayList<RedditModel>();
		
		for(RedditModel model : postList) {
			boolean isInDatabase = _databaseService.CheckForDuplicatePost(model.imageUrl);
			if(!isInDatabase)
			{
				newPostList.add(model);
			}
		}
		return newPostList;
		
	}
	
	// loops through new posts and inserts into database
	public void InsertNewRedditTweets(List<RedditModel> newPostsList) throws SQLException {
		for(RedditModel model: newPostsList)
		{
			_databaseService.InsertRedditPost(model.title, model.imageUrl, model.isPosted);
		}
	}
}
