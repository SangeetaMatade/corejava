class BankStarter{
	public static void main(String args[]){
		
		Bank bank=new Bank("SBI","BTM",20);
		System.out.println(bank.name);
		System.out.println(bank.location);
		System.out.println(bank.noOfworkers);
		Branch branch=new Branch("BANGLORE",2);
		System.out.println(branch.name);
		System.out.println(branch.noOfBranch);
		bank.branch=branch;
		
		
		
		
	}
}
		