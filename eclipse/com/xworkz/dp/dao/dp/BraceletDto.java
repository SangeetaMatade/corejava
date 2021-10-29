package com.xworkz.dp;

public class BraceletDto {

	private float price;
	private int size;
	private String color;
	private boolean gemused;
	private boolean gifted;

	public BraceletDto() {
		System.out.println("no arg defualt constructor is invoked");
	}

	public BraceletDto(float price, int size, String color, boolean gemused, boolean gifted) {
		super();
		this.price = price;
		this.size = size;
		this.color = color;
		this.gemused = gemused;
		this.gifted = gifted;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isGemused() {
		return gemused;
	}

	public void setGemused(boolean gemused) {
		this.gemused = gemused;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

}
