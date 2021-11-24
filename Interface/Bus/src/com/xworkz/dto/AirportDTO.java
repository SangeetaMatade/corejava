package com.xworkz.dto;

public class AirportDTO {
	
	private String name;
	private String location;
	private boolean type;
	
	public AirportDTO() {
		System.out.println("invoked no arg public const");
	}

	public AirportDTO(String name, String location, boolean type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
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

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	

}
