package com.xworkz.scammer;

import com.xworkz.dao.BankDAO;
import com.xworkz.dao.ImplementationofBankDAO;
import com.xworkz.dao.UserImplementationofBank;
import com.xworkz.dto.BankDTO;

public class BankScammer {

	public static void main(String[] args) {

		BankDTO dtos = new BankDTO("karnataka", "BTM", true);

		BankDAO miss = new ImplementationofBankDAO();

		UserImplementationofBank mess = new UserImplementationofBank(miss);
		mess.save(dtos);
		mess.display();
		mess.findbyname("karnataka");
	}

}
