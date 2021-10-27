package com.xworkz.dp.dto;

public class DressCodeDTO {

	String size;
	String materil;
	String color;
	float price;
	String gender;

	public DressCodeDTO() {
		System.out.println("invoked dresscode");
	}

	public DressCodeDTO(String size, String materil, String color, float price, String gender) {
		super();
		this.size = size;
		this.materil = materil;
		this.color = color;
		this.price = price;
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMateril() {
		return materil;
	}

	public void setMateril(String materil) {
		this.materil = materil;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String Gender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
