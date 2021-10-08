class daydreamer{
void daydreamer(){
//default constructor
System.out.println("hero name canyaman");
}
void daydreamer(String name){
//parameter constructor
System.out.println("actress name saneim");
}
public static void main(String[] args)
{
daydreamer obj1= new daydreamer();
obj1.daydreamer();
obj1.daydreamer("all actors");
}
}