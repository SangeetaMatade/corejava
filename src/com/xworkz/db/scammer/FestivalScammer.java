package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.DTO.FestivalDTO;

public class FestivalScammer {
	
	public static void main(String[] args) throws SQLException {
		
	
	
	FestivalDTO dto = new FestivalDTO(50, "diwali", 3, "karnatak");
	
	FestivalDAO dao = new FestivalDAO();
	
	dao.save(dto);
	
	
	}

}
