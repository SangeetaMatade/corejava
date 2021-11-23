package com.xworkz.electronics;

public class Ipod {

	private String brand;
	private float price;
	private String modelno;
	private String color;

	public Ipod() {
		System.out.println("invoked no arg const Ipod");
	}

	public Ipod(String brand, float price, String modelno, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.modelno = modelno;
		this.color = color;
	}

	@Override
	public String toString() {
		System.out.println("invoked toString");
		return "Ipod";

	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked metod equals");
		if (obj == null) {
			System.err.println("it is not null");
			return false;
		}
		if (obj instanceof Ipod) {
			System.out.println("correct");
			Ipod casted = (Ipod) obj;
			String castedmodelno = casted.modelno;
			if (this.modelno.equals(castedmodelno)) {
				System.out.println("model number matched");
				return true;
			} else {
				System.err.println("model no missmatched.....just miss");
			}
		} else {
			System.out.println("thu ipod pass mado");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
