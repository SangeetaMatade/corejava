class phonepay{
void phonepay(){
System.out.println("this is a defualt constructor");
}
void transaction(int pay){
System.out.println("function of phonepay is"+pay);
}
void transaction(String payreturn){
System.out.println("function of phonepay is"+payreturn);
}
public static void main(String[] args)
{
phonepay obj1= new phonepay();
phonepay obj2= new phonepay();
obj1.phonepay();
obj2.transaction("404error");
}
}