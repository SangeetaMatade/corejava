package com.xworkz.hospital;

public class PublicHospitalRule implements HospitalAdmitRule,HospitaDischargeRule {

	@Override
	public boolean payBill() {
		System.out.println("implimented paybill");		
		return false;
	}

	@Override
	public double discount() {
		System.out.println("implimented discount");
		return 1000;
	}

	@Override
	public String register() {
		System.out.println("implimented register");
		return null;
	}

	@Override
	public double payAdvance() {
		System.out.println("implimented payAdvance");
		return 0;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("implimented validInsurance");
		return false;
	}

}
