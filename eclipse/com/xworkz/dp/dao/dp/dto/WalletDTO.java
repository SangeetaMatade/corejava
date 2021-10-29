package com.xworkz.dp.dto;

public class WalletDTO {
	private String companyname;
	private String material;
	private int totalcompartments;
	private float price;
	private boolean coincompartment;
	public WalletDTO() {
		System.out.println("invoked no arg const");
	}
	public WalletDTO(String companyname, String material, int totalcompartments, float price,
			boolean coincompartment) {
		super();
		this.companyname = companyname;
		this.material = material;
		this.totalcompartments = totalcompartments;
		this.price = price;
		this.coincompartment = coincompartment;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getTotalcompartments() {
		return totalcompartments;
	}
	public void setTotalcompartments(int totalcompartments) {
		this.totalcompartments = totalcompartments;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isCoincompartment() {
		return coincompartment;
	}
	public void setCoincompartment(boolean coincompartment) {
		this.coincompartment = coincompartment;
	}

}
