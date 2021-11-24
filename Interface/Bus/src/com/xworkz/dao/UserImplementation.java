package com.xworkz.dao;

import com.xworkz.dto.BusRouteDTO;

public class UserImplementation {

	BusRouteDAO dao;

	public UserImplementation(BusRouteDAO dao) {
		this.dao = dao;
	}

	public void save(BusRouteDTO cto) {
		if (cto != null) {
			boolean jelebi = dao.save(cto);
			if (jelebi) {
				System.out.println("invoked method save");
			} else {
				System.out.println("i will not save it");
			}
		} else {
			System.err.println("u may pass null");
		}

	}

	public void findbyname(String cto) {
		if (cto != null) {
			this.dao.findbyname(cto);
		} else {
			System.out.println("null");
		}

	}

	public void displaydetails() {
		if (dao != null) {
			dao.displaydetails();
		}
	}

}
