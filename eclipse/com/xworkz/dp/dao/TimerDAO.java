package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkcanDTO;
import com.xworkz.dp.dto.TimerDTO;
import com.xworkz.dp.dto.WalletDTO;

public class TimerDAO {

	TimerDTO[] tim = new TimerDTO[5];
	private int count;

	public void create(TimerDTO dto) {
		if (dto != null && this.count < this.tim.length) {
			System.out.println();
			this.tim[this.count] = dto;
			System.out.println("invoked create method: ".concat(String.valueOf(count)));
		} else {
			System.out.println("invoked create method: ".concat(String.valueOf(dto)));
		}
	}

	public void create(TimerDTO dto, int index) {
		if (dto != null && index >= 0 && index < this.tim.length) {
			System.out.println();
			this.tim[index] = dto;
			System.out.println("invoked overloading: ".concat(String.valueOf(index)));
		} else {
			System.out.println("index update: ".concat(String.valueOf(dto)));
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < this.tim.length) {
			System.out.println();
			this.tim[index] = null;
			System.out.println("invoked delete method: ".concat(String.valueOf(index)));
		} else {
			System.out.println("updated delete");
		}
	}

	public int indexoccupied() {
		return this.count;
	}

	public boolean matchBybrand(String brand) {
		System.out.println("invoked matchbyCompanybrand");
		System.out.println("name passed".concat(String.valueOf(brand)));
		for (int gudnyt = 0; gudnyt < this.tim.length; gudnyt++) {

			{
				TimerDTO ref = this.tim[gudnyt];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(gudnyt)));
					String bnd = ref.getBrand();
					System.out.println("matching ".concat(String.valueOf(gudnyt)));
					if (brand.endsWith(bnd)) {
						System.out.println("name found");
						return true;
					}
				}
			}
		}
		return false;
	}

	public TimerDTO[] gettimer() {
		return this.tim;
	}
}
