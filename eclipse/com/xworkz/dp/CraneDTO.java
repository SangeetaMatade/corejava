package com.xworkz.dp;

public class CraneDTO {
	private String name;
	private String color;
	private boolean work;
	private int parts;

	public CraneDTO() {
		System.out.println("invoked cranes");
	}

	public CraneDTO(String name, String color, boolean work, int parts) {
		super();
		this.name = name;
		this.color = color;
		this.work = work;
		this.parts = parts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	public int getParts() {
		return parts;
	}

	public void setParts(int parts) {
		this.parts = parts;
	}

}
