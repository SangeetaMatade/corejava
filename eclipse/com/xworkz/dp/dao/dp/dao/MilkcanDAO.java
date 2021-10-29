package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkcanDTO;
import com.xworkz.dp.dto.WalletDTO;

public class MilkcanDAO {
	MilkcanDTO[] milk = new MilkcanDTO[4];
	private int count;

	public void create(MilkcanDTO dto) {
		if (dto != null && this.count < this.milk.length) {
			System.out.println();
			this.milk[this.count] = dto;
			System.out.println("invoked create method: ".concat(String.valueOf(count)));
		} else {
			System.out.println("invoked create method: ".concat(String.valueOf(dto.getQuality())));

		}

	}

	public void create(MilkcanDTO dto, int index) {
		if (index >= 0 && index < this.milk.length && dto != null) {
			System.out.println();
			this.milk[index] = dto;
			System.out.println("invoked create overloading: ".concat(String.valueOf(index)));
		} else {
			System.out.println("index updated: ".concat(String.valueOf(dto)));
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < this.milk.length) {
			System.out.println();
			this.milk[index] = null;
			System.out.println("invoked delete ethod: ".concat(String.valueOf(index)));
		} else {
			System.out.println("updated delete method");
		}
	}

	public void update(MilkcanDTO dto, int index) {
		if (index >= 0 && index < this.milk.length & dto != null) {
			System.out.println();
			this.milk[index] = dto;
			System.out.println("invoked update method: ".concat(String.valueOf(index)));
		} else {
			System.out.println("updated update method: ".concat(String.valueOf(dto)));
		}
	}

	public int indexoccupied() {
		return this.count;
	}

	public boolean matchByquality(String quality) {
		System.out.println("invoked matchbyquality");
		System.out.println("name passed".concat(String.valueOf(quality)));
		for (int gudnyt = 0; gudnyt < this.milk.length; gudnyt++) {

			{
				MilkcanDTO ref = this.milk[gudnyt];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(gudnyt)));
					String qlty = ref.getQuality();
					System.out.println("matching ".concat(String.valueOf(gudnyt)));
					if (quality.endsWith(qlty)) {
						System.out.println("quality found");
						return true;
					}

				}

			}
		}
		return false;
	}

	public MilkcanDTO[] getmilk() {
		return this.milk;

	}
}
