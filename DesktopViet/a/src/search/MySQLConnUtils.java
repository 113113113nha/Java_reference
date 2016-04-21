package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
		
		// 1- Declaration variable
		String hostName = "localhost";
	    String dbName = "mytest";
	    String userName = "root";
	    String passWord = "12345";
		
		return getMySQLConnection(hostName, dbName, userName, passWord);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String passWord) throws ClassNotFoundException, SQLException {

		//		Class.forName("com.mysql.jdbc.Driver");   // For java < 6
		String portConn = ":8080";
		String connectionURL = "jdbc:mysql://" + hostName + portConn + dbName;
		
		// 2- Connection
		Connection conn = DriverManager.getConnection(connectionURL, userName, passWord);
		return conn;
	}
}