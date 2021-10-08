class FoodItemStarter{
	public static void main(String args[]){
		FoodType Type=FoodType.SPICY;
		FoodOrderType orderType=FoodOrderType.HALFPLATE;
		FoodItem foodItem=new FoodItem("manchurian",30.0f,"president",50,Type,3,orderType);
		foodItem.displaydetails();
		foodItem.Totalprice();
		
		FoodItem.printtotalFoodItemprice();
	}
}