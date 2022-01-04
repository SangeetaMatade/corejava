package com.xworkz.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.db.DTO.TrainDto;
import com.xworkz.db.util.Dbutil;

public class TrainDao {

	Connection mysql = null;

	public boolean save(TrainDto Traindto) throws SQLException {

		System.out.println("invoked save method");
		mysql = Dbutil.createConnection();

		try {
			String sql = "insert into hotels_details.train values(?,?,?,?,?,?,?)";
			PreparedStatement statement = mysql.prepareStatement(sql);
			statement.setObject(1, Traindto.getTid());
			statement.setObject(2, Traindto.getTrainNo());
			statement.setObject(3, Traindto.getBoarding());
			statement.setObject(4, Traindto.getDestination());
			statement.setObject(5, Traindto.getSeatNo());
			statement.setObject(6, Traindto.getPrice());
			statement.setObject(7, Traindto.getName());

			int rowsAffected = statement.executeUpdate();
			System.out.println(sql);
			System.out.println("total rows affected: " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			Dbutil.closeConnection(mysql);
		}

		return false;
	}

	public boolean deleteByTrainNo(String trainNo) {
		mysql = Dbutil.createConnection();

		try {

			String sql = "delete from hotels_details.train where traiNo=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			int rowsAffected = stat.executeUpdate();
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return false;

	}

	public boolean deleteByTrainNoAndTrainId(String TrainNo, int tid) {
		mysql = Dbutil.createConnection();

		try {

			String sql = "delete from hotels_details.train where traiNo=? and Tid=?";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, TrainNo);
			stat.setObject(2, tid);
			int rowsAffected = stat.executeUpdate();
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return false;
	}
	/*public TrainDto getByTrainNo(String trainNo)
	{
     mysql=Dbutil.createConnection();
		TrainDto dtoo=null;
		try {
			
			
			String sql="select * from hotels_details.train where traiNo=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int train_id=result.getInt(1);
				System.out.println("train_id- "+train_id);
				String train_no=result.getString(2);
				System.out.println("train_No - "+train_no);
				String boarding=result.getString(3);
				System.out.println("boarding - "+boarding);
				String destination=result.getString(4);
				System.out.println("destination -"+destination);
				int seat_No=result.getInt(5);
				System.out.println("seat_No- "+seat_No);
				double ticketPrice=result.getDouble(6);
				System.out.println("train_Price - "+ticketPrice);
				String classs=result.getString(7);
				System.out.println("Class - "+classs);
				String name=result.getString(8);
				System.out.println("name -"+name);
				
			dtoo=new TrainDto(int tid, String trainNo1, String boarding1, String destination1, int seatNo, int price, String name); 	
				return dtoo;
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		return null;
	}*/
	public TrainDto getByTrainNo(String trainNo)
	{
     mysql=Dbutil.createConnection();
		TrainDto dtoo=null;
		try {
			
			
			String sql="select * from hotels_details.train where traiNo=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, trainNo);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int train_id=result.getInt(1);
				System.out.println("train_id- "+train_id);
				String train_no=result.getString(2);
				System.out.println("train_No - "+train_no);
				String boarding=result.getString(3);
				System.out.println("boarding - "+boarding);
				String destination=result.getString(4);
				System.out.println("destination -"+destination);
				int seat_No=result.getInt(5);
				System.out.println("seat_No- "+seat_No);
				double ticketPrice=result.getDouble(6);
				System.out.println("train_Price - "+ticketPrice);
				//String classs=result.getString(7);
				//System.out.println("Class - "+classs);
				String name=result.getString(7);
				System.out.println("name -"+name);
				
			dtoo=new TrainDto(); 	
				return dtoo;
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			Dbutil.closeConnection(mysql);
		}
			
		
		return null;
	}
	public Collection<TrainDto> getAll() {

		mysql = Dbutil.createConnection();
		Collection<TrainDto> details = new ArrayList<TrainDto>();
		TrainDto dtos = new TrainDto();
		try {

			String sql = "select * from hotels_details.train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {

				int Train_id = result.getInt(1);
				int Train_no = result.getInt(2);
				String Boarding = result.getString(3);
				String Destination = result.getString(4);
				int Train_seat_No = result.getInt(5);
				int Train_Price = result.getInt(6);
				//String coach_class = result.getString(7);
				String name = result.getString(7);

				

				details.add(dtos);

				System.out.println("train_id: " + Train_id + " " + "train_no: " + Train_no + " " + "boarding: "
						+ Boarding + " " + "destinaation: " + Destination + "  " + "train_seat_No: " + Train_seat_No
						+ "  " + "price: " + Train_Price + "  " +    "name: "
						+ name);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return details;
	}
	/*public boolean updateDestinationByTrainNo(String newDest, String trainNo) {
		mysql = Dbutil.createConnection();
		try {

			String sql = "Update select * from hotels_details.train " + "set destination=?" + "where traiNo=? ";
			PreparedStatement stat = mysql.prepareStatement(sql);
			stat.setObject(1, newDest);
			stat.setObject(2, trainNo);
			int rowsAffected = stat.executeUpdate();
			if (rowsAffected == 1) {
				System.out.println("updated: " + rowsAffected);
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return false;
	}
	public int getMaxPrice() {
		mysql = Dbutil.createConnection();
		int maxPrice = 0;

		try {

			String sql = "select max(train_price) from train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				maxPrice = result.getInt(1);
				System.out.println("MaxPrice= " + maxPrice);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			DBUtil.closeConnection(mysql);
		}

		return maxPrice;
	}*/

	public int getMinPrice() {
		mysql = Dbutil.createConnection();
		int minPrice = 0;

		try {

			String sql = "select min(price) from hotels_details.train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				minPrice = result.getInt(1);
				System.out.println("MinPrice= " + minPrice);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return minPrice;
	}
	public int getMaxPrice() {
		mysql = Dbutil.createConnection();
		int maxPrice = 0;

		try {

			String sql = "select max(price) from hotels_details.train";
			PreparedStatement stat = mysql.prepareStatement(sql);
			ResultSet result = stat.executeQuery();
			while (result.next()) {
				maxPrice = result.getInt(1);
				System.out.println("MaxPrice= " + maxPrice);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			Dbutil.closeConnection(mysql);
		}

		return maxPrice;
	}
	public boolean updateDestinationAndBoardingByTrainNo(String newDest,String newBoarding,String trainNo)
	{
		mysql=Dbutil.createConnection();
		try {
			
			
			String sql="Update hotels_details.train "+ "set destination=?,boarding=?"+"where traiNo=? ";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, newDest);
			stat.setObject(2, newBoarding);
			stat.setObject(3, trainNo);
			int rowsAffected=stat.executeUpdate();
			if(rowsAffected==1)
			{
				System.out.println("updated new dest and new boarding: "+rowsAffected);
				return true;
			}
			
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			Dbutil.closeConnection(mysql);
		}
			
		
		
		return false;
	}
	
	
	public int getTotal()
	{
		mysql=Dbutil.createConnection();
		
		try {
			

			String sql="select count(*) from hotels_details.train";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in train_detailss table - "+count);
			return count;
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			Dbutil.closeConnection(mysql);
		}
		return 0;
	}
	



}


