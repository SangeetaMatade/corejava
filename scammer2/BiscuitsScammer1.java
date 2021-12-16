package com.xworkz.scammer2;

import com.xworkz.DAO.BiscuitDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class BiscuitsScammer1 {

	public static void main(String[] args) {

		BiscuitDAO buscuitDAO = new BiscuitDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = buscuitDAO.find(equalsOrNot, "Nimkin");
		System.out.println(match);
		match = buscuitDAO.find(new ElementEqual() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equals(arg2);
			}
		}, "Nimkin");
		System.out.println(match);

		Find end = new EndsWith();

		boolean match1 = buscuitDAO.find(end, "kin");
		System.out.println(match1);
		match1 = buscuitDAO.find(new EndsWith() {

			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.endsWith(arg2);
			}
		}, "kin");

		System.out.println(match1);

		Find equal = new EqualIgnoreCase();

		boolean match2 = buscuitDAO.find(equal, "nimkin");
		System.out.println(match2);
		match2 = buscuitDAO.find(new EqualIgnoreCase() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equalsIgnoreCase(arg2);
			}
		}, "nimkin");
		System.out.println(match2);

		Find start = new StartsWith();

		boolean match3 = buscuitDAO.find(start, "Nim");
		System.out.println(match3);
		match3 = buscuitDAO.find(new StartsWith() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.startsWith(arg2);
			}
		}, "Nim");
		System.out.println(match3);

	}

}
