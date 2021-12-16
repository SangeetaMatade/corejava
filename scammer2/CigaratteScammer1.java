package com.xworkz.scammer2;

import com.xworkz.DAO.CigaratteDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class CigaratteScammer1 {

	public static void main(String[] args) {

		CigaratteDAO cigaratteDAO = new CigaratteDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = cigaratteDAO.find(equalsOrNot, "black");
		System.out.println(match);
		match = cigaratteDAO.find(new ElementEqual() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equals(arg2);
			}
		}, "black");
		System.out.println(match);

		Find end = new EndsWith();

		boolean match1 = cigaratteDAO.find(end, "ck");
		System.out.println(match1);
		match1 = cigaratteDAO.find(new EndsWith() {

			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.endsWith(arg2);
			}
		}, "ck");

		System.out.println(match1);

		Find equal = new EqualIgnoreCase();

		boolean match2 = cigaratteDAO.find(equal, "Black");
		System.out.println(match2);
		match2 = cigaratteDAO.find(new EqualIgnoreCase() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equalsIgnoreCase(arg2);
			}
		}, "Black");
		System.out.println(match2);

		Find start = new StartsWith();

		boolean match3 = cigaratteDAO.find(start, "bla");
		System.out.println(match3);
		match3 = cigaratteDAO.find(new StartsWith() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.startsWith(arg2);
			}
		}, "bla");
		System.out.println(match3);

	}

}
