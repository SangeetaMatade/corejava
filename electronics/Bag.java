package com.xworkz.electronics;

import com.xworkz.enumm.BagColor;

public class Bag {

	private float price;
	private BagColor color;
	private int sections;

	public Bag() {
		System.out.println("invoked no arg const bag");
	}

	public Bag(float price, BagColor color, int sections) {
		super();
		this.price = price;
		this.color = color;
		this.sections = sections;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public BagColor getColor() {
		return color;
	}

	public void setColor(BagColor color) {
		this.color = color;
	}

	public int getSections() {
		return sections;
	}

	public void setSections(int sections) {
		this.sections = sections;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			return false;
		}
		if (obj instanceof Bag) {
			System.out.println("correct arg passed");
			Bag casted = (Bag) obj;
			BagColor castedbag = casted.color;
			if (this.color.equals(castedbag)) {
				System.out.println("color is matched");
				return true;
			} else {
				System.out.println("color is not matched");
			}
		} else {
			System.out.println("bag pass madro");

		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 120;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return super.toString();
	}

}
