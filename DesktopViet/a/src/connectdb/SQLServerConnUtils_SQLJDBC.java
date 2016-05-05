package connectdb;

import java.sql.*;

public class SQLServerConnUtils_SQLJDBC {
	public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException {
		// Parameters
				String hostName = "localhost";
				String port = "1433";
				String sqlInstanceName = "instance=SQLEXPRESS";
				String database = "testmydb";
				String userName = "sa";
				String password = "arisvnserver";

				return getSQLServerConnection(hostName, port, sqlInstanceName, database, userName, password);
			}

			public static Connection getSQLServerConnection(String hostName, String port, String sqlInstanceName, String database,
					String userName, String passWord) throws ClassNotFoundException, SQLException {

				/**
				 * 
				 * Syntax URL Connection of SQLServer:
				 * jdbc:sqlserver://ServerIp:1433;instance=SQLEXPRESS;databaseName=testmydb
				 * 
				 */

				String connectionURL = "jdbc:sqlserver://" 
										+ hostName + ":" + port + ";" 
										+ sqlInstanceName + ";" 
										+ "databaseName=" + database;

				Connection conn = DriverManager.getConnection(connectionURL, userName, passWord);
				System.out.println("Connected: " + connectionURL);
				System.out.println("--------------------");
				return conn;
			}

		}
