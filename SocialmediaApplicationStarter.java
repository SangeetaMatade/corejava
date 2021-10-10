class SocialmediaApplicationStarter
{
	public static void main(String args[])
	{
		SocialmediaApplication mediaapp=new SocialmediaApplication();
		mediaapp.setName("Instagram");
		System.out.println(mediaapp.name);
		mediaapp.setSize(20);
		System.out.println(mediaapp.size);
		mediaapp.setLang("english");
		System.out.println(mediaapp.lang);
		mediaapp.setPlatform("android");
		System.out.println(mediaapp.platform);
		mediaapp.setVersion(8);
		System.out.println(mediaapp.version);
		mediaapp.setCompany("facebook");
		System.out.println(mediaapp.compaany);
		
		mediaapp.compaany=new Compaany("intel","omkar");
			Compaany compaany=mediaapp.compaany;
			System.out.println(compaany.name);
			System.out.println(compaany.founder);
			System.out.println(mediaapp.compaany);
			
			
		
	}
}