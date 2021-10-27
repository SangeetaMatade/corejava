package com.xworkz.dp.dto;

public class CameraDTO {
 private String company;
 private String type;
 private int pixel;
 private float cost;
 private int BatteryCapacity;
 private int capacity;
	
	public CameraDTO() {
		System.out.println("invoked o arg const");
	
	}

	public CameraDTO(String company, String type, int pixel, float cost, int batteryCapacity, int capacity) {
		super();
		 this.company = company;
		this.type = type;
		this.pixel = pixel;
		this.cost = cost;
		BatteryCapacity = batteryCapacity;
		this.capacity = capacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getBatteryCapacity() {
		return BatteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		BatteryCapacity = batteryCapacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
