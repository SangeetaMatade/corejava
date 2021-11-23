package com.xworkz.bird.Interfacedao;

import com.xworkz.bird.dto.BirdDTO;

public class BirdImplementationUser {

	BirdDAO birdDAO;

	BirdDAO dao;

	public BirdImplementationUser(BirdDAO dao) {
		super();
		this.dao = dao;

	}

	public void save(BirdDTO bird) {
		if (bird != null) {
			boolean sweet = dao.save(bird);
			if (sweet) {
				System.out.println("invoked method save");
			} else {
				System.out.println("not saved");
			}
		} else {
			System.out.println("pass null");

		}
	}

	public void FindByName(String bird) {
		if (bird != null) {
			this.dao.FindByName(bird);
		} else {
			System.out.println("null");
		}
	}

	public void display() {
		if (dao != null) {
			dao.displaydetails();
		}
	}

}
