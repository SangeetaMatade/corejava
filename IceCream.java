class IceCream{
String flavour="Vanilla";//literals
Color color=Color.BLACK;//literals
float temp;//const
String type;//ref
Brand brand;//ref

IceCream(float temp)
{
	this.temp=temp;
}
IceCream(float temp,String flavour,Color color)
{
	this(temp);
	this.flavour=flavour;
	this.color=color;
}
}