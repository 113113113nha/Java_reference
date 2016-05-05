package useConnectDB;

import connectdb.*;
import java.sql.*;


public class connectUtilsclass {

	public static void main(String[] args) {

		// Get connection
				Connection connection = null;
				try {
					connection = ConnectionUtils.getMyConnection();
					
					System.out.println("Working with DB: ");
					// ------------
					// Statement
					Statement statement = connection.createStatement();

					String query = "SELECT * FROM DanhsachHS";

					// Execute SQL statement -> REsultset
					ResultSet result = statement.executeQuery(query);

					int id;
					String phone = null;
					String name = null;
					while (result.next()) {
						id = result.getInt(1);
						name = result.getString(2);
						phone = result.getString("Phone");

						System.out.println("--------------------");
						System.out.println("STT:" + id);
						System.out.println("Name:" + name);
						System.out.println("Phone:" + phone);
					}
					// ------------

				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				} finally {
					if (connection != null)
						try {
							connection.close();
						} catch (Exception e) {
						}
				}
			}

		}
