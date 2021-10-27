package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;

import com.xworkz.dp.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {

		TimerDTO dto = new TimerDTO();
		TimerDAO dao = new TimerDAO();
		TimerDTO dto1 = new TimerDTO(false, true, "digital", false);
		TimerDTO dto2 = new TimerDTO(true, false, "analog", true);
		TimerDTO dto3 = new TimerDTO(false, true, "electronic", false);
		TimerDTO dto4 = new TimerDTO(false, false, "electrical", false);

		dao.create(dto3);

		dao.delete(4);
		int lock = dao.indexoccupied();
		System.out.println(lock);
		dao.matchBybrand("good");

		TimerDTO[] dtos = dao.gettimer();
		dtos[0] = dto1;
		dtos[1] = dto2;
		for (int i = 0; i < dtos.length; i++) {
			TimerDTO dtos1 = dtos[i];

			if (dtos1 != null) {
				System.out.println(dtos1.getBrand());
				System.out.println(dtos1.isBell());
				System.out.println(dtos1.isCorrecttime());
				System.out.println(dtos1.isWorking());

			}

		}
	}
}
