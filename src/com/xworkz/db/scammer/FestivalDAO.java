package com.xworkz.db.scammer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.DTO.FestivalDTO;
import com.xworkz.db.constant.DBconstant;

public class FestivalDAO {
	Connection mysql = null;

	public boolean save(FestivalDTO festDTO) throws SQLException {
		System.out.println("invoked save method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after driver class is loadded and registered ");
			mysql = DriverManager.getConnection(DBconstant.mysql_url, DBconstant.mysql_username,
					DBconstant.mysql_password);
			if (!mysql.isClosed()) {
				System.out.println("mysql is opened");
				String sql = "insert into festival values(" + festDTO.getId() + ",'" + festDTO.getName() + "','"
						+ festDTO.getState() + "'," + festDTO.getDate() + ")";
				System.out.println(sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected: "+rowsAffected);
				if (rowsAffected == 1) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} finally {
			if (mysql != null) {
				mysql.close();
				System.out.println("it is finally closed");

			}
		}
		return false;

	}

	public boolean delete(FestivalDTO dto1) throws SQLException {
		System.out.println("invoked delete method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after driver class is loadded and registered");
			mysql = DriverManager.getConnection(DBconstant.mysql_url, DBconstant.mysql_username,
					DBconstant.mysql_password);
			if (!mysql.isClosed()) {
				System.out.println("mysql is opened");
				String sql = "delete from festival where idFestival=3";
				System.out.println(sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected:" + rowsAffected);
				if (rowsAffected == 1) {
					return true;
				}
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
		return false;

	}

}
