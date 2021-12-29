package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/songs";
		String username = "root";
		String password = "Sanjota#1234";
		Connection mysql = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after driver class is loaded and registerd");
			mysql = DriverManager.getConnection(url, username, password);
			if (!mysql.isClosed()) {
				System.out.println("mysql is opened");
				String sql = "insert into club values(20,'night club','mal')";
				
				
				
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected:"+ rowsAffected);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (mysql != null) {
				mysql.close();
				System.out.println("it is finally closed");
			}
		}
	}

}
