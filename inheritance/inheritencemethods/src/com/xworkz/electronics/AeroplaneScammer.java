package com.xworkz.electronics;

public class AeroplaneScammer {

	public static void main(String[] args) {
		Aeroplane aer = new Aeroplane();
		System.out.println(aer.hashCode());
		System.out.println();

		Aeroplane aer1 = new Aeroplane();
		System.out.println(aer1.toString());
		System.out.println();

		aer.setCountry("India");
		aer1.setCountry("Usa");
		boolean equal = aer.equals(aer1);
		System.out.println(equal);

	}

}
