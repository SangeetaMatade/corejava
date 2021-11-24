package com.xworkz.dto;

public class BankDTO {
	
	private String name;
	private String location;
	private boolean government;
	
	public BankDTO() {
		System.out.println("invoked no arg const");
	}

	public BankDTO(String name, String location, boolean government) {
		super();
		this.name = name;
		this.location = location;
		this.government = government;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isGovernment() {
		return government;
	}

	public void setGovernment(boolean government) {
		this.government = government;
	}
	

}
