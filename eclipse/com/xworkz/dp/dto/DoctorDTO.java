package com.xworkz.dp.dto;

public class DoctorDTO {
	private String name;
	private String specilization;
	private String hospitalname;
	private boolean gender;
	private int salary;
	private int age;
	public DoctorDTO() {
		System.out.println("invoked no arg def const");
	}
	public DoctorDTO(String name, String specilization, String hospitalname, boolean gender, int salary, int age) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospitalname = hospitalname;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
