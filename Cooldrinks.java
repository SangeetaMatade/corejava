class Cooldrinks{
public Cooldrinks(){s
System.out.println("lets have coldrinks");
}
public Cooldrinks(Sting brnd){
this(5);
System.out.println("brand of coldrinks is "+brnd);
}
public Cooldrinks(int sn){
this();
System.out.println("brand of coldrinks is "+sn);
}
public static void main(String args[]){
Cooldrinks obj=new Cooldrinks("dew");
Cooldrinks obj1=new Cooldrinks(64);
}
}


