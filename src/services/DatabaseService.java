package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

import program.DataSource;
import models.TwitterModel;

public class DatabaseService {
	
	// Inserts reddit tweet information into database
	public void InsertRedditPost(String title, String imageUrl, boolean isPosted) throws SQLException
	{
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			BasicDataSource ds = DataSource.getInstance().getBasicDS();
			connection = ds.getConnection();
			String query = "INSERT INTO `reddittwitterbot`.`redditpost` (`title`, `media`, `isposted`) VALUES (?, ?, ?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, imageUrl);
			ps.setBoolean(3, isPosted);
			
			ps.executeUpdate();
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
	}
	
	// Gets reddit tweet that hasn't been posted yet
	public TwitterModel GetNonPostedTweet() throws SQLException{
		Connection connection = null;
		Statement stm = null;
		TwitterModel model = new TwitterModel();
		
		try {
			BasicDataSource ds = DataSource.getInstance().getBasicDS();
			connection = ds.getConnection();
			String query = "SELECT * FROM reddittwitterbot.redditpost WHERE isposted = 0";
			stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while (rs.next())
		      {
				model.setId(rs.getInt("id"));
				model.setTitle(rs.getString("title"));
				model.setImageUrl(rs.getString("media"));
				model.setIsPosted(rs.getBoolean("isposted"));
		      }
			
			return model;
		}
		finally {
			if(stm != null) {
				stm.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
	}
	
	// Updates reddit tweet to posted in twitter
	public void UpdatePostedTweet(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			BasicDataSource ds = DataSource.getInstance().getBasicDS();
			connection = ds.getConnection();
			String query = "UPDATE reddittwitterbot.redditpost SET isposted = 1 WHERE (id = ?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			ps.executeUpdate();
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
	}

	public boolean CheckForDuplicatePost(String imageUrl) throws SQLException {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			BasicDataSource ds = DataSource.getInstance().getBasicDS();
			connection = ds.getConnection();
			String query = "SELECT media FROM reddittwitterbot.redditpost WHERE media = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, imageUrl);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		}
		finally {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
		return false;
	}
}
