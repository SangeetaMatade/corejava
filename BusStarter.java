class BusStarter
{
	public static void main(String args[])
	{
		Bus bus=new Bus(100,"red",20);
		System.out.println(bus.noOfbus);
		System.out.println(bus.color);
		System.out.println(bus.noOfseats);
		
		bus.working=new Working(true);
		Working working=bus.working;
		System.out.println(working.work);
	}
}