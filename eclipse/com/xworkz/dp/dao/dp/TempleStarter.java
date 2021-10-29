package com.xworkz.dp;

import com.xworkz.dp.dao.TempleDAO;
import com.xworkz.dp.dto.TempleDTO;




public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO dto = new TempleDTO();
		TempleDAO dao = new TempleDAO();

		TempleDTO dto1 = new TempleDTO("venkateshwartemple", "tirupati", "venkteshwar", true, 6);
		TempleDTO dto2 = new TempleDTO("Shreekrishnatemple", "brundavana", "krishna", true, 5);
		TempleDTO dto3 = new TempleDTO("Banshankritemple", "banshankri", "banshankri", true, 4);
		TempleDTO dto4 = new TempleDTO("vigneshwartemple", "idugunji", "ganesha", true, 3);

		dao.save(dto4);
		dao.delete(2);
		dao.update(1, dto4);
		TempleDTO[] dtos = dao.getTemple();
		dtos[0] = dto1;
		dtos[2] = dto3;

		
		for (int i = 0; i < dtos.length; i++) {
			TempleDTO dtos1 = dtos[i];

			if (dtos1 != null) {
				System.out.println(dtos1.getLocation());
				System.out.println(dtos1.getMainGod());
				System.out.println(dtos1.getName());
				System.out.println(dtos1.getYestgante());
				System.out.println(dtos1.isPrasada());
			}
		}

	}

}
