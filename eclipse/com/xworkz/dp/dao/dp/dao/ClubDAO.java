package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ClubDTO;

public class ClubDAO {
	
	ClubDTO[] club=new ClubDTO[10];
	private int count;
	
	public void save(ClubDTO dto) {
		if(dto != null && this.count<0) {
			this.club[this.count]=dto;
			System.out.println("invoked save method ".concat(String.valueOf(count)));
		}
		else
		{
			System.out.println("array is full ".concat(String.valueOf(dto)));
		}
	}
	public void delete(int index) {
		if(index>=0 && index<club.length) {
			this.club[index]=null;
			System.out.println("invoked delete method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is null");
		}
	}
	public void update(ClubDTO dto,int index) {
		if(index >= 0 && index < club.length) {
			this.club[index]=dto;
			System.out.println("invoked update method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is updated ".concat(String.valueOf(dto)));
		}
		
		}
	public ClubDTO[] getClub() {
		return club;
		
	}
}
	
	


