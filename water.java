class water{
boolean tst=true;

static void drinking(){
System.out.println("invoked drinking");
}

void washing(){
System.out.println("invoked washing");
System.out.println("taste of water is" +tst);
this.drinking();
}
}

