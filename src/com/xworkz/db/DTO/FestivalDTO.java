package com.xworkz.db.DTO;

import java.io.Serializable;

public class FestivalDTO implements Serializable {

	private int id;
	private String name;
	private int date;
	private String state;

	public FestivalDTO() {
		System.out.println("invoked no arg const");
	}

	public FestivalDTO(int id, String name, int date, String state) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDate() {
		return date;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", date=" + date + ", state=" + state + "]";
	}

}
