package connectdb;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
		
		return SQLServerConnUtils_SQLJDBC.getSQLServerConnection();
	}
}
