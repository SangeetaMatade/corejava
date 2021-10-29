package com.xworkz.dp.dto;

import com.xworkz.dp.BusDriverDTO;

public class BusDriverStarterDTO {

	public static void main(String[] args) {
		BusDriverDTO bus = new BusDriverDTO();

		BusDriverDTO bus1 = new BusDriverDTO("shantesh", 2, true, 2500.0f, "banglore");
		BusDriverDTO bus2 = new BusDriverDTO("mantesh", 1, false, 3500.0f, "dharwad");
		BusDriverDTO bus3 = new BusDriverDTO("krishna", 2, true, 45000.0f, "manglore");
		BusDriverDTO bus4 = new BusDriverDTO("prakash", 3, true, 55000.0f, "hubli");

		BusDriverDTO[] pg = new BusDriverDTO[4];
		pg[1] = bus4;
		pg[2] = bus3;
		// pg[3]=bus2;
		for (int sangeeta = 0; sangeeta < pg.length; sangeeta++) {
			System.out.println("invoked array");
			BusDriverDTO ink = pg[sangeeta];
			if (ink != null) {
				System.out.println(ink.getLocation());
				System.out.println(ink.getName());
				System.out.println(ink.getSalary());
				System.out.println(ink.getShifts());
				System.out.println(ink.isWork());
			} else {
				System.err.println("index is null");
			}
		}
	}
}
