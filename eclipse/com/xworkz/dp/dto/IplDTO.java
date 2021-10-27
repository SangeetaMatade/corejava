package com.xworkz.dp.dto;

public class IplDTO {
	private String TeamName;
	private int noOfTeams;
	private String owner;
	private String sponsors;
	private int noOfplayers;

	public IplDTO() {
		System.out.println("invoked no arg const");
	}

	public IplDTO(String teamName, int noOfTeams, String owner, String sponsors, int noOfplayers) {
		super();
		TeamName = teamName;
		this.noOfTeams = noOfTeams;
		this.owner = owner;
		this.sponsors = sponsors;
		this.noOfplayers = noOfplayers;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public int getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsors() {
		return sponsors;
	}

	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}

	public int getNoOfplayers() {
		return noOfplayers;
	}

	public void setNoOfplayers(int noOfplayers) {
		this.noOfplayers = noOfplayers;
	}

}
