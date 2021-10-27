package com.xworkz.dp;

public class CarpentarDTO {
	private String name;
	private int NoOfcarpentars;
	private boolean work;
	private String location;
	private float price;

	public CarpentarDTO() {
		System.out.println("invoked no arg constructor");
	}

	public CarpentarDTO(String name, int noOfcarpentars, boolean work, String location, float price) {
		super();
		this.name = name;
		NoOfcarpentars = noOfcarpentars;
		this.work = work;
		this.location = location;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfcarpentars() {
		return NoOfcarpentars;
	}

	public void setNoOfcarpentars(int noOfcarpentars) {
		NoOfcarpentars = noOfcarpentars;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
