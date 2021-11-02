package com.xworkz.dp.dto;

public class FacebookApplicationDTO extends ApplicationDTO {

	private String ceoName;
	private String headquarter;

	public FacebookApplicationDTO() {
		super();
		System.out.println("invoked no arg const: FacebookApplicationDTO");
	}

	public FacebookApplicationDTO(String ceoName, String headquarter, String name, float version, String company,
			String founder) {
		super(name, version, company, founder);
		ceoName = ceoName;
		headquarter = headquarter;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}

}
