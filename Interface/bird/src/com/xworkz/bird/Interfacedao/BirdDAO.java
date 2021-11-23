package com.xworkz.bird.Interfacedao;

import com.xworkz.bird.dto.BirdDTO;

public interface BirdDAO {

	boolean save(BirdDTO birdDTO);

	BirdDTO FindByName(String name);

	void displaydetails();

}
