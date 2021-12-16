package com.xworkz.scammer3;

import com.xworkz.DAO.PaintDAO;

public class PaintScammer2 {

	public static void main(String[] args) {

		PaintDAO paintDAO = new PaintDAO();

		boolean match = paintDAO.find((a1, a2) -> a1.equals(a2), "Asian paint");
		System.out.println(match);

		boolean match1 = paintDAO.find((value1, value2) -> value1.startsWith(value2), "As");
		System.out.println(match1);

		boolean match2 = paintDAO.find((arg1, arg2) -> arg1.endsWith(arg2), "nt");
		System.out.println(match2);

		boolean match3 = paintDAO.find((b1, b2) -> b1.equalsIgnoreCase(b2), "Asian Paint");
		System.out.println(match3);

	}

}
