class Pencil{
Pencil(String nme){
System.out.println("name of the pencil is "+nme);
}
Pencil(int cst){
System.out.println("cost of the pencil is "+cst);
}
public static void main(String args[]){
Pencil obj=new Pencil("apsara");
Pencil obj1=new Pencil(6);
}
}