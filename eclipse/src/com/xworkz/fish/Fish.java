package com.xworkz.fish;

public class Fish {
	public String region="manglore";
	public boolean alive=true;
	public Fish() {
		this("test");
		System.out.println("invoked no arg const");
	}
	public Fish(String region) {
		super();
		System.out.println("invoked parameterized const");
	}

}
