package com.xworkz.db.DTO;

import java.io.Serializable;

public class CityDTO implements Serializable {
	
	private int cityid;
	private String cityname;
	
	public CityDTO() {
		System.out.println("invoked no arg const");
	}

	public CityDTO(int cityid, String cityname) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
	}

	public int getCityid() {
		return cityid;
	}

	public String getCityname() {
		return cityname;
	}

	@Override
	public String toString() {
		return "CityDTO [cityid=" + cityid + ", cityname=" + cityname + "]";
	}
	

}
