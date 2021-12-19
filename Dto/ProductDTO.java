package com.xworkz.DTO;

public class ProductDTO {

	private String name, manufacturer;
	private int id, price;

	public ProductDTO() {
		System.out.println("invoked no arg const");
	}

	public ProductDTO(String name, String manufacturer, int id, int price) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + manufacturer + " " + id + " " + price;
	}

}
