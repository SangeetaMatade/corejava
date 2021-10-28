package com.xworkz.saloon;

public class Saloon {
	public String name="xyz";
	public int NoOfstaffs=3;
	
	public Saloon() {
		this("test");
		System.out.println("invoked no arg const");
	}
    public Saloon(String name) {
    	System.out.println("invoked arg const");
    }
}
