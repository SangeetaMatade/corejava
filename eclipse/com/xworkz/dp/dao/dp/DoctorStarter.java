package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.MilkcanDTO;

public class DoctorStarter {

	public static void main(String[] args) {
		DoctorDTO dtos = new DoctorDTO("harish", "dermatalogy", "pulse", false, 16000, 30);
		DoctorDAO dao = new DoctorDAO();
		DoctorDTO dtos1 = new DoctorDTO("mahesh", "pedatrics", "medplus", false, 17000, 32);
		DoctorDTO dtos2 = new DoctorDTO("suresh", "anasthesiology", "appolo", true, 20000, 35);
		DoctorDTO dtos3 = new DoctorDTO("maneesha", "ophthalmology", "sagar", true, 16000, 30);

		dao.create(dtos3);
		dao.create(dtos2, 1);
		int lock = dao.indexOccupied();
		System.out.println(lock);
		dao.matchByname("harish");
		DoctorDTO[] dtoss = dao.getDoctor();
		dtoss[0] = dtos1;
		dtoss[1] = dtos2;
		for (int i = 0; i < dtoss.length; i++) {
			DoctorDTO dtoss1 = dtoss[i];

			if (dtos1 != null) {
				System.out.println(dtoss1.getAge());
				System.out.println(dtoss1.getHospitalname());
				System.out.println(dtoss1.getName());
				System.out.println(dtoss1.getSalary());
				System.out.println(dtoss1.getSpecilization());
	}

}
	}
}
