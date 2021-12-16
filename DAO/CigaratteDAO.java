package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.marker.Find;

public class CigaratteDAO {

	private Collection<String> collectionCigaratteDAO = new ArrayList<String>();

	public CigaratteDAO() {
		collectionCigaratteDAO.add("King");
		collectionCigaratteDAO.add("lite");
		collectionCigaratteDAO.add("straberry mount");
		collectionCigaratteDAO.add("distyan");
		collectionCigaratteDAO.add("black");
	}

	public boolean find(Find enter, String value) {
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionCigaratteDAO.iterator();
		while (itr.hasNext()) {
			String point = itr.next();
			if (enter.expression(point, value)) {
				return true;
			}
		}
		return false;
	}

}
