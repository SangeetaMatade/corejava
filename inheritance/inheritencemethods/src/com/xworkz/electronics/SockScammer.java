package com.xworkz.electronics;

import com.xworkz.enumm.SockType;

public class SockScammer {

	public static void main(String[] args) {
		Sock sk = new Sock();
		System.out.println(sk.hashCode());
		System.out.println();

		Sock sk1 = new Sock();
		System.out.println(sk1.toString());
		System.out.println(sk.toString());
		System.out.println();

		sk.setType(SockType.ANKLE);
		sk1.setType(SockType.KNEEHIGH);
		boolean equal = sk.equals(sk1);
		System.out.println(equal);
	}

}
