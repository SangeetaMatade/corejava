package com.xworkz.electronics;

public class FishScammer {

	public static void main(String[] args) {
		Fish fish = new Fish();
		System.out.println(fish.hashCode());
		System.out.println(fish.hashCode());
		System.out.println();

		Fish fish1 = new Fish();
		System.out.println(fish1.toString());
		System.out.println();

		fish.setColor("pink");
		fish1.setColor("pink");
		boolean equal = fish.equals(fish1);
		System.out.println(equal);

	}

}
