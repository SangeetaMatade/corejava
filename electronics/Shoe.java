package com.xworkz.electronics;

public class Shoe {
	private String brand;
	private int size;
	private String color;
	private String gender;

	public Shoe() {
		System.out.println("invoked no arg const");
	}

	public Shoe(String brand, int size, String color, String gender) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.out.println("it is not pointing to null");
			return false;
		}
		if (obj instanceof Shoe) {
			Shoe casted = (Shoe) obj;
			String castedshoe = casted.brand;
			if (this.brand.equals(castedshoe)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("miss matched");
			}
		} else {
			System.out.println("Shoe pass madro");
		}
		return false;

	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return super.hashCode();
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
