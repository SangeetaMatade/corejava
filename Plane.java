class Plane{
static String src_name="Hubli";
 static String Des_name="Qatar";
static double TICK_Price=20000.00;
static void planename(){
String planename="INDIGO";
System.out.println("The plane name is "+planename);
}
static void clasess(){
String class1="economic";
System.out.println("The first class is "+class1);

}
static void food(){
boolean food=true;
System.out.println("The food here is good "+food);
}
public static void main(String args[]){
System.out.println("The source is "+src_name);
System.out.println("The destination  is "+Des_name);
System.out.println("The Ticket  is "+TICK_Price);
planename();
clasess();
food();
}
}
