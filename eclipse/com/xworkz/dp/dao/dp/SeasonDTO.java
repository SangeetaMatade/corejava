package com.xworkz.dp;

public class SeasonDTO {

	private String name;
    private int noOfseasons;
	private boolean change;
	private String month;
	private String climate;
	private int types;
	
	public SeasonDTO() {
		System.out.println("invoked seasons");
	}
	

	public SeasonDTO(String name, int noOfseasons, boolean change, String month, String climate, int types) {
		super();
		this.name = name;
		this.noOfseasons = noOfseasons;
		this.change = change;
		this.month = month;
		this.climate = climate;
		this.types = types;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfseasons() {
		return noOfseasons;
	}

	public void setNoOfseasons(int noOfseasons) {
		this.noOfseasons = noOfseasons;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public int getTypes() {
		return types;
	}

	public void setTypes(int types) {
		this.types = types;
	}
	
	
	
	
	
	
	
	
	
	
	
}
