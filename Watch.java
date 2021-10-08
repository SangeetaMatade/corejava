class Watch{        //association method-->this is a connection between two classes to set their objects//


     int model=478; //instance variable
     String brand="Rolex"; //instance variable
     Light light=new Light();

     Watch(int Model,String Rolex){ //instance method
	 this.model=model;   //ifinstance variable =local variable 
	 this.brand=brand;   //ifinstance variable =local variable
	 
	 System.out.println("invoked int and String constand");
     
 }
     }
