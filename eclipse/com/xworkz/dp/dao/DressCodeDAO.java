package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] dress = new DressCodeDTO[10];
	int count = 0;

	public void save(DressCodeDTO dto) {
		if (this.count < 0 && dto != null) {
			this.dress[this.count++] = dto;
			System.out.println("invoked save method".concat(String.valueOf(dto)));
		} else {
			System.out.println("array is full".concat(String.valueOf(count)));
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < dress.length) {
			this.dress[index] = null;
			System.out.println("index is deleted".concat(String.valueOf(index)));
		} else {
			System.out.println("index is null");
		}
	}

	public void update(int index, DressCodeDTO dto) {
		if (index >= 0 && index < dress.length && dto != null) {
			this.dress[index] = dto;
			System.out.println("the array is updated and not pointing to null".concat(String.valueOf(index)));
		} else {
			System.out.println("the index is updated".concat(String.valueOf(index)));
		}
	}

	public DressCodeDTO[] getDressCode() {
		return dress;
	}
}
