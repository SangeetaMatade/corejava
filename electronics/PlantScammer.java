package com.xworkz.electronics;

public class PlantScammer {

	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.hashCode());
		System.out.println(plant.toString());
		System.out.println();

		Plant plant1 = new Plant();
		System.out.println(plant1.hashCode());
		System.out.println(plant1.toString());
		String tv="color";
		System.out.println(plant1.hashCode());
		System.out.println();
		
		plant.setName("Maple");
		plant1.setName("Maple");
		boolean equal = plant.equals(plant1);
		System.out.println(equal);

	}

}
