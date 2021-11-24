package com.xworkz.dao;

import com.xworkz.dto.AirportDTO;

public class AirportImplementation implements AirportDAO {

	private AirportDTO[] dto = new AirportDTO[7];
	private int count = 0;

	@Override
	public boolean save(AirportDTO airportDTO) {
		if (airportDTO != null) {
			for (int pani = 0; pani < dto.length; pani++) {
				this.dto[pani] = airportDTO;
				System.out.println("it is not null");
				return true;
			}
		} else {
			System.err.println("it is null so i cannot save your name");
		}

		return false;
	}

	@Override
	public AirportDAO findbyname(String name) {
		if (name != null) {
			System.out.println("it is not null");
			for (int n = 0; n < dto.length; n++) {
				if (dto[n] != null) {
					String name1 = dto[n].getName();
					if (name.equals(name1)) {
						System.out.println("name found: ".concat(name));
					} else {
						System.out.println("name not found");
					}
				}
			}
		}
		System.err.println("may be it is null");
		return null;
	}

	@Override
	public void display() {
		for (int k = 0; k < dto.length; k++) {
			if (dto[k] != null) {
				System.out.println("name: " + dto[k].getName());
				System.out.println("location: " + dto[k].getLocation());
				System.out.println("type: " + dto[k].isType());
			} else {
				System.err.println("i cannot display allthese bcz they all may be null");
			}
		}
	}
}
