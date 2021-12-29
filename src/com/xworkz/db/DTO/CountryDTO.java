package com.xworkz.db.DTO;

import java.io.Serializable;

public class CountryDTO implements Serializable {

	private int id;
	private String name, continent;
	private int code;

	public CountryDTO() {
		System.out.println("invoked no arg const");
	}

	public CountryDTO(int id, String name, String continent, int code) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", continent=" + continent + ", code=" + code + "]";
	}

}
