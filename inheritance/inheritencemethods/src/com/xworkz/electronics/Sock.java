package com.xworkz.electronics;

import com.xworkz.enumm.SockMaterial;
import com.xworkz.enumm.SockType;

public class Sock {
	private char size;
	private float price;
	private SockMaterial material;
	private SockType type;

	public Sock() {
		System.out.println("invoked no arg const sock");
	}

	public Sock(char size, float price, SockMaterial material, SockType type) {
		super();
		this.size = size;
		this.price = price;
		this.material = material;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.out.println("it is not pointing null");
			return false;
		}
		if (obj instanceof Sock) {
			Sock casted = (Sock) obj;
			SockType castedsock = casted.type;
			if (this.type.equals(castedsock)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("sock pass madro");
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 20;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return super.toString();
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
