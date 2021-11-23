package com.xworkz.bird.Interfacedao;

import com.xworkz.bird.dto.BirdDTO;

public class ArrayBirdDAO implements BirdDAO {
	BirdDTO[] bird = new BirdDTO[10];
	int count = 0;

	@Override
	public boolean save(BirdDTO birdDTO) {
		if (birdDTO != null) {
			System.out.println("it is not null");
			for (int y = 0; y < bird.length; y++) {
				this.bird[y] = birdDTO;
				y++;
				return true;
			}
		} else {
			System.err.println("array is full");
		}
		return false;
	}

	@Override
	public BirdDTO FindByName(String name) {
		if (name != null) {
			System.out.println("invoked null check");
			for (int bed = 0; bed < bird.length; bed++) {
				if (bird[bed]!= null) {
					String name1 = bird[bed].getName();
					if (name1.equals(name)) {
						System.out.println("name found: ".concat(name));

					} else {
						System.out.println("name not found");
					}
				}

			}

		}
		System.err.println("maybe it is null");
		return null;
	}

	@Override
	public void displaydetails() {
		for (int m = 0; m < bird.length; m++) {
			if (bird[m] != null) {

				System.out.println("name: " + bird[m].getName());
				System.out.println("breed: " + bird[m].getBreed());
				System.out.println("age: " + bird[m].getAge());
				System.out.println("origine: " + bird[m].getOrigin());
			} else {
				System.err.println("bird is not having all above qualities");
			}
		}

	}

}
