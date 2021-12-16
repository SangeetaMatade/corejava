package com.xworkz.scammer3;

import com.xworkz.DAO.BiscuitDAO;

public class BiscuitsScammer2 {

	public static void main(String[] args) {
		
		BiscuitDAO bisicuitDAO = new BiscuitDAO();
		
		boolean match = bisicuitDAO.find((a1, a2) -> a1.equals(a2), "Good day");
		System.out.println(match);

		boolean match1 = bisicuitDAO.find((value1, value2) -> value1.startsWith(value2), "Good");
		System.out.println(match1);

		boolean match2 = bisicuitDAO.find((arg1, arg2) -> arg1.endsWith(arg2), "Day");
		System.out.println(match2);

		boolean match3 = bisicuitDAO.find((b1, b2) -> b1.equalsIgnoreCase(b2), "Good day");
		System.out.println(match3);

	}

}
