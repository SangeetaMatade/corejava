 class TubeLightStarter
{
	public static void main(String args[])
	{
		TubeLight light=new TubeLight();
		String name=light.getName();
		System.out.println("Tube light is "+name);
		light.setWatts(20);
		int wats=light.getWatts();
		System.out.println("Tube light watts is "+wats);
	}
}
	