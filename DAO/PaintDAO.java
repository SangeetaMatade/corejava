package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.marker.Find;

public class PaintDAO {

	private Collection<String> collectionPaintDAO = new ArrayList<String>();

	public PaintDAO() {
		collectionPaintDAO.add("Asian Paints");
		collectionPaintDAO.add("Berger Paints India");
		collectionPaintDAO.add("British Paints India");
		collectionPaintDAO.add("British Paints India");
		collectionPaintDAO.add("Kansai Nerolac Paints");
		collectionPaintDAO.add("Nippon Paint");

	}

	public boolean find(Find enter, String value) {
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionPaintDAO.iterator();
		while (itr.hasNext()) {
			String point = itr.next();
			if (enter.expression(point, value)) {
				return true;
			}
		}
		return false;

	}

}
