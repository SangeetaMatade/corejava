class SocialMediaAppStarter
{
	public static void main(String args[]){
		SocialMediaApp socialMediaApp=new SocialMediaApp("hike",3.99,"java","windows",209);
		System.out.println(socialMediaApp.name);
		System.out.println(socialMediaApp.size);
        System.out.println(socialMediaApp.language);
		System.out.println(socialMediaApp.platform);
		System.out.println(socialMediaApp.version);
		System.out.println(socialMediaApp.companyy);
		
		socialMediaApp.companyy=new Companyy("hcl","sangeeta",60);
		Companyy companyy=socialMediaApp.companyy;
		System.out.println(companyy.name);
		System.out.println(companyy.founder);
		System.out.println(companyy.noOfEmpolye);
		
		
	}
}
		
		