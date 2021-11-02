package com.xworkz.dp.dto;

public class InstagramApplicationDTO extends ApplicationDTO {

	private int totalUsers;
	private String serverLocation;

	public InstagramApplicationDTO() {
		super();
		System.out.println("invoked no arg const");
	}

	public InstagramApplicationDTO(int totalUsers, String serverLocation, String name, float version, String company,
			String founder) {
		super(name, version, company, founder);
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public String getServerLocation() {
		return serverLocation;
	}

	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}

}
