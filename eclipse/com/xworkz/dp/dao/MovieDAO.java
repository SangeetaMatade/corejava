package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;
import com.xworkz.dp.dto.MovieDTO;

public class MovieDAO {
	MovieDTO[] movie = new MovieDTO[4];
	private int count;

	public void create(MovieDTO dto) {
		if (dto != null && this.count < this.movie.length) {
			System.out.println();
			this.movie[this.count] = dto;
			System.out.println("invoked create method :".concat(String.valueOf(dto.getName())));
		} else {
			System.out.println("invoked create ".concat(String.valueOf(count)));
		}
	}

	public void create(MovieDTO dto, int index) {
		System.out.println("invoked overloaded int " + "invoked overloaded String");
		if (index >= 0 && index < this.movie.length && dto != null) {
			System.out.println();
			this.movie[index] = dto;
			System.out.println("index is overloaded".concat(String.valueOf(index)));
		} else {
			System.err.println("index is overloaded ".concat(String.valueOf(dto)));
		}
	}

	public int indexoccupied() {
		return this.count;
	}

	public boolean matchByname(String name) {
		System.out.println("invoked matchbyname");
		System.out.println("name passed".concat(name));
		for (int gudnyt = 0; gudnyt < this.movie.length; gudnyt++) {

			{
				MovieDTO ref = this.movie[gudnyt];
				if (ref != null) {
					System.out.println("ref in index is not null".concat(String.valueOf(gudnyt)));
					String nme = ref.getName();
					System.out.println("matching ".concat(nme));
					if (name.endsWith(nme)) {
						System.out.println("name found");
						return true;
					}
				}
			}

		}
		return false;
	}
	public MovieDTO[] getMovie() {
		return this.movie;



}
}
