class Home{
static String nmofHome;
static int people;
static String nmofHome(String a){
nmofHome=a;
return nmofHome;
}
static int people(int a)
{
people=a;
return people;
}
static void display(){
System.out.println("name of home"+nmofHome);
System.out.println("people in home"+people);
}
}
