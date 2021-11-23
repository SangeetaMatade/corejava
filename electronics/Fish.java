package com.xworkz.electronics;

public class Fish {

	private String name;
	private float price;
	private String color;

	public Fish() {
		System.out.println("invoked no arg const");
	}

	public Fish(String name, float price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invked method equals");
		if (obj == null) {
			System.out.println("obj is not pointing to null");
			return false;
		}
		if (obj instanceof Fish) {
			Fish casted = (Fish) obj;
			String castedfish = casted.color;
			if (this.color.equals(castedfish)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("pass Fish");
		}
		return false;

	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 30;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
