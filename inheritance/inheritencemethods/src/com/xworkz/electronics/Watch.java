package com.xworkz.electronics;

public class Watch {

	private String brand;
	private Type type;
	private float price;

	public Watch() {
		System.out.println("invoked no arg const watch");
	}

	public Watch(String brand, Type type, float price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return "sonata";

	}

	@Override
	public int hashCode() {
		System.out.println("invoked mehod hashcode");
		return 55;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.out.println("it is not null");
			return false;
		}
		if (obj instanceof Watch) {
			System.out.println("passed correct arg");
			Watch casted = (Watch) obj;
			String castedbrand = casted.brand;
			if (this.brand.equals(castedbrand)) {
				System.out.println("brand matched");
				return true;

			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("watch pass mado");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
