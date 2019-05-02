package Program;

import models.TwitterModel;
import services.DatabaseService;
import services.TwitterService;

public class Program {

	public static void main(String[] args) throws Exception {
		DatabaseService ds = new DatabaseService();
		TwitterService ts = new TwitterService();
		
		// get reddit post
		
		// save reddit post to db
		
		// get nonposted reddit tweet
		TwitterModel twitterModel = ds.GetNonPostedTweet();
		
		// post tweet
		ts.PublishTweet(twitterModel.title, twitterModel.imageUrl);
		
		// update to posted reddit tweet in db
		ds.UpdatePostedTweet(twitterModel.id);
    }
}
