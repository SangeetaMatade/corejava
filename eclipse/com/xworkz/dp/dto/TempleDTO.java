package com.xworkz.dp.dto;

public class TempleDTO {
String name;
String location;
String mainGod;
boolean prasada;
int yestgante;
public TempleDTO() {
	System.out.println("invoked const");
}
public TempleDTO(String name, String location, String mainGod, boolean prasada, int yestgante) {
	super();
	this.name = name;
	this.location = location;
	this.mainGod = mainGod;
	this.prasada = prasada;
	this.yestgante = yestgante;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getMainGod() {
	return mainGod;
}
public void setMainGod(String mainGod) {
	this.mainGod = mainGod;
}
public boolean isPrasada() {
	return prasada;
}
public void setPrasada(boolean prasada) {
	this.prasada = prasada;
}
public int getYestgante() {
	return yestgante;
}
public void setYestgante(int yestgante) {
	this.yestgante = yestgante;
}
}
