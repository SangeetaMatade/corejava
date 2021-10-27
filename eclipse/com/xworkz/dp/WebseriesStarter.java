package com.xworkz.dp;

import com.xworkz.dp.dao.WebseriesDAO;
import com.xworkz.dp.dto.WebseriesDTO;

public class WebseriesStarter {
	public static void main(String[] args) {
		WebseriesDTO dto = new WebseriesDTO();
		WebseriesDAO dao = new WebseriesDAO();
		WebseriesDTO dto1 = new WebseriesDTO("Lucifer", Genre.CRIME, 5);
		WebseriesDTO dto2 = new WebseriesDTO("Utopia", Genre.ACTION, 5);
		WebseriesDTO dto3 = new WebseriesDTO("Black suumer", Genre.HORROR, 5);
		dao.save(dto1);
		dao.delete(2);
		dao.update(2, dto1);
		WebseriesDTO[] dtos = dao.getWebseries();
		dtos[0] = dto1;
		dtos[1] = dto2;
		for (int i = 0; i < dtos.length; i++) {
			WebseriesDTO dtos1 = dtos[1];

			if (dtos != null) {
				System.out.println(dtos1.getName());
				System.out.println(dtos1.getRating());
				System.out.println(dtos1.getGenre());
			}
		}

	}
}
