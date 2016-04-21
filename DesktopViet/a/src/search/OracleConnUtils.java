package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnUtils {

	public static Connection getOracleConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String sid = "db11g";
		String userName = "testsimple";
		String password = "1234";

		return getOracleConnection(hostName, sid, userName, password);
	}

	public static Connection getOracleConnection(String hostName, String sid, String userName, String password)
			throws ClassNotFoundException, SQLException {

//		Class.forName("oracle.jdbc.driver.OracleDriver");

		//jdbc:oracle:thin:@localhost:1521:db11g
		String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}
