package com.xworkz.scammer2;

import com.xworkz.DAO.BeerDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class BeerScammer1 {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = beerDAO.find(equalsOrNot, "Blonde Ale");
		System.out.println(match);
		match = beerDAO.find(new ElementEqual() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equals(arg2);
			}
		}, "bbb");
		System.out.println(match);

		Find end = new EndsWith();

		boolean match1 = beerDAO.find(end, "Ale");
		System.out.println(match1);
		match1 = beerDAO.find(new EndsWith() {

			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.endsWith(arg2);
			}
		}, "Ale");

		System.out.println(match1);

		Find equal = new EqualIgnoreCase();

		boolean match2 = beerDAO.find(equal, "xyzyzyz");
		System.out.println(match2);
		match2 = beerDAO.find(new EqualIgnoreCase() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equalsIgnoreCase(arg2);
			}
		}, "xyzyzyz");
		System.out.println(match2);

		Find start = new StartsWith();

		boolean match3 = beerDAO.find(start, "Blo");
		System.out.println(match3);
		match3 = beerDAO.find(new StartsWith() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.startsWith(arg2);
			}
		}, "Blo");
		System.out.println(match3);

	}

}
