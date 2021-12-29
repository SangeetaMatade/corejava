package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.ClubDAO;
import com.xworkz.db.DTO.ClubDTO;

public class ClubScammer {

	public static void main(String[] args) throws SQLException {
		
		ClubDTO dto1 = new ClubDTO(7, "omsir", "btm", 0);
		
		ClubDAO dao = new ClubDAO();
		
		dao.save(dto1);
		
		//dao.delete(dto1);

	}

}
