package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.DTO.CountryDTO;

public class CountryScammer {

	public static void main(String[] args) throws SQLException {
		
		CountryDTO country = new CountryDTO(9,"India","asia",91);
		
		CountryDAO dao = new CountryDAO();
		
		//dao.save(country);
		
		dao.delete(country);

	}

}
