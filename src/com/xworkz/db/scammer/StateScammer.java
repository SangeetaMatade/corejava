package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.DTO.StateDTO;

public class StateScammer {

	public static void main(String[] args) throws SQLException {
		
		StateDTO state = new StateDTO(90, "karntaka", 91, "banglore");
		
		StateDAO dao = new StateDAO();
		
		//dao.save(state);
		dao.delete(state);
		
	}

}
