package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;

import com.xworkz.dp.dto.MovieDTO;
import com.xworkz.dp.dto.TimerDTO;

public class MovieStarter {

	public static void main(String[] args) {
		MovieDTO dtos = new MovieDTO("Krish", "Rakesh Roshan", " Hrithik roshan", 5, "Rakesh Roshan");
		MovieDAO dao = new MovieDAO();
		MovieDTO dtos1 = new MovieDTO("Maghadheera", "rajamouli", "ramcharan", 5, "prasad");
		MovieDTO dtos2 = new MovieDTO("KGF", "prashant neel", "Yash", 5, "vijay");
		MovieDTO dtos3 = new MovieDTO("ratnan prapancha", "rohit padaki", "dali dhananjay", 5, "kartik");

		dao.create(dtos3);
		dao.create(dtos2, 1);
		int lock = dao.indexoccupied();
		System.out.println(lock);
		dao.matchByname("KGF");
		MovieDTO[] dtoss = dao.getMovie();
		dtoss[0] = dtos1;
		dtoss[1] = dtos2;
		for (int i = 0; i < dtoss.length; i++) {
			MovieDTO dtoss1 = dtoss[i];

			if (dtos1 != null) {
				System.out.println(dtoss1.getActor());
				System.out.println(dtoss1.getDirector());
				System.out.println(dtoss1.getName());
				System.out.println(dtoss1.getProducer());
				System.out.println(dtoss1.getRating());
				


	}

}
	}
}
