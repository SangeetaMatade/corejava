package com.xworkz.dp;

import com.xworkz.dp.dto.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;
import com.xworkz.dp.dto.MovieDTO;

public class LawyerStarter {

	public static void main(String[] args) {

		LawyerDTO dtos = new LawyerDTO();
		LawyerDAO dao = new LawyerDAO();

		LawyerDTO dtos1 = new LawyerDTO("sangeeta", "LLB", 15, true, 22, "highcouart", 4, 2);
		LawyerDTO dtos2 = new LawyerDTO("sanjota", "MLB", 12, false, 25, "supreemcourt", 6, 2);
		LawyerDTO dtos3 = new LawyerDTO("varsha", "LLb", 10, false, 21, "court", 3, 1);
		LawyerDTO dtos4 = new LawyerDTO("teju", "MLB", 9, true, 21, "highcourt", 8, 2);
		LawyerDTO dtos5 = new LawyerDTO("akshu", "LLB", 7, false, 20, "court", 6, 2);

		dao.save(dtos1);
		//dao.save(dto2);
		//dao.save(dto3);
		//dao.save(dto4);
		//dao.save(dto5);
		//dao.delete();
		dao.save(dtos5, 02);
		

		boolean lock = dao.getExpbyName("sangeeta");
		System.out.println(lock);
		
		
		
		boolean lock2 = dao.searchbyName("akshu");
		System.out.println(lock2);
		dao.getLawyerwithMaxexp();
		boolean lock3 = dao.getExpbyName("teju");
		System.out.println(lock3);
	}
}