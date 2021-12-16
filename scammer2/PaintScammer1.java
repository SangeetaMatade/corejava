package com.xworkz.scammer2;

import com.xworkz.DAO.PaintDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class PaintScammer1 {

	public static void main(String[] args) {

		PaintDAO paintDAO = new PaintDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = paintDAO.find(equalsOrNot, "Asian Paints");
		System.out.println(match);
		match = paintDAO.find(new ElementEqual() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equals(arg2);
			}
		}, "Asian Paints");
		System.out.println(match);

		Find end = new EndsWith();

		boolean match1 = paintDAO.find(end, "Pa");
		System.out.println(match1);
		match1 = paintDAO.find(new EndsWith() {

			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.endsWith(arg2);
			}
		}, "Pa");

		System.out.println(match1);

		Find equal = new EqualIgnoreCase();

		boolean match2 = paintDAO.find(equal, "asian paints");
		System.out.println(match2);
		match2 = paintDAO.find(new EqualIgnoreCase() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equalsIgnoreCase(arg2);
			}
		}, "asian paints");
		System.out.println(match2);

		Find start = new StartsWith();

		boolean match3 = paintDAO.find(start, "Asi");
		System.out.println(match3);
		match3 = paintDAO.find(new StartsWith() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.startsWith(arg2);
			}
		}, "Asi");
		System.out.println(match3);

	}

}
