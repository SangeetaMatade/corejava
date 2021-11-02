package com.xworkz.fish;

public class CobraSnake extends Snake {
	boolean bite;
	
	public CobraSnake() {
		System.out.println("invoked no arg const ");
		}
	public void Hood()
	{
		super.length=77;
		System.out.println(super.length);
		System.out.println();
		super.name="xyz";
		System.out.println(super.name);
		System.out.println();
		this.bite=true;
		System.out.println(this.bite);
		System.out.println();
		super.poisonous=true;
		System.out.println(this.poisonous);
				
	}
	public void castexep(String cast) {
		this.poisonous=poisonous;
	}
}
