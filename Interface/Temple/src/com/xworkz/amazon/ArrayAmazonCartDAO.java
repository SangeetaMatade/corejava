package com.xworkz.amazon;

public class ArrayAmazonCartDAO implements AmazonCartDAO {
	CartDTO[] dtos = new CartDTO[10];
	int text = 0;

	@Override
	public boolean Save(CartDTO cartDTO) {
		if (cartDTO != null) {
			for (int pg = 0; pg < dtos.length; pg++) {
				this.dtos[pg] = cartDTO;
				pg++;
				return true;
			}
		} else {
			System.err.println(" array is full");
		}
		return false;

	}

	@Override
	public CartDTO findByName(String name) {
		if (name != null) {
			for (int k = 0; k < dtos.length; k++) {
				if (dtos[k] != null) {
					String Name = dtos[k].getName();
					if (Name.equals(name)) {
						System.out.println("name found : ".concat(name));
						
					} else {
						System.err.println("name not found");
					}
				}
			}
		}
		System.err.println("it may be null");
		return null;

	}

	@Override
	public void displaydetails() {

		for (int z = 0; z < dtos.length; z++) {
			if (dtos[z] != null) {

				System.out.println("name : " + dtos[z].getName());
				System.out.println("quantity : " + dtos[z].getQuantity());
				System.out.println("Total price : " + dtos[z].getPrice());
			} else {
				System.err.println("cart is empty");
				

			}
		}
	}
}
