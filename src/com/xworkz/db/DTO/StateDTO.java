package com.xworkz.db.DTO;

public class StateDTO {
	
	private int stateid;
	private String name;
	private int statecode;
	private String capital;
	
	public StateDTO() {
		System.out.println("invoked no arg const");
	}

	public StateDTO(int stateid, String name, int statecode, String capital) {
		super();
		this.stateid = stateid;
		this.name = name;
		this.statecode = statecode;
		this.capital = capital;
	}

	public int getStateid() {
		return stateid;
	}

	public String getName() {
		return name;
	}

	public int getStatecode() {
		return statecode;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public String toString() {
		return "StateDTO [stateid=" + stateid + ", name=" + name + ", statecode=" + statecode + ", capital=" + capital
				+ "]";
	}

}
