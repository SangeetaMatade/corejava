package com.xworkz.amazon.scammer;

import com.xworkz.amazon.AmazonBuisness;
import com.xworkz.amazon.AmazonCartDAO;
import com.xworkz.amazon.ArrayAmazonCartDAO;
import com.xworkz.amazon.CartDTO;

public class AmazonScammer {

	public static void main(String[] args) {
		CartDTO cartDTO1 = new CartDTO("dress", 2, 500.0f, 3);

		AmazonCartDAO cart1 = new ArrayAmazonCartDAO();

		AmazonBuisness amazonBusiness = new AmazonBuisness(cart1);
		amazonBusiness.save(cartDTO1);
		amazonBusiness.displayCart();
		amazonBusiness.findByName("dress");

		CartDTO cartDTO2 = new CartDTO("bags", 6, 5550f, 9);
		AmazonCartDAO cart2=new ArrayAmazonCartDAO();
		AmazonBuisness amazonBusiness34=new AmazonBuisness(cart2);	
		amazonBusiness34.save(cartDTO2);
		amazonBusiness34.displayCart();
		amazonBusiness34.findByName("bags");


	}

}
