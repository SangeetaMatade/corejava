package com.xworkz.exceptions.scammer;

import com.xworkz.exceptions.events.PanCardvalidationException;
import com.xworkz.exceptions.events.PanOperator;

public class PanScammer {

	public static void main(String[] args) throws PanCardvalidationException {
		
		PanOperator card = new PanOperator();
		
		card.save("AZTR4567M");
		
		

	}

}
