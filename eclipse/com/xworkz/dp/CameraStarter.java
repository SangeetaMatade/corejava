package com.xworkz.dp;

import com.xworkz.dp.dao.CameraDAO;
import com.xworkz.dp.dto.CameraDTO;
import com.xworkz.dp.dto.ClubDTO;

public class CameraStarter {

	public static void main(String[] args) {

		CameraDTO dto = new CameraDTO();
		CameraDAO dao = new CameraDAO();

		CameraDTO dto1 = new CameraDTO("canon", "SLR", 12, 16.000f, 14, 32);
		CameraDTO dto2 = new CameraDTO("nikon", "full frame", 13, 16.000f, 14, 32);
		CameraDTO dto3 = new CameraDTO("sony", "instant", 14, 16.000f, 14, 32);
		CameraDTO dto4 = new CameraDTO("samsung", "digitl", 11, 16.000f, 14, 32);

		dao.save(dto3);
		dao.delete(2);
		dao.update(1, dto2);
		CameraDTO[] dtos = dao.getcamera();
		dtos[0] = dto1;
		dtos[1] = dto2;
		dtos[2] = dto3;
		dtos[3] = dto4;

		for (int i = 0; i < dtos.length; i++) {
			CameraDTO dtos1 = dtos[i];
			if (dtos1 != null) {
			System.out.println(dtos1.getBatteryCapacity());
			System.out.println(dtos1.getCapacity());
			System.out.println(dtos1.getCompany());
			System.out.println(dtos1.getCost());
			System.out.println(dtos1.getPixel());
			System.out.println(dtos1.getType());
		}
		}
	}

}
