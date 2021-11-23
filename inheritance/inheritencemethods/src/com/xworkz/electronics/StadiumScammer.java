package com.xworkz.electronics;

public class StadiumScammer {

	public static void main(String[] args) {
		Stadium st = new Stadium();
		System.out.println(st.hashCode());
		System.out.println(st.toString());
		System.out.println();

		Stadium st2 = new Stadium();
		System.out.println(st2.hashCode());
		System.out.println();

		st.setName("chinnswami");
		st2.setName("chinnswami");
		boolean equal = st.equals(st2);
		System.out.println(equal);

	}

}
