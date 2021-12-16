package com.xworkz.scammer3;

import com.xworkz.DAO.TrainNoDAO;

public class TrainNoScammer2 {

	public static void main(String[] args) {
		
		TrainNoDAO trainNoDAO = new TrainNoDAO();
		
		

		boolean match1 = trainNoDAO.find((value1, value2) -> value1.startsWith(value2), "0");
		System.out.println(match1);

		boolean match2 = trainNoDAO.find((arg1, arg2) -> arg1.endsWith(arg2), "7");
		System.out.println(match2);

		

	}

}
