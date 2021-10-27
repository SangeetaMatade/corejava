package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;

import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		WalletDTO dto = new WalletDTO("lather", "lather", 4, 100.0f, false);
		WalletDAO dao = new WalletDAO();
		WalletDTO dto1 = new WalletDTO("wrtam", "cotton", 8, 200.0f, true);
		WalletDTO dto2 = new WalletDTO("arif", "lather", 9, 500.0f, false);
		WalletDTO dto3 = new WalletDTO("bala", "silk", 10, 500.0f, true);

		dao.create(dto3);
		dao.update(dto2, 1);
		dao.delete(4);
		int lock = dao.indexoccupied();
		System.out.println(lock);
		dao.matchByCompanyname("arif");

		WalletDTO[] dtos = dao.getWallet();
		dtos[0] = dto1;
		dtos[1] = dto2;
		for (int i = 0; i < dtos.length; i++) {
			WalletDTO dtos1 = dtos[i];

			if (dtos1 != null) {
				System.out.println(dtos1.getCompanyname());
				System.out.println(dtos1.getMaterial());
				System.out.println(dtos1.getPrice());
				System.out.println(dtos1.getTotalcompartments());
				System.out.println(dtos1.isCoincompartment());

			}

		}
	}
}
