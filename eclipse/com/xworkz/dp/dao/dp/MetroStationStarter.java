package com.xworkz.dp;

import com.xworkz.dp.dao.MetroStationDAO;
import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationStarter {

	public static void main(String[] args) {

		MetroStationDTO dto = new MetroStationDTO();
		MetroStationDAO dao = new MetroStationDAO();

		MetroStationDTO dto1 = new MetroStationDTO("BTM", "rajajinagar", false, 9.0f, 6.0f);
		MetroStationDTO dto2 = new MetroStationDTO("vidhansaudha", "megestic", true, 9.0f, 6.0f);
		MetroStationDTO dto3 = new MetroStationDTO("Srirmpura", "malleshwaram", false, 9.0f, 6.0f);
		MetroStationDTO dto4 = new MetroStationDTO("chikpete", "s p road", true, 9.0f, 6.0f);

		
		dao.save(dto4);
		dao.delete(2);
		dao.update(dto3, 1);
		MetroStationDTO[] dtos = dao.getmetrostation();
		dtos[0] = dto1;
		dtos[1] = dto3;
		dtos[2] = dto4;

		for (int i = 0; i < dtos.length; i++) {
			MetroStationDTO dtos1 = dtos[i];
			if (dtos1 != null) {
			System.out.println(dtos1.getClosetime());
			System.out.println(dtos1.getName());
			System.out.println(dtos1.getOpentime());
			System.out.println(dtos1.getRoute());
			System.out.println(dtos1.isElevator());
		}

	}
	}
}
