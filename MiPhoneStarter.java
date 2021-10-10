class MiPhoneStarter
{
	public static void main(String args[]){
		MiPhone miPhone=new MiPhone();
		miPhone.setBrand("xiome");
		System.out.println(miPhone.brand);
		miPhone.setPrice(10000.0f);
		System.out.println(miPhone.price);
		miPhone.setColor("blue");
		System.out.println(miPhone.color);
		
		miPhone.phonepaay=new Phonepaay();
		Phonepaay phonepaay=miPhone.phonepaay;
		phonepaay.setCompany("flipcart");
		System.out.println(phonepaay.company);
		phonepaay.setVersion(4.8);
		System.out.println(phonepaay.version);
		phonepaay.setArchitect("nigam");
		System.out.println(phonepaay.architect);
		phonepaay.setWorking(true);
		System.out.println(phonepaay.working);
	}
}
		