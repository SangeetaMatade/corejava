package com.xworkz.dp;

import com.xworkz.dp.dao.ApplicationDAO;
import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;

public class ApplicationStarter {
	public static void main(String[] args) {
		
		ApplicationDTO applicationdto=new ApplicationDTO();
		ApplicationDAO applicationdao=new ApplicationDAO();
		ApplicationDTO applicationdto1=new ApplicationDTO("facebook", 3.3f, "oracle", "xyz");
		ApplicationDTO applicationdto2=new ApplicationDTO("instagram", 4.8f, "hcl", "xyz2");
		ApplicationDTO applicationdto5=new FacebookApplicationDTO("sanjota","banglore");
		ApplicationDTO applicationdto6=new FacebookApplicationDTO("spoorti","hubli");
		
		applicationdao.save(applicationdto6);
		applicationdao.displayAllapplicationDTOs();
		
		boolean ref=applicationdao.getapplicationDTObyName("sanjota");
		System.out.println(ref);
		
		
		
	}
		
		
		
		
		
		

}
