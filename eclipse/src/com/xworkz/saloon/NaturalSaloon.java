package com.xworkz.saloon;

public class NaturalSaloon extends Saloon {
	
	public String name="sss";
	
	
	public NaturalSaloon() {
		this("test");
		System.out.println("invoked no arg const");
	}
	public NaturalSaloon(String name){
		System.out.println("invoked const");
	}
	

}
