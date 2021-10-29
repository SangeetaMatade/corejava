package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TempleDTO;

public class TempleDAO {
	TempleDTO[] temp = new TempleDTO[10];
	int count = 0;

	public void save(TempleDTO dto) {
		if (this.count < 0 && dto != null) {
			this.temp[this.count++] = dto;
			System.out.println("invoked save method".concat(String.valueOf(dto)));
		} else {
			System.out.println("array is full".concat(String.valueOf(count)));
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < temp.length) {
			this.temp[index] = null;
			System.out.println("index is deleted".concat(String.valueOf(index)));
		} else {
			System.out.println("index is null");
		}
	}

	public void update(int index, TempleDTO dto) {
		if (index >= 0 && index < temp.length && dto != null) {
			this.temp[index] = dto;
			System.out.println("the array is updated and not pointing to null".concat(String.valueOf(index)));
		} else {
			System.out.println("the index is updated".concat(String.valueOf(index)));
		}
	}

	public TempleDTO[] getTemple() {
		return temp;
	}

}
