package com.xworkz.dp.dto;

public class ClubDTO {
private int noOfpeople;
private int noOfbottle;
private int rating;
private float entryprice;
private int noOfStaff;
public ClubDTO() {
	System.out.println("invvoked no arg default const");
}
public ClubDTO(int noOfpeople, int noOfbottle, int rating, float entryprice, int noOfStaff) {
	super();
	this.noOfpeople = noOfpeople;
	this.noOfbottle = noOfbottle;
	this.rating = rating;
	this.entryprice = entryprice;
	this.noOfStaff = noOfStaff;
}
public int getNoOfpeople() {
	return noOfpeople;
}
public void setNoOfpeople(int noOfpeople) {
	this.noOfpeople = noOfpeople;
}
public int getNoOfbottle() {
	return noOfbottle;
}
public void setNoOfbottle(int noOfbottle) {
	this.noOfbottle = noOfbottle;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public float getEntryprice() {
	return entryprice;
}
public void setEntryprice(float entryprice) {
	this.entryprice = entryprice;
}
public int getNoOfStaff() {
	return noOfStaff;
}
public void setNoOfStaff(int noOfStaff) {
	this.noOfStaff = noOfStaff;
}
}
