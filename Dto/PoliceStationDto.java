package com.xworkz.Dto;

public class PoliceStationDto {

	private String name, location, type;
	private int noofStaff;

	public PoliceStationDto() {
		System.out.println("invoked no arg const");

	}

	public PoliceStationDto(String name, String location, String type, int noofStaff) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noofStaff = noofStaff;

	}

	@Override
	public int hashCode() {

		return 6;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PoliceStationDto) {
				PoliceStationDto casted = (PoliceStationDto) obj;
				if (this.name.equals(casted.name) && this.location.equals(casted.location) && this.noofStaff==(casted.noofStaff)) {
					return true;
					
				}
				else {
					return false;
				}
			}

		}
		return false;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoofStaff() {
		return noofStaff;
	}

	public void setNoofStaff(int noofStaff) {
		this.noofStaff = noofStaff;
	}
@Override
public String toString() {
	
	return name+": "+location+": "+noofStaff;
}
}
