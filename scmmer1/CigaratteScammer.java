package com.xworkz.scmmer1;

import com.xworkz.DAO.CigaratteDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class CigaratteScammer {

	public static void main(String[] args) {

		CigaratteDAO cigaratteDAO = new CigaratteDAO();

		Find element = new ElementEqual();

		boolean match1 = cigaratteDAO.find(element, "King");
		System.out.println(match1);

		Find end = new EndsWith();

		boolean match2 = cigaratteDAO.find(end, "ng");
		System.out.println(match2);

		Find equal = new EqualIgnoreCase();

		boolean match3 = cigaratteDAO.find(equal, "King");
		System.out.println(match3);

		Find Start = new StartsWith();
		boolean match4 = cigaratteDAO.find(Start, "m");
		System.out.println(match4);

	}

}
