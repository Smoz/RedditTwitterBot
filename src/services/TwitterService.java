package services;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterService {

	// Post tweet 
	public void PublishTweet(String message) throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
		Status status = twitter.updateStatus(message);
	}
}
