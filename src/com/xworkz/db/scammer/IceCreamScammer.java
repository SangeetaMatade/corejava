package com.xworkz.db.scammer;

import java.sql.SQLException;

import com.xworkz.db.DTO.IceCreamDTO;

public class IceCreamScammer {

	public static void main(String[] args) throws SQLException {
		
		IceCreamDTO ice = new IceCreamDTO(90, "straberry", "Straberrycone", 50.0f);
		
		IceCreamDAO dao =new IceCreamDAO();
		
		dao.save(ice);
		
		
	}

}
