package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MetroStationDTO;

public class MetroStationDAO {
	
	MetroStationDTO[] metro=new MetroStationDTO[10];
	private int count ;
	
	
	public void save(MetroStationDTO dto) {
		if(dto != null && this.count<0) {
			this.metro[count]=dto;
			System.out.println("invoked save method ".concat(String.valueOf(count)));
		}
		else
		{
			System.out.println("array is full ".concat(String.valueOf(dto)));
		}
	}
	public void delete(int index) {
		if(index>=0 && index<metro.length) {
			this.metro[index]=null;
			System.out.println("invoked delete method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is null");
		}
		
		}
	public void update(MetroStationDTO dto,int index) {
		if(index >= 0 && index < metro.length && dto!=null) {
		  this.metro[index] = dto;
		System.out.println("invoked update method ".concat(String.valueOf(index)));
	}
		else
		{
			System.out.println("index is null ".concat(String.valueOf(dto)));
		}
	}
	public MetroStationDTO[] getmetrostation() {
		return metro;
	
	
		
	}
}




