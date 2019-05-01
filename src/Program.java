import services.TwitterService;

public class Program {

	public static void main(String[] args) throws Exception {
		 //JsonService jsonService = new JsonService();
		 //jsonService.readRedditJson("https://www.reddit.com/r/popular/.json"); 
		
		TwitterService twitterService = new TwitterService();
		twitterService.PublishTweet("Hello World 2");
    }
}
