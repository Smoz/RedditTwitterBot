package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.models.RedditJsonModel;
import json.models.RedditJsonModel.Child;

public class JsonService {

	
	public void readRedditJson(String url) throws IOException {
		RedditJsonModel rjm = new RedditJsonModel();
		URL website = new URL(url);
		  
	    URLConnection connection = website.openConnection();
	    connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // prevents http error 429
	          
	    BufferedReader in = new BufferedReader( new InputStreamReader(connection.getInputStream(),"UTF8"));
	    String jsonText = readJsonString(in);
	     
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    rjm = mapper.readValue(jsonText, RedditJsonModel.class);

	    in.close();
	     
	    // testing if the connection is being made and the json is being read properly
	    for (Child child : rjm.data.children) {
	    	 if(!child.data.thumbnail.contains("self")) {
	    		 System.out.print("true");
	    	 }
	     }
	}
	
	public String readJsonString(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }
	
	
}
