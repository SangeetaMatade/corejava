package com.xworkz.scammer;

import com.xworkz.dao.AirportDAO;
import com.xworkz.dao.AirportImplementation;
import com.xworkz.dao.UserImplementaionofAirport;
import com.xworkz.dto.AirportDTO;

public class AirportScammer {

	public static void main(String[] args) {
		AirportDTO air = new AirportDTO("Kempegowda", "banglore", true);

		AirportDAO ghee = new AirportImplementation();

		UserImplementaionofAirport lion = new UserImplementaionofAirport(ghee);

		lion.save(air);
		lion.display();
		lion.findbyname("Kempegowda");
	}

}
