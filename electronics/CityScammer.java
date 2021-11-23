package com.xworkz.electronics;

public class CityScammer {

	public static void main(String[] args) {
		City city = new City();
		System.out.println(city.hashCode());
		System.out.println(city.toString());
		System.out.println();
		
		
		City city1 = new City();
		System.out.println(city.toString());
		System.out.println();
		
		city.setName("gadag");
		city1.setName("hubli");
		boolean equal = city.equals(city1);
		System.out.println(equal);
	}

}
