package com.xworkz.electronics;

import com.xworkz.enumm.IceCreamFlavour;
import com.xworkz.enumm.IceCreamType;

public class IceCream {

	private String name;
	private IceCreamFlavour flavour;
	private IceCreamType type;

	public IceCream() {
		System.out.println("invoked no arg const icecrem");
	}

	public IceCream(String name, IceCreamFlavour flavour, IceCreamType type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("....................................");
		if (obj == null) {
			System.out.println("it is not pointing to null");
			return false;
		}
		if (obj instanceof IceCream) {
			System.out.println("correct");
			IceCream casted = (IceCream) obj;
			String castedicecream = casted.name;
			if (this.name.equals(castedicecream)) {
				System.out.println("name is matched");
				return true;
			} else {
				System.out.println("name is missmatched");
			}
		} else {
			System.out.println("Icecream pass madro");
		}
		return false;

	}
	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return super.hashCode();
	}
	@Override
	public String toString() {
		System.out.println("invked method tostring");		
		return super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IceCreamFlavour getFlavour() {
		return flavour;
	}

	public void setFlavour(IceCreamFlavour flavour) {
		this.flavour = flavour;
	}

	public IceCreamType getType() {
		return type;
	}

	public void setType(IceCreamType type) {
		this.type = type;
	}

}
