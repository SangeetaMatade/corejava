package com.xworkz.scammer;

import com.xworkz.dao.BusRouteDAO;
import com.xworkz.dao.BusRouteImplementation;
import com.xworkz.dao.UserImplementation;
import com.xworkz.dto.BusRouteDTO;

public class BusRouteScammer {

	public static void main(String[] args) {
	BusRouteDTO dto = new BusRouteDTO("BTM", false, "xyz");
	
	BusRouteDAO dao = new BusRouteImplementation();

	UserImplementation user = new UserImplementation(dao);
	user.save(dto);
	user.displaydetails();
	user.findbyname("xyz");
	}

}
