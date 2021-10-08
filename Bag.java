class Bag{
	int quantity;
	float noOfbag;
	float TotalPrice;
	public bag(String quantity){
	System.out.println("quantity of bag is :"+quantity);
    }
    public bag(float noOfbag){
		System.out.println("number of bag are :"+noOfbag);
	}
	void displaydetails()
	{
		System.out.println(quantity);
		System.out.println(noOfbag);
	}
	void  printtotalPrice()
	{
		float total=quantity*noOfbag;
		System.out.println("total price is :"+total);
	}
}
	
		