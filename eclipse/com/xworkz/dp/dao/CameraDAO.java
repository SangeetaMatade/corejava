package com.xworkz.dp.dao;


import com.xworkz.dp.dto.CameraDTO;

public class CameraDAO {
	
	CameraDTO[] cam=new CameraDTO[5];
	private int count;
	
	public void save(CameraDTO dto) {
		if(dto != null && this.count<0) {
			this.cam[this.count]=dto;
			System.out.println("invoked save method ".concat(String.valueOf(count)));
		}
		else
		{
			System.out.println("array is full ".concat(String.valueOf(dto)));
		}
	}
	public void delete(int index) {
		if(index < 0 && index>=cam.length) {
		this.cam[index]=null;
		System.out.println("invoked delete method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is null");
		}
	}
	public void update(int index,CameraDTO dto) {
		if(index>=0 && index<cam.length && dto!=null) {
			this.cam[index]= dto;
			System.out.println("invoked update method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("index is updated ".concat(String.valueOf(index)));
		}
	}
	public CameraDTO[] getcamera() {
		return cam;
			
		
			
		}
	}
	
	
	


