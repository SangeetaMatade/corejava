package com.xworkz.dp;

public class ParkDtO {

	private String name;
	private String location;
	private String usefullfor;
	private int noOfparks;
	private boolean clean;
	private boolean safety;

	public ParkDtO() {
		System.out.println("invoked park");
	}

	public ParkDtO(String name, String location, String usefullfor, int noOfparks, boolean clean, boolean safety) {
		super();
		this.name = name;
		this.location = location;
		this.usefullfor = usefullfor;
		this.noOfparks = noOfparks;
		this.clean = clean;
		this.safety = safety;
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

	public String getUsefullfor() {
		return usefullfor;
	}

	public void setUsefullfor(String usefullfor) {
		this.usefullfor = usefullfor;
	}

	public int getNoOfparks() {
		return noOfparks;
	}

	public void setNoOfparks(int noOfparks) {
		this.noOfparks = noOfparks;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public boolean isSafety() {
		return safety;
	}

	public void setSafety(boolean safety) {
		this.safety = safety;
	}

}
