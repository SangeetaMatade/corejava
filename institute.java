class institute{
void institute(String m){
System.out.println("name of institutue"+m);
}
void Numofstds(int a){
System.out.println("number of students in institute are"+a);
}
void Numofstaff(int b){
System.out.println("number of staff in institute are"+b);
}
void techng(boolean e){
System.out.println("teachig of institute is "+e);
}
void rvws(boolean f){
System.out.println("reviews of institute are"+f);
}
public static void main(String args[]){
institute obj1=new institute();
obj1.m("welcometoinstitute");
obj1.Numofstds(30);
obj1.Numofstaff(20);
obj1.techng(true);
obj1.rvws(false);
}
} 