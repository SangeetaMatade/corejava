package com.xworkz.exceptions.scammer;

import com.xworkz.exceptions.events.EmailOperator;
import com.xworkz.exceptions.events.handler.EmailvalidationException;


public class Emailscammer {

	public static void main(String[] args) throws EmailvalidationException {
		
		EmailOperator em=new EmailOperator();
		em.save("sangeeta@gmail.com");
		em.save("sange@gmail.com");
		em.save("sangeeta@gmail.co");
		//em.save("varshi@gmail.com");
		//em.save("sangeeta@gmail.com");
		//em.save("geeta@gmail.com");
		
	}
	
}
