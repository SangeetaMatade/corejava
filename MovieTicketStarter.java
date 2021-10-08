class MovieTicketStarter{
	public static void main(String args[]){
		 
		 MovieTicket movieTicket=new MovieTicket("BangBang","pvr",200.0f,80,"actionmovie");
		 movieTicket.displaydetails();
		 movieTicket.printTotalPrice();
	}
}