package com.xworkz.dao;

import com.xworkz.dto.AirportDTO;

public interface AirportDAO {
	
	boolean save(AirportDTO airportDTO);
	
	AirportDAO findbyname(String name);
	
	void display();
	
	

}
