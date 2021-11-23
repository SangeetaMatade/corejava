package com.xworkz.electronics;

import com.xworkz.enumm.PlantType;

public class Plant {
	private String name;
	private int alive;
	private int lifespan;
	private PlantType type;

	public Plant() {
		System.out.println("invoked no arg const plant");
	}

	public Plant(String name, int alive, int lifespan, PlantType type) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifespan = lifespan;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equals");
		if (obj == null) {
			System.err.println("not pointing to null");
			return false;
		}
		if (obj instanceof Plant) {
			System.out.println("correct arg passed");
			Plant casted = (Plant) obj;
			String castedplant = casted.name;
			if (this.name.equals(castedplant)) {
				System.out.println("name  matched");
				return true;
			} else {
				System.err.println("name missmatched.....just miss");
			}
		} else {
			System.out.println("thu name pass mado");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlive() {
		return alive;
	}

	public void setAlive(int alive) {
		this.alive = alive;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	public PlantType getType() {
		return type;
	}

	public void setType(PlantType type) {
		this.type = type;
	}
}
