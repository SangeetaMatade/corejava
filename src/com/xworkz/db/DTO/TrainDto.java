package com.xworkz.db.DTO;

public class TrainDto {

	private int tid;
	private String trainNo;
	private String boarding;
	private String destination;
	private int seatNo;
	private int price;
	private String name;

	public TrainDto() {
		System.out.println("invoked no arg const");
	}

	public TrainDto(int tid, String trainNo, String boarding, String destination, int seatNo, int price, String name) {
		super();
		this.tid = tid;
		this.trainNo = trainNo;
		this.boarding = boarding;
		this.destination = destination;
		this.seatNo = seatNo;
		this.price = price;
		this.name = name;
	}

	public int getTid() {
		return tid;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public String getDestination() {
		return destination;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TrainDto [tid=" + tid + ", trainNo=" + trainNo + ", boarding=" + boarding + ", destination="
				+ destination + ", seatNo=" + seatNo + ", price=" + price + ", name=" + name + "]";
	}

}
