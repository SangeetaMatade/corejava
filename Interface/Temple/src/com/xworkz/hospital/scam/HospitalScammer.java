package com.xworkz.hospital.scam;

import com.xworkz.hospital.HospitaDischargeRule;
import com.xworkz.hospital.Hospital;
import com.xworkz.hospital.HospitalAdmitRule;
import com.xworkz.hospital.PublicHospitalRule;

public class HospitalScammer {

	public static void main(String[] args) {
		HospitalAdmitRule hospitalAdmitRule = new PublicHospitalRule();
		HospitaDischargeRule hospitaDischargeRule = new PublicHospitalRule();
		
		Hospital hospital=new Hospital("Sangeeta", "Bengaluru", true, hospitalAdmitRule, hospitaDischargeRule);
		hospital.admitPatient();
		hospital.DischargeRule();
		

	}

}
