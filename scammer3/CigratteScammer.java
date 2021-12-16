package com.xworkz.scammer3;

import com.xworkz.DAO.CigaratteDAO;

public class CigratteScammer {

	public static void main(String[] args) {

		CigaratteDAO cigratteDAO = new CigaratteDAO();

		boolean match = cigratteDAO.find((a1, a2) -> a1.equals(a2), "King");
		System.out.println(match);

		boolean match1 = cigratteDAO.find((value1, value2) -> value1.startsWith(value2), "Ki");
		System.out.println(match1);

		boolean match2 = cigratteDAO.find((arg1, arg2) -> arg1.endsWith(arg2), "nnnn");
		System.out.println(match2);

		boolean match3 = cigratteDAO.find((b1, b2) -> b1.equalsIgnoreCase(b2), "kinG");
		System.out.println(match3);

	}

}
