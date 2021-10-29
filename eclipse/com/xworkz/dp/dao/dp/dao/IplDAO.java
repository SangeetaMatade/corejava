package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.IplDTO;

public class IplDAO {

	private IplDTO[] ipl = new IplDTO[10];
	private int count;

	public void save(IplDTO dto) {
		System.out.println("invoked save  dto");
		if (dto != null && this.count <this.ipl.length) {
			System.out.println();
			this.ipl[this.count++] = dto;
			System.out.println("invoked save method team name: ".concat(dto.getTeamName()));
		} else {
			System.err.println("array is full".concat(String.valueOf(count)));
		}
	}

	public void save(IplDTO dto, int index) {
		System.out.println("invoked save int"
				+ " overloaded");
		if (dto != null && index < this.ipl.length && index >= 0) {
			System.out.println();
			this.ipl[index] = dto;
			System.out.println("invoked save method ".concat(String.valueOf(index)));
		} else {
			System.err.println("index is updated".concat(String.valueOf(dto)));
		}
	}

	public int indexOccupied() {
		return this.count;
	}

	public boolean matchIplByName(String teamname) {
		for (int s = 0; s < this.ipl.length; s++) {
			IplDTO ref1 = this.ipl[s];
			if (ref1 != null) {
				System.out.println();
				System.out.println("ref1 in index is not null".concat(String.valueOf(s)));
				String tempname = ref1.getTeamName();
				System.err.println("matching  ".concat("team name found"));
				return true;
			}
		}

		return false;

	}
	public IplDTO[] getIpl() {
		return this.ipl;

}
}
