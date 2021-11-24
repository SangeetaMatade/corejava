package com.xworkz.dao;

import com.xworkz.dto.BusRouteDTO;

public interface BusRouteDAO {

	boolean save(BusRouteDTO busRouteDTO);

	BusRouteDTO findbyname(String name);

	void displaydetails();

}
