package com.xworkz.exceptions.events;

public class PanOperator {
	private String[] mad = new String[3];
	private int count=0;
	String  pan1;
	
	
	public boolean save(String pan) throws PanCardvalidationException {
		System.out.println("invoked method save");
		 pan = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		if(pan!=null && count<mad.length) {
			if(pan.matches(pan1)) {
		mad[count++]=pan;
			System.out.println("it matches so it can be validate");
			return true;
			}
		
			else
			{
		System.out.println("it is not validated");
		throw new PanCardvalidationException();
		}
}
		return false;
		
	}

}
