class Coldrinks{
public Coldrinks(){
System.out.println("lets have coldrinks");
}
public Coldrinks(Sting brnd){
this(false);
System.out.println("brand of coldrinks is "+brnd);
}
public Coldrinks(boolean true){
this(brand);
System.out.println("brand of coldrinks is "+brnd);
}
public static void main(String args[]){
Coldrinks obj=new Coldrinks("dew");
}
}


