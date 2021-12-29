package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.DTO.CityDTO;

public class CityScammer {

	public static void main(String[] args) throws SQLException {
		
		CityDTO city = new CityDTO(58216, "gadag");
		
		CityDAO dao = new CityDAO();
		
	//	dao.save(city);
		dao.delete(city);

	}

}
