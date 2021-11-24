package com.xworkz.exceptions.events;

public class Bag {
	
	public void method1() throws Exception{
		System.out.println("invoked method");
		method2();
	}
	public void method2() throws Exception{
		System.out.println("invoked method");
		method3();
	}
	public void method3() throws Exception{
		System.out.println("invoked method");
		method4();
	}
	public void method4()throws Exception {
		System.out.println("invoked method");
		method5();
	}
	public void method5() throws Exception{
		System.out.println("invoked method");
		method6();
	}
	public void method6() throws Exception {
		System.out.println("invoked method");
		throw new Exception();
	}
	

}
