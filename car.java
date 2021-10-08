class car{
public car(){
System.out.println("default constructor");
}
public car(String nme){
this(9);
System.out.println("name of car is: "+nme);
}
public car(int ss){
this();
System.out.println("cost of car is: "+ss);
}
public static void main(String args[]){
car obj=new car("toyota");
car obj1=new car (90);
}
}
