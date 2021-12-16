package com.xworkz.scmmer1;

import com.xworkz.DAO.PaintDAO;
import com.xworkz.implemented.ElementEqual;
import com.xworkz.implemented.EndsWith;
import com.xworkz.implemented.EqualIgnoreCase;
import com.xworkz.implemented.StartsWith;
import com.xworkz.marker.Find;

public class PaintScammer {

	public static void main(String[] args) {

		PaintDAO paintDAO = new PaintDAO();

		Find element = new ElementEqual();

		boolean match1 = paintDAO.find(element, "Asian paint");
		System.out.println(match1);

		Find end = new EndsWith();

		boolean match2 = paintDAO.find(end, "m");
		System.out.println(match2);

		Find Equal = new EqualIgnoreCase();

		boolean match3 = paintDAO.find(Equal, "Asian paint");
		System.out.println(match3);

		Find starts = new StartsWith();

		boolean match4 = paintDAO.find(starts, "AS");
		System.out.println(match4);

	}

}
