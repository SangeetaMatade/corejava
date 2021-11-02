package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicationDTO;

public class ApplicationDAO {
	private ApplicationDTO[] applicaationdto = new ApplicationDTO[5];
	private FacebookApplicationDTO[] facebookApplicationDTO = new FacebookApplicationDTO[5];
	private InstagramApplicationDTO[] instagramApplicationDTO = new InstagramApplicationDTO[5];
	private int count = 0;

	public void save(ApplicationDTO dto) {
		if (dto != null && count < this.applicaationdto.length && count >= 0) {
			this.applicaationdto[count++] = dto;
			System.out.println("invoked save method: " + dto.getName());
		} else {
			System.out.println("save method is not updated");
		}

	}

	public void DisplayAllApplication() {
		for (int d = 0; d < 10; d++) {
			ApplicationDTO ref = this.applicaationdto[d];
			if (ref != null) {
				System.out.println("invoked the display all application");
				System.out.println(ref.getName());
				System.out.println(ref.getFounder());
				System.out.println(ref.getCompany());
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			} else {
				System.err.println("display is not shown");
			}
		}
	}

	public String getApplicationDTOByName(String name) {
		System.out.println("invoked application by name");
		for (int i = 0; i < this.applicaationdto.length; i++) {
			ApplicationDTO ref1 = this.applicaationdto[i];
			if (ref1 != null) {
				String ref2 = ref1.getName();
				if (ref2.equals(name)) {
					System.out.println(ref1.getName());
					return ref1.getName();
				}
			}
		}
		return "Application name error";
	}

	public FacebookApplicationDTO[] getFaceBookApplicationDTOs() {
		return facebookApplicationDTO;
	}

	public InstagramApplicationDTO[] getInstagramDTOs() {
		return instagramApplicationDTO;
	}

	public ApplicationDTO[] getApplicationDTOs() {
		return applicaationdto;

	}
}