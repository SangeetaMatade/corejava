class FoodItem{
String name;
float price;
String hotelName;
int quantity;
FoodType Type;
int rating;
FoodOrderType orderType;
static float totalFoodItemprice;
FoodItem(String name,float price,String hotelName,int quantity,FoodType Type,int rating,FoodOrderType orderType)

{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.quantity=quantity;
	this.Type=Type;
	this.rating=rating;
	this.orderType=orderType;
	System.out.println("invoked  7 parameters");

 }
FoodItem(String name,float price,int quantity)
{
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	System.out.println("invoked  3 parameters");
}
void displaydetails()
{
	
	System.out.println("display is invoked");
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelName);
	System.out.println(this.quantity);
	System.out.println(this.Type);
	System.out.println(this.rating);
	System.out.println(this.orderType);
	
}
void Totalprice()

{
float total=this.quantity*this.price;
System.out.println("TotalPrice :"+total);
totalFoodItemprice=totalFoodItemprice+total;
System.out.println("Total FoodItem Price :"+totalFoodItemprice);

}
static void printtotalFoodItemprice()
{
	System.out.println("total FoodItem price :"+totalFoodItemprice);
}
}



	
	