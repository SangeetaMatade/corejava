package com.xworkz.dao;

import com.xworkz.dto.AirportDTO;

public class UserImplementaionofAirport {

	AirportDAO dao;

	public UserImplementaionofAirport(AirportDAO dao) {
		this.dao = dao;
	}

	public void save(AirportDTO lto) {
		if (lto != null) {
			boolean dance = dao.save(lto);
			if (dance) {
				System.out.println("+++++++++++++++++++");
			} else {
				System.out.println("i will not save it");
			}
		} else {
			System.out.println("u may pass null");

		}

	}

	public void findbyname(String lto) {
		if (lto != null) {
			this.dao.findbyname(lto);
		} else {
			System.out.println("null");
		}
	}

	public void display() {
		if (dao != null) {
			dao.display();
		}

	}

}
