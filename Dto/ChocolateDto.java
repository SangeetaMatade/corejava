package com.xworkz.Dto;

public class ChocolateDto {
	
	private String name,type;
	private int noOfchoc,noOfIngredients;
	
	public ChocolateDto() {
		System.out.println("invoked no arg const");
	}

	public ChocolateDto(String name, String type, int noOfchoc, int noOfIngredients) {
		super();
		this.name = name;
		this.type = type;
		this.noOfchoc = noOfchoc;
		this.noOfIngredients = noOfIngredients;
	}
	@Override
	public int hashCode() {
		
		return 98;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ChocolateDto) {
				ChocolateDto casted = (ChocolateDto)obj;
				if(this.name.equals(name) && this.type.equals(type) && this.noOfchoc==(casted.noOfchoc)&& this.noOfIngredients==(casted.noOfIngredients)) {
					return true;
					
				}
				else
				{
					return false;
				}
			}
		}
	return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfchoc() {
		return noOfchoc;
	}

	public void setNoOfchoc(int noOfchoc) {
		this.noOfchoc = noOfchoc;
	}

	public int getNoOfIngredients() {
		return noOfIngredients;
	}

	public void setNoOfIngredients(int noOfIngredients) {
		this.noOfIngredients = noOfIngredients;
	}
	@Override
	public String toString() {
	
		return name+" "+type+": "+noOfchoc+": "+noOfIngredients;
	}

}
