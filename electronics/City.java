package com.xworkz.electronics;

public class City {

	private String name;
	private String statename;
	private String countryname;

	public City() {
		System.out.println("invoked no arg const");
	}

	public City(String name, String statename, String countryname) {
		super();
		this.name = name;
		this.statename = statename;
		this.countryname = countryname;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equal");
		if (obj == null) {
			System.out.println("not pointing to null");
			return false;
		}
		if (obj instanceof City) {
			City casted = (City) obj;
			String castedcity = casted.name;
			if (this.name.equals(castedcity)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("miss matched");
			}
		} else {
			System.out.println("city pass madro");
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
		System.out.println("invpoked method tostring");
		return super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

}
