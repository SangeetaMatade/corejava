package com.xworkz.electronics;

public class WatchScammer {

	public static void main(String[] args) {
		Watch wt = new Watch();
		System.out.println(wt.hashCode());
		System.out.println(wt.toString());
		Watch wt2 = new Watch();
		System.out.println(wt2.hashCode());
		System.out.println(wt2.toString());

		wt.setBrand("sonata");
		wt2.setBrand("xyz");
		boolean equal = wt.equals(wt2);
		System.out.println(equal);
	}
}