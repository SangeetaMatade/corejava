package com.xworkz.electronics;

public class Aeroplane {

	private String country;
	private String government;

	public Aeroplane() {
		System.out.println("invoked no arg const aeroplane");
	}

	public Aeroplane(String country, String government) {
		super();
		this.country = country;
		this.government = government;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked methiod equals");
		if (obj == null) {
			System.out.println("not pointing to null");
			return false;
		}
		if (obj instanceof Aeroplane) {
			Aeroplane casted = (Aeroplane) obj;
			String castedaeroplane = casted.country;
			if (this.country.equals(castedaeroplane)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("Aeroplane pass madro");
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
		return super.toString();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}

}
