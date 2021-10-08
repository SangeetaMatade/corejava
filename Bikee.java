class Bikee{
public Bikee(){
System.out.println("default constructor");
}
public  Bikee(String nme){
System.out.println("Name of the bikee is "+nme);
}
public  Bikee(int cst){
System.out.println("cost of bikee is "+cst);
}
public static void main(String args[]){
Bikee obj =new Bikee("Royalenfield");
Bikee obj1=new Bikee(33);
}
}

