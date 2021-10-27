package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {

		DressCodeDTO dto = new DressCodeDTO();
		DressCodeDAO dao = new DressCodeDAO();

		DressCodeDTO dto1 = new DressCodeDTO("small", "cotton", "black", 100.0f, "femail");
		DressCodeDTO dto2 = new DressCodeDTO("XL", "silk", "red", 200.0f, "mail");
		DressCodeDTO dto3 = new DressCodeDTO("XXL", "nailon", "green", 300.0f, "mail");
		DressCodeDTO dto4 = new DressCodeDTO("medium", "velvet", "brown", 400.0f, "femail");

		dao.save(dto1);
		dao.delete(2);
		dao.update(3, dto1);
		DressCodeDTO[] dtos = dao.getDressCode();
		dtos[0] = dto1;
		dtos[1] = dto2;
		for (int i = 0; i < dtos.length; i++) {
			DressCodeDTO dtos1 = dtos[i];

			if (dtos1
					!= null) {
				System.out.println(dtos1.getColor());
				System.out.println(dtos1.getMateril());
				System.out.println(dtos1.getPrice());
				System.out.println(dtos1.getSize());
				System.out.println(dtos1.Gender());
			}
		}

	}

}
