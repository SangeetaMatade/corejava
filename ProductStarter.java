class ProductStarter{
	public static void main(String args[])
	{
		Product product1=new Product("Hair Dryer","EC",1800,2,"philips");
		product1.displaydetails();
		product1.printTotalCost();
		
		
		Product product2=new Product("Trimmer","EC",200,4,"NOVA");
		product2.printTotalCost();
		
		
		Product.printTotalProductsPrice();
	}
}
		
		
		
		
		
		
		