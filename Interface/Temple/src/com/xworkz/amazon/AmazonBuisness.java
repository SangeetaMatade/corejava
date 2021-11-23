package com.xworkz.amazon;

public class AmazonBuisness {
	AmazonCartDAO cartDAO;

	AmazonCartDAO dao;

	public AmazonBuisness(AmazonCartDAO dao) {
		super();
		this.dao = dao;
	}

	public void save(CartDTO cto) {

		if (cto != null) {
			boolean mister = dao.Save(cto);
			if (mister) {
				System.out.println("invoked save method ");
			} else {
				System.out.println("unsaved");
			}
		} else {
			System.err.println("pass null");
		}
	}

	public void findByName(String cto) {
		if (cto != null) {
			this.dao.findByName(cto);
		} else {
			System.err.println("null");
		}
	}

	public void displayCart() {
		if (dao != null) {
			dao.displaydetails();
		}
	}

}
