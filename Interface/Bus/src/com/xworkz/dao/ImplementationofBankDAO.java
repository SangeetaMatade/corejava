package com.xworkz.dao;

import com.xworkz.dto.BankDTO;

public class ImplementationofBankDAO implements BankDAO {

	private BankDTO[] bank = new BankDTO[2];
	private int count = 0;

	@Override
	public boolean save(BankDTO dto) {
		if (dto != null) {
			for (int o = 0; o < bank.length; o++) {
				this.bank[o] = dto;
				System.out.println("it is not null it can save");
				return true;
			}
		} else {
			System.err.println("areey yar shit.....it is null");
		}

		return false;
	}

	@Override
	public BankDAO findbyname(String name) {
		if (name != null) {
			for (int bindi = 0; bindi < bank.length; bindi++) {
				if (bank[bindi] != null) {
					String kaju = bank[bindi].getName();
					System.out.println("if it is not null then dont worry i will find your name  ");
				} else {
					System.out.println("sorry name not found ");
				}
			}
		}
		System.err.println("i think it is null so name not found");
		return null;
	}

	@Override
	public void display() {
		for (int amul = 0; amul < bank.length; amul++) {
			if (bank[amul] != null) {

				System.out.println("name:  " + bank[amul].getName());
				System.out.println("location: " + bank[amul].getLocation());
				System.out.println("government:  " + bank[amul].isGovernment());

			} else {
				System.err.println("i cannot give all the above bank details if it i null");
			}
		}

	}

}
