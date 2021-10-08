class ApplicationStarter{
	public static void main(String args[]){
	 Currency currency=new Currency();
	 currency.name="dollar";
	 currency.value=35;
	 currency.displaydetails();
     System.out.println();
     currency.country=new Country();
     Country country1=currency.country;
     System.out.println(currency.country);
	 
	 
     country1.name="INDIA";
     country1.code=60;
     country1.displaydetails();
     System.out.println();
	 
	 Company company=new Company();
	 company.name="Techmahendra";
	 company.ceo="sanjota";
	 company.cfo="advika";
	 company.displayDetails();
	 company.country=new Country();
	 System.out.println(company.country);
	 
	 
	 Application app=new Application();
	 app.name="powerpoint";
	 app.version=4.8f;
	 System.out.println();
	 app.displaydetails();
	 app.company=new Company();
	 System.out.println(app.company);
	 
	 
	
	}
}
	 

	 
		
		
		
		