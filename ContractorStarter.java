class ContractorStarter
{
	public static void main(String args[]){
		
		Contractor contractor=new Contractor();
		contractor.setName("AKSHATA");
		String name=contractor.getName();
		System.out.println("name of contractor is  "+name);
		
		
		contractor.setFunction("a");
		String function=contractor.getFunction();
		System.out.println(function);
		
		
		contractor.setNoOffunction(3);
		int noOffunction=contractor.getNoOffunction();
		System.out.println(noOffunction);
		
		
		contractor.setDuration(2);
		int duration=contractor.getDuration();
		System.out.println(duration);
		
		
		contractor.setQuality(true);
		boolean quality=contractor.getQuality();
		System.out.println(quality);
	}
}