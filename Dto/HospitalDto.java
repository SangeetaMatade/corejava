package com.xworkz.Dto;

public class HospitalDto {

	private String name, specialist;
	private int noOfDoctors;

	public HospitalDto() {
		System.out.println("invoked no arg const");
	}

	public HospitalDto(String name, String specialist, int noOfDoctors) {
		super();
		this.name = name;
		this.specialist = specialist;
		this.noOfDoctors = noOfDoctors;
	}

	@Override
	public int hashCode() {

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HospitalDto) {
				HospitalDto casted = (HospitalDto) obj;
				if (this.name.equals(name) && this.specialist.equals(specialist)
						&& this.noOfDoctors == (casted.noOfDoctors)) {
					return true;

				} else {
					return false;
				}
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	@Override
	public String toString() {

		return name + ": " + specialist + ": " + noOfDoctors;
	}

}
