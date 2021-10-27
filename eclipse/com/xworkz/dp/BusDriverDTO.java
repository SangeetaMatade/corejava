package com.xworkz.dp;

public class BusDriverDTO {
	private String name;
	private int shifts;
	private boolean work;
	private float salary;
	private String location;

	public BusDriverDTO() {
		System.out.println("invoked bus driver");
	}

	public BusDriverDTO(String name, int shifts, boolean work, float salary, String location) {
		super();
		this.name = name;
		this.shifts = shifts;
		this.work = work;
		this.salary = salary;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShifts() {
		return shifts;
	}

	public void setShifts(int shifts) {
		this.shifts = shifts;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}