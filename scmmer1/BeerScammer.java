package com.xworkz.scmmer1;

import com.xworkz.DAO.BeerDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class BeerScammer {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = beerDAO.find(equalsOrNot, "Blonde Ale");
		System.out.println(match);

		match = beerDAO.find(equalsOrNot, "Blonde Ale");
		System.out.println(match);

		Find equal = new EqualIgnoreCase();

		boolean match1 = beerDAO.find(equal, "blonde Ale");
		System.out.println(match1);

		Find End = new EndsWith();

		boolean match2 = beerDAO.find(End, "Ale");
		System.out.println(match2);

		Find Start = new StartsWith();

		boolean match3 = beerDAO.find(End, "abc");
		System.out.println(match3);
		
		
		

	}

}
