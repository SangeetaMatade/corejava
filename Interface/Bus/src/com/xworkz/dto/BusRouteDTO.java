package com.xworkz.dto;

public class BusRouteDTO {

	private String StartPoint;
	private boolean Destination;
	private String DriverName;

	public BusRouteDTO() {
		System.out.println("invoked no arg const");
	}

	public BusRouteDTO(String startPoint, boolean destination, String driverName) {
		super();
		StartPoint = startPoint;
		Destination = destination;
		DriverName = driverName;
	}

	public String getStartPoint() {
		return StartPoint;
	}

	public void setStartPoint(String startPoint) {
		StartPoint = startPoint;
	}

	public boolean isDestination() {
		return Destination;
	}

	public void setDestination(boolean destination) {
		Destination = destination;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	
	

}
