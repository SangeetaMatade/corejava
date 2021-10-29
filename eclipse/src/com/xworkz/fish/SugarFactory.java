package com.xworkz.fish;

public class SugarFactory extends Factory{
	
	public SugarFactory() {
		super();
		System.out.println("invoked no arg const");
	}
public SugarFactory(String product) {
	super();
	System.out.println("invoked para const: "+product);
}
public SugarFactory(int since) {
	System.out.println("invoked para const: "+since);
}

}
