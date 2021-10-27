package com.xworkz.dp.dao;

import com.xworkz.dp.dto.BucketDTO;


public class BucketDAO {

	BucketDTO[] bucket=new BucketDTO[7];
	private int count;
	
	public void save(BucketDTO dto) {
		if(this.count <0 && dto !=null ) {
		this.bucket[this.count]=dto;
		System.out.println("invoked save method ".concat(String.valueOf(count)));
		}
		else
		{
			System.out.println("array i full ".concat(String.valueOf(dto)));
		}
	}
	
	public void delete(int index) {
		if(index >= 0 && index < bucket.length ) {
			this.bucket[index]=null;
			System.out.println("invoked delete method ".concat(String.valueOf(index)));
		}
		else
		{
			System.out.println("array is full");
		}
	}
	public void update(int index, BucketDTO dto) {
		if (index >= 0 && index < bucket.length && dto != null) {
			this.bucket[index] = dto;
			System.out.println("the array is updated and not pointing to null".concat(String.valueOf(index)));
		} else {
			System.out.println("the index is updated".concat(String.valueOf(index)));
		}
	}
	public BucketDTO[] getBucket() {
		return bucket;
		
	}
	
		}
	
