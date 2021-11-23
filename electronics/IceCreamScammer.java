package com.xworkz.electronics;

public class IceCreamScammer {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		System.out.println(ice.hashCode());
		System.out.println();
		
		IceCream ice1 = new IceCream();
		System.out.println(ice1.hashCode());
		System.out.println(ice.toString());
		System.out.println();
		
		ice.setName("mango");
		ice1.setName("mango");
		boolean equal = ice.equals(ice1);
		System.out.println(equal);
		

	}

}
