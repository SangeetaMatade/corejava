package com.xworkz.electronics;

public class Stadium {

	private String name;
	private String city;
	private int meeters;

	public Stadium() {
		System.out.println("invoked no arg const");
	}

	public Stadium(String name, String city, int meeters) {
		super();
		this.name = name;
		this.city = city;
		this.meeters = meeters;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals method");
		if (obj == null) {
			System.out.println("obj is not pointing to null");
			return false;
		}
		if (obj instanceof Stadium) {
			Stadium casted = (Stadium) obj;
			String castedstadium = casted.name;
			if (this.name.endsWith(castedstadium)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("pass Stadium");
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
		return name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMeeters() {
		return meeters;
	}

	public void setMeeters(int meeters) {
		this.meeters = meeters;
	}

}
