package com.xworkz.db.DTO;

import java.io.Serializable;

public class ClubDTO implements Serializable {

	private int cid;
	private String name;
	private String location;
	private int bouncers;

	public ClubDTO() {
		System.out.println("invoked no arg const");
	}

	public ClubDTO(int cid, String name, String location, int bouncers) {
		super();
		this.cid = cid;
		this.name = name;
		this.location = location;
		this.bouncers = bouncers;
	}

	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getBouncers() {
		return bouncers;
	}

	@Override
	public String toString() {
		return "ClubDTO [cid=" + cid + ", name=" + name + ", location=" + location + ", bouncers=" + bouncers + "]";
	}

}
