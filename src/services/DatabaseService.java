package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import Program.DataSource;

public class DatabaseService {
	
	public void Insert(String title, String imageUrl) throws SQLException
	{
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			BasicDataSource ds = DataSource.getInstance().getBasicDS();
			connection = ds.getConnection();
			String query = "INSERT INTO `reddittwitterbot`.`redditpost` (`title`, `media`) VALUES (?, ?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, imageUrl);
			
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
	
	
}
