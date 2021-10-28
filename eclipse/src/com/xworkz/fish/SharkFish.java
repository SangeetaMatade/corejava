package com.xworkz.fish;

public class SharkFish extends Fish{
	
	public boolean alive=false;
	
	public SharkFish() {
		super();
		System.out.println("invoked no arg const");
	}
	public SharkFish(String name) {
		System.out.println("invoked para const");
	}

}
