package com.xworkz.bird.dto;

public class BirdDTO {

	private String name;
	private String breed;
	private int age;
	private String origin;
	private boolean CanFly;

	public BirdDTO() {
		System.out.println("invoked no arg public const bird");
	}

	public BirdDTO(String name, String breed, int age, String origin, boolean canFly) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		CanFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanFly() {
		return CanFly;
	}

	public void setCanFly(boolean canFly) {
		CanFly = canFly;
	}

}
