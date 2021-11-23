package com.xworkz.electronics;

public class Food {

	private String name;
	private float price;
	private String quality;

	public Food() {
		System.out.println("invoked no arg const food");
	}

	public Food(String name, float price, String quality) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.out.println("obj is not pointing to null");
			return false;
		}
		if (obj instanceof Food) {
			Food casted = (Food) obj;
			String castedfood = casted.name;
			if (this.name.equals(castedfood)) {
				System.out.println("matched");
				return false;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("pass Food");
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 12;
	}

	@Override
	public String toString() {
		System.out.println("invoked method totring");
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

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

}
