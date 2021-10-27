package com.xworkz.dp;

import com.xworkz.dp.dao.BucketDAO;
import com.xworkz.dp.dto.BucketDTO;
import com.xworkz.dp.dto.TempleDTO;

public class BucketStarter {

	public static void main(String[] args) {
		BucketDTO dto=new BucketDTO();
		BucketDAO dao=new BucketDAO();
		
		BucketDTO dto1=new BucketDTO("silver", 22, 100.0f, 20, 200, "plastic");
		BucketDTO dto2=new BucketDTO("black", 21, 200.0f, 30, 300, "steel");
		BucketDTO dto3=new BucketDTO("white", 31, 50.0f, 10, 100, "xyz");
		BucketDTO dto4=new BucketDTO("green", 41, 60.0f, 30, 20, "sss");
		BucketDTO dto5=new BucketDTO("cream", 11, 70.0f, 22, 7, "ser");
		
		dao.save(dto5);
		dao.delete(1);
		dao.update(03, dto3);
		BucketDTO[] dtos=dao.getBucket();
		dtos[0] = dto1;
		dtos[1] = dto2;
		dtos[2] = dto3;
		dtos[3] = dto4;
		
		
		
		for (int i = 0; i < dtos.length; i++) {
			BucketDTO dtos1 = dtos[i];

			if (dtos1 != null) {
				System.out.println(dtos1.getColor());
				System.out.println(dtos1.getSize());
				System.out.println(dtos1.getCompany());
				System.out.println(dtos1.getPrice());
				System.out.println(dtos1.getWeight());
				System.out.println(dtos1.getQuantity());
				
			    
				
			}
		}
		
		
		
		

	}

}
