package com.xworkz.Dto;

public class ArmyDto {

	private String soldierNames, location, tankername;
	private int tankerNo;

	public ArmyDto() {
		System.out.println("invked no arg const");
	}

	public ArmyDto(String soldierNames, String location, String tankername, int tankerNo) {
		super();
		this.soldierNames = soldierNames;
		this.location = location;
		this.tankername = tankername;
		this.tankerNo = tankerNo;
	}

	@Override
	public int hashCode() {

		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ArmyDto) {
				ArmyDto casted = (ArmyDto) obj;
				if (this.soldierNames.equals(soldierNames) && this.location.equals(location)
						&& this.tankername.equals(tankername) && this.tankerNo == (casted.tankerNo)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public String getSoldierNames() {
		return soldierNames;
	}

	public void setSoldierNames(String soldierNames) {
		this.soldierNames = soldierNames;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTankername() {
		return tankername;
	}

	public void setTankername(String tankername) {
		this.tankername = tankername;
	}

	public int getTankerNo() {
		return tankerNo;
	}

	public void setTankerNo(int tankerNo) {
		this.tankerNo = tankerNo;
	}

	@Override
	public String toString() {

		return soldierNames + ": " + location + ": " + tankername + ": " + tankerNo;
	}
}
