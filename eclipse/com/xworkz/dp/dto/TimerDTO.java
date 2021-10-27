package com.xworkz.dp.dto;

public class TimerDTO {
	private boolean working;
	private boolean correcttime;
	private String brand;
	private boolean bell;
	public TimerDTO() {
		System.out.println("invoked no arg const");
	}
	public TimerDTO(boolean working, boolean correcttime, String brand, boolean bell) {
		super();
		this.working = working;
		this.correcttime = correcttime;
		this.brand = brand;
		this.bell = bell;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	public boolean isCorrecttime() {
		return correcttime;
	}
	public void setCorrecttime(boolean correcttime) {
		this.correcttime = correcttime;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isBell() {
		return bell;
	}
	public void setBell(boolean bell) {
		this.bell = bell;
	}

}
