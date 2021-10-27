package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.MilkcanDTO;

public class DoctorDAO {
	DoctorDTO[] doctor = new DoctorDTO[4];
	private int count;

	public void create(DoctorDTO dto) {
		if (dto != null && this.count < this.doctor.length) {
			System.out.println();
			this.doctor[this.count] = null;
			System.out.println("invoked create method: ".concat(String.valueOf(count)));
		} else {
			System.out.println("invoked create method: ".concat(String.valueOf(dto)));
		}
	}

	public void create(DoctorDTO dto, int index) {
		System.out.println("invoked overloading string" + "invoked overloading int");
		if (index >= 0 && index < this.doctor.length && dto != null) {
			System.out.println();
			this.doctor[index] = dto;
			System.out.println("invoked  overloading: ".concat(String.valueOf(index)));
		} else {
			System.out.println("index is updated: ".concat(String.valueOf(dto)));
		}
	}

	public int indexOccupied() {
		return this.count;
	}

	public boolean matchByname(String name) {
		System.out.println("invoked matchbyname");
		System.out.println("name passed".concat(name));
		for (int gudnyt = 0; gudnyt < this.doctor.length; gudnyt++) {

			{
				DoctorDTO ref = this.doctor[gudnyt];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(gudnyt)));
					String nme = ref.getName();
					System.out.println("matching ".concat(nme));
					if (name.endsWith(nme)) {
						System.out.println("name found");
						return true;
					}
				}
			}

		}
		return false;

	}
	public DoctorDTO[] getDoctor() {
		return this.doctor;

}
}
