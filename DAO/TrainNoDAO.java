package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.marker.Find;

public class TrainNoDAO {

	private Collection<String> collectionTrainNoDAO = new ArrayList<String>();

	public TrainNoDAO() {

		collectionTrainNoDAO.add("15609");
		collectionTrainNoDAO.add("58719");
		collectionTrainNoDAO.add("79438");
		collectionTrainNoDAO.add("09438");
		collectionTrainNoDAO.add("05348");

	}

	public boolean find(Find enter, String value) {
		System.out.println("Invoked find method");
		Iterator<String> itr = collectionTrainNoDAO.iterator();
		while (itr.hasNext()) {
			String point = itr.next();
			if (enter.expression(point, value)) {
				return true;
			}
		}
		return false;

	}
}
