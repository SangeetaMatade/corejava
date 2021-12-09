package com.xworkz.Dto;

public class OfficeDto {
	
	private String name,location;
	private int noOfOffice;
	
	public OfficeDto() {
		System.out.println("invoked no arg const");
	}

	public OfficeDto(String name, String location, int noOfOffice) {
		super();
		this.name = name;
		this.location = location;
		this.noOfOffice = noOfOffice;
	}
	@Override
	public int hashCode() {
		
		return 99;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof OfficeDto) {
				OfficeDto casted=(OfficeDto)obj;
				if(this.name.equals(casted.name)&& this.location.equals(location) && this.noOfOffice==(casted.noOfOffice)) {
					
					return true;
					}
				else
				{
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

	public int getNoOfOffice() {
		return noOfOffice;
	}

	public void setNoOfOffice(int noOfOffice) {
		this.noOfOffice = noOfOffice;
	}
	@Override
	public String toString() {
		
		return name+": "+location+": "+noOfOffice;
	}
	

}
