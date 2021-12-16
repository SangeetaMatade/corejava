package com.xworkz.implemented;

import com.xworkz.marker.Find;

public class ElementEqual implements Find{
	
	@Override
	public boolean expression(String arg1, String arg2) {
		System.out.println("Invoked expression by equals method");
		return arg1.equals(arg2);
	}

}

