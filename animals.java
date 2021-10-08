class animals{
void animals(){
System.out.println("this is default constructor");
}
void adopted(string a){
System.out.println("adopted animal is"+a);
}
void notadopted(string b){
System.out.println("nonadopted animal is"+b);
}
public static void main(string args[]);
{
animals obj1=new animals();
obj1.adopted("dog");
obj1.notadopted("lion");
}
}

