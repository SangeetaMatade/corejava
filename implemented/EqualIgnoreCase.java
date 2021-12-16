package com.xworkz.implemented;

import com.xworkz.marker.Find;

public class EqualIgnoreCase implements Find {
	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("invoked EqualIgnoreCase");
		return arg1.equalsIgnoreCase(arg2);
	}

}


