package program;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataSource {
	
	 public DataSource()
	 {
		 Properties properties = getProperties();
		 DB_CONNECTION_URL = properties.getProperty("db.url");
		 DB_USER = properties.getProperty("db.user");
		 DB_PWD = properties.getProperty("db.password");
	 }
	 
	 public static String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	 public static String DB_CONNECTION_URL;
	 public static String DB_USER;
	 public static String DB_PWD;
	 private static DataSource ds;
	 
	 private BasicDataSource basicDS = new BasicDataSource();
	 public BasicDataSource getBasicDS() {
		 basicDS.setDriverClassName(DRIVER_CLASS);
		 basicDS.setUrl(DB_CONNECTION_URL);
		 basicDS.setUsername(DB_USER);
		 basicDS.setPassword(DB_PWD);
 		  
		 basicDS.setInitialSize(10);
		 basicDS.setMaxTotal(10);
		 return basicDS;
	 }
	 public void setBasicDS(BasicDataSource basicDS) {this.basicDS = basicDS;}

	 public static DataSource getInstance(){
		 if(ds == null){
			 ds = new DataSource();
		 }
		 return ds;
	 }
 
	 public Properties getProperties() {

	        try (InputStream input = new FileInputStream("db.properties")) {

	            Properties prop = new Properties();
	            prop.load(input);
	            
	         return prop;

	        } catch (IOException ex) {
	            ex.printStackTrace();
	            return null;
	        }
			

	    }
}