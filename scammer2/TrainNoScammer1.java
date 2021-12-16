package com.xworkz.scammer2;

import com.xworkz.DAO.TrainNoDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class TrainNoScammer1 {

	public static void main(String[] args) {

		TrainNoDAO trainNoDAO = new TrainNoDAO();

		Find equalsOrNot = new ElementEqual();

		boolean match = trainNoDAO.find(equalsOrNot, "05348");
		System.out.println(match);
		match = trainNoDAO.find(new ElementEqual() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.equals(arg2);
			}
		}, "05348");
		System.out.println(match);

		Find end = new EndsWith();

		boolean match1 = trainNoDAO.find(end, "05");
		System.out.println(match1);
		match1 = trainNoDAO.find(new EndsWith() {

			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.endsWith(arg2);
			}
		}, "05");

		System.out.println(match1);

		Find start = new StartsWith();

		boolean match3 = trainNoDAO.find(start, "0");
		System.out.println(match3);
		match3 = trainNoDAO.find(new StartsWith() {
			@Override
			public boolean expression(String arg1, String arg2) {
				System.out.println("inside methos as arg");
				return arg1.startsWith(arg2);
			}
		}, "0");
		System.out.println(match3);

	}

}
