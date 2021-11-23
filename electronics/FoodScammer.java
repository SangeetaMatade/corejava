package com.xworkz.electronics;

public class FoodScammer {

	public static void main(String[] args) {
		Food food = new Food();
		System.out.println(food.hashCode());
		System.out.println(food.toString());
		System.out.println();

		Food food1 = new Food();
		System.out.println(food1.hashCode());
		System.out.println();

		food.setName("panipuri");
		food1.setName("gobi");
		boolean box = food.equals(food1);
		System.out.println(box);
	}

}
