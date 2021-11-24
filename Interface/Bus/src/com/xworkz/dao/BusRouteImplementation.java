package com.xworkz.dao;

import com.xworkz.dto.BusRouteDTO;

public class BusRouteImplementation implements BusRouteDAO {

	private BusRouteDTO[] Bus = new BusRouteDTO[3];
	private int count = 0;

	@Override
	public boolean save(BusRouteDTO busRouteDTO) {
		if (busRouteDTO != null) {
			System.out.println("busRouteDTO is not null");
			for (int i = 0; i < Bus.length; i++) {
				this.Bus[i] = busRouteDTO;
				return true;
			}
		} else {
			System.out.println("array is full so i cannot save your given name");
		}

		return false;
	}

	@Override
	public BusRouteDTO findbyname(String name) {
		if (name != null) {
			System.out.println("no problem i have checke it move on");
			for (int k = 0; k < this.Bus.length; k++) {
				if (Bus[k] != null) {
					String name1 = Bus[k].getDriverName();
					if (name1.equals(name)) {
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
	public void displaydetails() {
		for (int m = 0; m < Bus.length; m++) {
			if (Bus[m] != null) {
				System.out.println("StartPoint: " + Bus[m].getStartPoint());
				System.out.println("Destination: " + Bus[m].isDestination());
				System.out.println("DriverName: " + Bus[m].getDriverName());
			} else {
				System.out.println("BusRoute details are not correct");
			}
		}

	}

}
