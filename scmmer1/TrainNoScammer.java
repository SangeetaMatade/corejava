package com.xworkz.scmmer1;

import com.xworkz.DAO.TrainNoDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class TrainNoScammer {

	public static void main(String[] args) {

		TrainNoDAO trainNoDAO = new TrainNoDAO();

		Find element = new ElementEqual();

		boolean match1 = trainNoDAO.find(element, "79438");
		System.out.println(match1);

		Find end = new EndsWith();

		boolean match2 = trainNoDAO.find(end, "8");
		System.out.println(match2);

		Find start = new StartsWith();

		boolean match3 = trainNoDAO.find(start, "1");
		System.out.println(match3);

		Find equal = new EqualIgnoreCase();

		boolean match4 = trainNoDAO.find(equal, "79438");
		System.out.println(match4);

	}

}
