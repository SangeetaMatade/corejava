package com.xworkz.dao;

import com.xworkz.dto.BankDTO;

public class UserImplementationofBank {

	BankDAO dao;
	public UserImplementationofBank(BankDAO dao) {
this.dao=dao;
	}

	public void save(BankDTO otd) {
		if (otd != null) {
			boolean m = dao.save(otd);
			if (m) {
				System.out.println("////////");
			} else {
				System.out.println("not saved");
			}
		} else {
			System.err.println("null");
		}
	}

	public void findbyname(String name) {
		if (name != null) {
			this.dao.findbyname(name);
		} else {
			System.err.println("null");
		}
	}

	public void display() {
		if (dao != null) {
			dao.display();
		}
	}

}
