package com.xworkz.dp;

import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.IplDTO;

public class IplStarter {

	public static void main(String[] args) {
		IplDTO dtoss = new IplDTO("RCB", 24, "ucl", "VIVO", 12);
		IplDAO dao = new IplDAO();
		IplDTO dtoss1 = new IplDTO("KKR", 24, "Sharukh", "jio", 12);
		IplDTO dtoss2 = new IplDTO("MI", 24, "ambani", "jio", 12);
		IplDTO dtoss3 = new IplDTO("CSK", 24, "dhoni", "oppo", 12);
		IplDTO dtoss4 = new IplDTO("DC", 24, "virat", "apple", 12);

		dao.save(dtoss1);
		dao.save(dtoss2, 3);
		int lock=dao.indexOccupied();
		System.out.println(lock);
		
		dao.matchIplByName("MI");
		IplDTO[] dtosss = dao.getIpl();
		dtosss[0] = dtoss1;
		dtosss[1] = dtoss2;
		for (int i = 0; i < dtosss.length; i++) {
			IplDTO dtosss1 = dtosss[i];

			if (dtosss1 != null) {
				System.out.println(dtosss1.getNoOfplayers());
				System.out.println(dtosss1.getNoOfTeams());
				System.out.println(dtosss1.getOwner());
				System.out.println(dtosss1.getSponsors());
				System.out.println(dtosss1.getTeamName());
	}

}
	}
}
