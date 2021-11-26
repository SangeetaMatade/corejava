package com.xworkz.exceptions.events;

import com.xworkz.exceptions.events.handler.EmailvalidationException;
import com.xworkz.exceptions.events.handler.StorageFullRuntimeexception;

public class EmailOperator {

	private String[] email = new String[3];
	private int count = 0;

	public void save(String mail) throws EmailvalidationException{
		System.out.println("invoked method save");
		if (mail != null && count < email.length) {
			this.email[count++] = mail;
			if (mail.contains("@") && mail.endsWith(".com")) {
				System.out.println("ok i will save your email only when it is validated");
			} else {
				System.out.println("if i dint save your email then understand that it is not validated....");
				throw new EmailvalidationException();
			}
		} else {
			System.out.println("ada hengo ni null pass madi email validate madu anta heltidiya....idella nadiyalla");
			
			throw new StorageFullRuntimeexception("leee full ageti");
			
		
	}
	}
	

}
