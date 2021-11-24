package com.xworkz.dao;

import com.xworkz.dto.BankDTO;

public interface BankDAO {

	boolean save(BankDTO dto);

	BankDAO findbyname(String name);

	void display();

}
