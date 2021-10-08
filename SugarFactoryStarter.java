class SugarFactoryStarter{
	public static void main(String args[])
	{
		SugarFactory ref=new SugarFactory();
		ref=new SugarFactory();
		Machine machine=new Machine();
		ref.machine=machine;
		ref.machine=null;
	}
}
