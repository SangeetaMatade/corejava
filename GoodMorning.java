class GoodMorning{
static int a=2,b=3,sum;
static int add(){
sum = a+b;
return sum;
}
static int sub(){
int sub = a-b;
return sum;
}
public static void main(String args[]){
System.out.println(sum);
add();
System.out.println(sum);
sub();
System.out.println(sum);
}
}