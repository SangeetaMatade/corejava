package com.xworkz.dp.dto;

public class LawyerDAO {
	private LawyerDTO[] lawyer = new LawyerDTO[5];
	private int count;

	public void save(LawyerDTO dto) {
		System.out.println("invoked save method");
		if (dto != null && this.count < this.lawyer.length && this.count>=0) {
			System.out.println();
			this.lawyer[this.count++] = dto;
			System.out.println("invoked save method: ".concat(String.valueOf(count)));
		} else {
			System.out.println("invoked save method: ".concat(String.valueOf(dto.getName())));

		}
	}

	public void delete(int index) {
		System.out.println("invoked delete method");
		if (index >= 0 && index < this.lawyer.length) {
			System.out.println();
			this.lawyer[index] = null;
			System.out.println("invoked delete method: ".concat(String.valueOf(index)));
		} else {
			System.out.println("index deleted");
		}
	}

	public void save(LawyerDTO dto, int index) {
		if (dto != null && index < this.lawyer.length && index >= 0) {
			System.out.println();
			this.lawyer[index] = dto;
			System.out.println("invoked overloded string" + "invoked overloaded int: ".concat(String.valueOf(index)));
		} else {
			System.out.println("invoked  overloaded: ".concat(String.valueOf(dto)));
		}
	}

	public boolean searchbyName(String name) {
		System.out.println("invoked searchbyname");
		//System.out.println("invoked searchbyname".concat(String.valueOf(name)));
		for (int i = 0; i < lawyer.length; i++) {
			LawyerDTO ref =lawyer[i];
			//System.out.println(ref);
			if (ref!=null) {
				System.out.println("invoked searchbyname method: ".concat(String.valueOf(i)));
				String nme = ref.getName();
				System.out.println("matching: ".concat(String.valueOf(i)));
				if (nme.equals(name)) {
					System.out.println("name found");
					String names=ref.getName();
					return true;
				}
				else {
					System.out.println("not found");
				}
			}
		
		}
		return false;
	}

public boolean searchbyCaseWon(int case1) {
	System.out.println("invoked searchbycaseWon");
	System.out.println("invoked searchbycaseWon: ".concat(String.valueOf(case1)));
	for(int s = 0; s < this.lawyer.length; s++) {
		LawyerDTO ref1 = this.lawyer[s];
		if(ref1 != null) 
		{
			System.out.println("ref1 in the index is not null".concat(String.valueOf(s)));
			int cs = ref1.getCaseWon();
			System.out.println("matching".concat(String.valueOf(cs)));
		if(cs==case1) {
			System.out.println("case1 found");
			return true;
		}
		}
	}
	return false;
		}
	
	public boolean getExpbyName(String name) {
		System.out.println("invoked getExpbyName");
		System.out.println(("invoked getExpbyName: ".concat(String.valueOf(name))));
		for(int m = 0; m < this.lawyer.length; m++) {
			LawyerDTO ref2 = this.lawyer[m];
		
			if(ref2 != null) 
			{
				System.out.println("ref2 in the index is not null: ".concat(String.valueOf(m)));
				String nm = ref2.getName();
				System.out.println("matching: ".concat(String.valueOf(nm)));
				if(nm.equals(name)) {
				System.out.println(ref2.getExperience());
				return true;
				}
			else
			{
				
			}
		}
		
		}
		return false;
	}
public boolean getQualificationbyName(String name) {
	System.out.println("invoked getQualificationbyName");
	for(int gudmrng = 0; gudmrng < this.lawyer.length; gudmrng++) {
		LawyerDTO ref3 = this.lawyer[gudmrng];
		if(ref3 != null)
		{
			System.out.println("ref in the index is not null".concat(String.valueOf(gudmrng)));
			String naam = ref3.getName();
			System.out.println("matching: ".concat(String.valueOf(naam)));
			if(naam.equals(name))
			{
				System.out.println(ref3.getQualification());
			    return true;
			}
			else
			{
				System.out.println("found qualification");
			
			}
		}
	}
	return false;

}
public boolean getLawyerwithMaxexp() {
	int max=0;
	String c=null;
	for(int s=0;s<lawyer.length;s++) {
		LawyerDTO ref=lawyer[s];
		if(ref!=null) {
			if(ref.getExperience()>max) {
				max=ref.getExperience();
				 c=ref.getName();
			}
		}
		
	}
	System.out.println(max);
	System.out.println(c);
	return false;
	
}
}


		
	
		

