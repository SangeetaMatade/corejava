package com.xworkz.dp.dto;

public class MetroStationDTO {
	private String name;
	private String route;
	private boolean elevator;
	private float opentime;
	private float closetime;
	public MetroStationDTO() {
		System.out.println("invoked no arg const");
	}
	public MetroStationDTO(String name, String route, boolean elevator, float opentime, float closetime) {
		super();
		this.name = name;
		this.route = route;
		this.elevator = elevator;
		this.opentime = opentime;
		this.closetime = closetime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public boolean isElevator() {
		return elevator;
	}
	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}
	public float getOpentime() {
		return opentime;
	}
	public void setOpentime(float opentime) {
		this.opentime = opentime;
	}
	public float getClosetime() {
		return closetime;
	}
	public void setClosetime(float closetime) {
		this.closetime = closetime;
	}
	

}
