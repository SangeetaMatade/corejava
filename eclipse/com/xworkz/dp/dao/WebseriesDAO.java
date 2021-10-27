package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebseriesDTO;

public class WebseriesDAO {
	private WebseriesDTO[] webseries = new WebseriesDTO[5];
	private int count = 0;

	public void save(WebseriesDTO name) {
		if (this.count < 0 && name != null) {
			this.webseries[this.count++] = name;
			System.out.println("invoked  save method".concat(String.valueOf(name)));
		} else {
			System.out.println("array is full".concat(String.valueOf(count)));
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < webseries.length) {
			this.webseries[index] = null;
			System.out.println("index is deleted".concat(String.valueOf(index)));
		} else {
			System.out.println("index is null");
		}
	}
	public void update(int index,WebseriesDTO name) {
		if(index >= 0 && index < webseries.length && name!=null) {
			this.webseries[index] = name;
			System.out.println("the array is updated and not pointing to null".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("the index is updated".concat(String.valueOf(index)));
		}
	}
	public WebseriesDTO[] getWebseries() {
		return webseries;
		
		}
	}


