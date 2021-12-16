package com.xworkz.scammer3;

import com.xworkz.DAO.BeerDAO;


public class BeerScammer2 {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		boolean match = beerDAO.find((a1, a2) -> a1.equals(a2), "bb");
		System.out.println(match);

		boolean match1 = beerDAO.find((value1, value2) -> value1.startsWith(value2), "Sto");
		System.out.println(match1);

		boolean match2 = beerDAO.find((arg1, arg2) -> arg1.endsWith(arg2), "out");
		System.out.println(match2);

		boolean match3 = beerDAO.find((b1, b2) -> b1.equalsIgnoreCase(b2), "Stout");
		System.out.println(match3);
	}

}
