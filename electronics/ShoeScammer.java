package com.xworkz.electronics;

public class ShoeScammer {

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		System.out.println(shoe.hashCode());
		System.out.println(shoe.toString());
		System.out.println(".............................................");

		Shoe shoe1 = new Shoe();
		System.out.println(shoe1.hashCode());
		System.out.println("///////////////////////////////////////////////////");

		shoe.setBrand("adidas");
		shoe1.setBrand("nike");
		boolean correct = shoe.equals(shoe1);
		System.out.println(correct);

	}

}
