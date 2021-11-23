package com.xworkz.Templerule.inter;

public class PublicDevoteeRule implements DevoteeRule {

	@Override
	public boolean slippersOff() {
		System.out.println("invoked slippersOff");
		return true;
	}

	@Override
	public boolean maintainsilence() {
		System.out.println("invoked maintainsilence ");
		return true;
	}

	@Override
	public boolean donttakephoto() {
		System.out.println("invoked donttakephoto ");
		return true;
	}

}
