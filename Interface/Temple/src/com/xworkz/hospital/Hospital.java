package com.xworkz.hospital;

public class Hospital {

	private String name;
	private String location;
	private boolean gvt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitaDischargeRule hospitaDischargeRule;

	public Hospital() {
		System.out.println("invoked Hospital");
	}

	public Hospital(String name, String location, boolean gvt, HospitalAdmitRule hospitalAdmitRule,
			HospitaDischargeRule hospitaDischargeRule) {
		super();
		System.out.println("invoked no arg constructor");
		this.gvt = gvt;
		this.location = location;
		this.name = name;
		this.hospitaDischargeRule = hospitaDischargeRule;
		this.hospitalAdmitRule = hospitalAdmitRule;
	}

	public void admitPatient() {
		System.out.println("invoked method admitpatient");
		if (hospitalAdmitRule != null) {
			System.out.println("admitted the hospitalAdmitRule");
			String register = this.hospitalAdmitRule.register();
			System.out.println(register);
			double PayAdvance = this.hospitalAdmitRule.payAdvance();
			boolean ValidInsurance = this.hospitalAdmitRule.validInsurance();
			
				if (PayAdvance > 10000|| ValidInsurance==false)
					System.out.println("pay advance money");
					if (ValidInsurance) {
						System.out.println("insurance is valid");
					} else {
						System.out.println("insurance is not valid");
					}
			} else {
				System.out.println("not pain advance");
			}

		}

	

	public void DischargeRule() {
		System.out.println("invoked DischargeRule");
		if (hospitaDischargeRule != null) {
			System.out.println("invoked hospital discharge rules");
			boolean Paybill = this.hospitaDischargeRule.payBill();
			if (Paybill) {
				System.out.println("bill paid");
			}
			double Discount = this.hospitaDischargeRule.discount();
			if (Discount > 4000) {
				System.out.println("discount is more than 4000");
			} else {
				System.out.println("no discount");
			}
		} else {
			System.out.println("bill not paid");

		}
	}

}
