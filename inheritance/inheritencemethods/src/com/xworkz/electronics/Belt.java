package com.xworkz.electronics;

public class Belt {

	private float price;
	private int size;
	private String gender;

	public Belt() {
		System.out.println("invoked no arg const");
	}

	public Belt(float price, int size, String gender) {
		super();
		this.price = price;
		this.size = size;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equal method");
		if (obj == null) {
			System.out.println("it is not pointing to null");
			return false;
		}
		if (obj instanceof Belt) {
			Belt casted = (Belt) obj;
			String castedbelt = casted.gender;
			if (this.gender.equals(castedbelt)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("pass Belt");
		}
		return false;

	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 50;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return super.toString();
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
