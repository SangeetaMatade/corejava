package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.marker.Find;

public class BeerDAO {

	private Collection<String> collectionBeerDAO = new ArrayList<String>();

	public BeerDAO() {

		collectionBeerDAO.add("India Pale Ale");
		collectionBeerDAO.add("Blonde Ale");
		collectionBeerDAO.add("Farmhouse Ale");
		collectionBeerDAO.add("Belgian Ale");
		collectionBeerDAO.add("Cream Ale");
		collectionBeerDAO.add("Stout");

	}

	public boolean find(Find enter, String value) {
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionBeerDAO.iterator();
		while (itr.hasNext()) {
			String point = itr.next();
			if (enter.expression(point, value)) {
				return true;
			}
		}
		return false;

	}

}
