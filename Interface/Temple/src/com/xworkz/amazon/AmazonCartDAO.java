package com.xworkz.amazon;

public interface AmazonCartDAO {
	
	boolean  Save(CartDTO cartDTO);
	
	CartDTO findByName(String name);
	
	void displaydetails();
	
	
		
	

}
