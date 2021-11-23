package com.xworkz.electronics;

public class BeltScammer {

	public static void main(String[] args) {
		Belt belt = new Belt();
		System.out.println(belt.hashCode());
		System.out.println(belt.toString());
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,");

		Belt belt1 = new Belt();
		System.out.println(belt1.toString());
		System.out.println("----------------------");

		belt.setGender("female");
		belt1.setGender("male");
		boolean wrong = belt.equals(belt1);
		System.out.println(wrong);

	}

}
