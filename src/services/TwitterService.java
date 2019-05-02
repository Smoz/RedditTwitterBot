package services;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterService {

	public void PublishTweet(String message, String imageUrl) throws TwitterException, IOException{
		
		Twitter twitter = TwitterFactory.getSingleton();
		StatusUpdate status = new StatusUpdate(message);
			
		// connect and get image for input stream
		URL url = new URL(imageUrl);
		URLConnection urlConnection = url.openConnection();
		InputStream in = new BufferedInputStream(urlConnection.getInputStream());
			
		status.setMedia("image.png", in);
		twitter.updateStatus(status);
		in.close();
	}
	
}
