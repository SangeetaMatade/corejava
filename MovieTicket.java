class MovieTicket{
	
	String movieName;
	String theater;
	float price;
	int noOfSeats;
	String type;
	static float TotalPrice;
	MovieTicket(String movieName,String theater,float price,int noOfSeats,String type){
		
		this.movieName=movieName;
		this.theater=theater;
		this.price=price;
		this.noOfSeats=noOfSeats;
		this.type=type;
		System.out.println("invoked 5 parameters");
	}
	void displaydetails()
	{
		System.out.println(this.movieName);
		System.out.println(this.theater);
		System.out.println(this.price);
		System.out.println(this.noOfSeats);
		System.out.println(this.type);
	}
	void printTotalPrice()
	{
		float total=this.price*this.noOfSeats;
		System.out.println("TotalPrice  :"+total);
	}
}
		
		