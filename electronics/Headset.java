package com.xworkz.electronics;

import com.xworkz.enumm.HeadsetType;

public class Headset {

	private String brand;
	private String battery;
	private HeadsetType Type;

	public Headset() {
		System.out.println("invoked  no arg const headset");
	}

	public Headset(String brand, String battery, HeadsetType tYPE) {
		super();
		this.brand = brand;
		this.battery = battery;
		this.Type = Type;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 200;
	}

	@Override
	public String toString() {
		System.out.println("invoked method toString");
		return "brand";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.out.println("it is not pointing to null");
			return false;
		}
		if (obj instanceof Headset) {
			System.out.println("passed correct headset");
			Headset casted = (Headset) obj;
			String castedbrand = casted.brand;
			if (this.brand.equals(castedbrand)) {
				System.out.println("brand matched");
				return true;
			} else {
				System.err.println("brand  missmatched.....just miss");
			}
		} else {
			System.out.println("thu Headset  pass mado");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public HeadsetType getType() {
		return Type;
	}

	public void setType(HeadsetType type) {
		Type = type;
	}

}