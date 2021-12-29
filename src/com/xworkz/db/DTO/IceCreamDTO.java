package com.xworkz.db.DTO;

import java.io.Serializable;

public class IceCreamDTO implements Serializable {
	
	private int creamid;
	private String flavour,name;
	private float price;
	
	public IceCreamDTO() {
		System.out.println("invoked no arg const");
	}

	public IceCreamDTO(int creamid, String flavour, String name, float price) {
		super();
		this.creamid = creamid;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}

	public int getCreamid() {
		return creamid;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [creamid=" + creamid + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}

}
