class WatchStarter{ 
     
	 
	 
	 public static void main(String args[]){

             Watch watch=new Watch(467,"Rolex");
			 System.out.println(watch.model);
			 System.out.println(watch.brand);
			 int model=watch.model;     //to call-->instance variable=ref name.property of class,,,,,,if it is nonstatic//
             String brand=watch.brand;  //to call-->instance variable=ref name.property of class,,,,,,if it is nonstatic//
			 Light light=watch.light;   //to call-->instance variable=ref name.property of class,,,,,,if it is nonstatic//
			 System.out.println("light on");
	 }
}