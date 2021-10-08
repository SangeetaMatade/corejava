class Food{
public Food(){
System.out.println("default constructor");
}
public Food(String swt){
System.out.println("love to have sweet "+swt);
}
public Food(int a){
System.out.println("number of sweets are "+a);
}
public static void main(String args[]){
Food obj1=new Food("rasmalayi");
Food obj=new Food(6);
}
}
