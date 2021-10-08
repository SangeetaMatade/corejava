class theator{
void theator(){
System.out.println("this is a defualt constructor");
}
void name(String sangeeta){
System.out.println("name of theator is"+sangeeta);
}
void owner(String muheet){
System.out.println("owner of theator is"+muheet);
}
void gstno(int a){
System.out.println("gstno of theator is"+a);
}
void noOfShows(int b){
System.out.println("noOfShows in theator are"+b);
}
void noOfseats(int c){
System.out.println("noOfSeats in theator are"+c);
}
void parking(boolean yes){
System.out.println("parking at theator is"+yes);
}
void movieRating(int r){
System.out.println("movieRating in theator"+r);
}
void location(String btm){
System.out.println("location of theator is"+btm);
}
void rating(int s){
System.out.println("rating of theator is"+s);
}
void ShowsTiming(int e){
System.out.println("ShowsTiming in theator is"+e);
}
void NoOfScreen(int m){
System.out.println("NoOfScreen in theator is"+m);
}
public static void main(String[] args)
{
theator obj1= new theator();
obj1.name("satisfied");
obj1.gstno(12);
obj1.owner("muheet");
obj1.noOfShows(5);
obj1.noOfseats(20);
obj1.parking(true);
obj1.movieRating(4);
obj1.location("btm");
obj1.rating(3);
obj1.ShowsTiming(8);
obj1.NoOfScreen(2);
}
}
