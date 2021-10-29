package com.xworkz.dp.dto;

public class BucketDTO {

	private String color;
	private int size;
	private float price;
	private int quantity;
	private int weight;
	private String company;
	public BucketDTO() {
		System.out.println("invoked no arg const");
	}
	public BucketDTO(String color, int size, float price, int quantity, int weight, String company) {
		super();
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.weight = weight;
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
}
