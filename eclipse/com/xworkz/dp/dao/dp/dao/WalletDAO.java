package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MovieDTO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {

	WalletDTO[] wallet = new WalletDTO[5];
	private int count;

	public void create(WalletDTO dto) {
		if (dto != null && this.count < this.wallet.length) {
			System.out.println();
			this.wallet[this.count] = dto;
			System.out.println("invoked create method: ".concat(String.valueOf(count)));

		} else {
			System.out.println("invoked create method: ".concat(String.valueOf(dto.getCompanyname())));
		}

	}

	public void create(WalletDTO dto, int index) {
		if (dto != null && index >= 0 && index < this.wallet.length) {
			System.out.println();
			this.wallet[index] = dto;
			System.out.println("invoked overloaded string " + "invoked overloaded int".concat(String.valueOf(index)));

		} else {
			System.out.println("invoked create overloding ".concat(String.valueOf(dto)));
		}
	}

	public int indexoccupied() {
		return this.count;
	}

	public void delete(int index) {
		if (index >= 0 && index < this.wallet.length) {
			System.out.println();
			this.wallet[index] = null;
			System.out.println("invoked delete method: ".concat(String.valueOf(index)));
		} else {
			System.out.println("index is pointing to null");
		}
	}

	public void update(WalletDTO dto, int index) {
		if (index >= 0 && index < this.wallet.length && dto != null) {
			System.out.println();
			this.wallet[index] = dto;
			System.out.println("invoked update method: ".concat(String.valueOf(index)));
		} else {
			System.out.println("updted: ".concat(String.valueOf(dto)));

		}
	}

	public boolean matchByCompanyname(String name) {
		System.out.println("invoked matchbyCompanyname");
		System.out.println("name passed".concat(String.valueOf(name)));
		for (int gudnyt = 0; gudnyt < this.wallet.length; gudnyt++) {

			{
				WalletDTO ref = this.wallet[gudnyt];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(gudnyt)));
					String nme = ref.getCompanyname();
					System.out.println("matching ".concat(String.valueOf(gudnyt)));
					if (name.endsWith(nme)) {
						System.out.println("name found");
						return true;
					}

				}
			}
		}
		return false;
	}

	public WalletDTO[] getWallet() {

		return wallet;
	}
}
