package com.xworkz.electronics;

public class IpodScammer {

	public static void main(String[] args) {
		Ipod ipd = new Ipod();
		System.out.println(ipd.toString());
		System.out.println(ipd.hashCode());
		Ipod ipd2 = new Ipod();
		System.out.println(ipd.hashCode());
		
	    ipd.setModelno("GGH02");
		ipd2.setModelno("GGH01");
		boolean equal=ipd.equals(ipd2);
	    System.out.println(equal);
	

	}

}
