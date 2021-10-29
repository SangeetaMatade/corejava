package com.xworkz.fish;

public class Factory {

	private String name;
	int since = 2000;
	private String product;
	private float revenue;

	public Factory() {
		System.out.println("invoked no arg const");
	}

	public Factory(String name) {
		System.out.println("invoked para const: ");
		this.name = name;
	}

	public Factory(int since) {
		System.out.println("invoked para const: " + since);
		this.since = since;

	}

}
