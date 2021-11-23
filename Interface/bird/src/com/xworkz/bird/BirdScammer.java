package com.xworkz.bird;

import com.xworkz.bird.Interfacedao.ArrayBirdDAO;
import com.xworkz.bird.Interfacedao.BirdDAO;
import com.xworkz.bird.Interfacedao.BirdImplementationUser;
import com.xworkz.bird.dto.BirdDTO;

public class BirdScammer {

	public static void main(String[] args) {
		BirdDTO birddto = new BirdDTO("parrot", "rajwada", 2, "europe", true);
		BirdDAO b1 = new ArrayBirdDAO();

		BirdImplementationUser implementaion = new BirdImplementationUser(b1);
		implementaion.save(birddto);
		implementaion.display();
		implementaion.FindByName("parrot");
		
		
	/* 	BirdDTO birddto2 = new BirdDTO("peacock", "Indian Peafowl", 3, "India", false);
		BirdDAO b2 = new ArrayBirdDAO();
		BirdImplementationUser implementaion1 = new BirdImplementationUser(b2);
		implementaion1.save(birddto2);
	
		implementaion1.display();
		implementaion1.FindByName("peacock");
*/
	}

}
