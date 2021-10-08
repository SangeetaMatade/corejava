class CurrencyStarter{
	public static void main(String args[]){
		Currency ref=new Currency();
			
			ref.name="Rupees";
			ref.Country="INDIA";
			ref.value=10;
			ref.displayDetails();
			
			Currency ref1=new Currency();
			
			ref1.name="dollar";
			ref1.Country="USA";
			ref1.value=20;
			ref1.displayDetails();
			
			Currency ref2=new Currency();
			ref2.name="pound sterling";
			ref2.Country="ENGLAND";
			ref2.value=30;
			ref2.displayDetails();
			
			Currency ref3=new Currency();
			ref3.name="australian dollars";
			ref3.Country="AUSTRALIA";
			ref3.value=40;
			ref3.displayDetails();
			
			Currency ref4=new Currency();
			ref4.name="emirati dirham";
			ref4.Country="DUBAI";
			ref4.value=50;
			ref4.displayDetails();
	}
}
			