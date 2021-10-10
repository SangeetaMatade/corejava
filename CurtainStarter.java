class CurtainStarter
{
public static void main(String args[])
{
	Curtain curtain=new Curtain();
	curtain.setColor("Blue");
	String color=curtain.getColor();
	System.out.println("color of curtain is  "+color);
	curtain.setNoOfcurtain(5);
	int noOfcurtain=curtain.getNoOfcurtain();
	System.out.println("number of curtains are "+noOfcurtain);
	curtain.setType("Long");
	String type=curtain.getType();
	System.out.println("type of curtain is "+type);
	curtain.setPrice(1250.00f);
	float  price=curtain.getPrice();
	System.out.println("price of curtain is "+price);
	curtain.setBrand("Sangeeta");
	String brand=curtain.getBrand();
	System.out.println("brand of curtain is "+brand);
}
}
	
	
	