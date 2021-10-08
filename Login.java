class Login{
int password;
String username;
boolean submit;

public void userInfo(){
password=12345;
username="admin@adu.com";
submit=true;
System.out.println(password+" "+username+" "+submit);
}

public static void main(String args[])
{
Login obj=new Login();
obj.userInfo();
System.out.println(obj.password);
System.out.println(obj.username);
}
}