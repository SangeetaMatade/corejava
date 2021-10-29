package com.xworkz.dp.dto;

import com.xworkz.dp.Genre;

public class WebseriesDTO {
	String name;
	Genre genre;
	int rating;

	public WebseriesDTO() {
		System.out.println("invoked no arg def const");

	}

	public WebseriesDTO(String name, Genre genre, int rating) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}