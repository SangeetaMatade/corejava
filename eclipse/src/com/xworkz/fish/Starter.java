package com.xworkz.fish;

public class Starter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		System.out.println(fish.region);
		System.out.println(fish.alive);
		SharkFish fish1=new SharkFish();
		System.out.println(fish1.region);
		System.out.println(fish1.alive);
		GoldFish fish2=new GoldFish();
		System.out.println(fish2.region);
		System.out.println(fish2.alive);
	}

}
