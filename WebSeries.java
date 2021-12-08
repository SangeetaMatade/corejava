package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WebSeries {

	public static void main(String[] args) {

		String str1 = "Charmsukh Chawl House Cast";
		String str2 = "Palang Tod Caretaker Cast";
		String str3 = "Prabha Ki Diary Cast (Ullu)";
		String str4 = "Prabha Ki Diary The Wife Cast";
		String str5 = "Palang Tod Mom and Daughter (Ullu)";
		String str6 = "Riti Riwaj Haldi Cast";
		String str7 = "Prabha Ki Diary Dil Se Lekin Cast";
		String str8 = "Palang Tod Bekaboo Dil Cast";
		String str9 = "Call Center Cast";
		String str10 = "Riti Riwaj Pinjara Cast";
		String str11 = "Charmsukh Jane Anjane Mein";
		String str12 = "Palang Tod Double Dhamaka Cast";
		String str13 = "Charmsukh Jane Anjane Mein 3";
		String str14 = "Rolls Royce Phantom";
		String str15 = "Charmsukh Degree Wala Teacher Cast";
		String str16 = " Charmsukh Promotion Cast";
		String str17 = "Charmsukh Education Cast";
		String str18 = "Charmsukh Flat 69 Cast";
		String str19 = "Charmsukh Pyaas Cast";
		String str20 = "Charmsukh Role Play Cast";
		String str21 = "Riti Riwaj Wife On Rent Cast";
		String str22 = "Charmsukh Telephone Booth";
		String str23 = "Charmsukh Sautela Pyaar Cast";
		String str24 = "Riti Riwaj Tijarat Cast";
		String str25 = "Charmsukh Jane Anjane Mein 2 Cast";
		String str26 = "Charmsukh Humse Na Ho Payega Cast";
		String str27 = "Charmsukh Pajama Party Cast";
		String str28 = "Riti Riwaj Taala Chaabi Cast";
		String str29 = "Charmsukh Sauda Cast";
		String str30 = "Riti Riwaj Water Wives Cast";
		String str31 = "Palang Tod Kirayedaar Cast";
		String str32 = "Charmsukh Kaamwali Bai Cast";
		String str33 = "Charmsukh Behrupiya Cast";
		String str34 = "Charmsukh Ek Khwaab Suhaagrat Cast";
		String str35 = "Charmsukh Highway Cast";
		String str36 = "Tandoor Cast";
		String str37 = "Halala Cast";
		String str38 = "Assi Nabbe Poore Sau";
		String str39 = "Kavita Bhabhi Cast";
		String str40 = "Kavita Bhabhi Season 2";
		String str41 = "Kavita Bhabhi Season 3";
		String str42 = "Palang Tod Gaon Ki Garmi Cast";
		String str43 = "Good Night";
		String str44 = "Ishq Kills Cast";
		String str45 = "Kasak";
		String str46 = "Catlady";
		String str47 = "Charmsukh Karna Zaruri Hai Cast";
		String str48 = "Charmsukh Mom And Daughter Cast";
		String str49 = "Prabha Ki Diary Honeymoon Special";
		String str50 = "Prabha Ki Diary The Housewife";
		String str51 = "Palang Tod Shor Cast";
		String str52 = "Lovely Massage Parlour Cast";
		String str53 = "Charmsukh Aate Ki Chakki Cast";
		String str54 = "Charmsukh Salahkaar Cast";
		String str55 = "Palang Tod Naye Padosi";
		String str56 = "The Last Show Cast Cast";
		String str57 = "Paro Web Series Cast";
		String str58 = "Madhosh Diaries Good Wife";
		String str59 = "Rupaya 500 Cast";
		String str60 = "Charmsukh Toilet Love Cast";

		Collection<String> col = new ArrayList<String>();

		col.add(str1);
		col.add(str2);
		col.add(str3);
		col.add(str4);
		col.add(str5);
		col.add(str6);
		col.add(str7);
		col.add(str8);
		col.add(str9);
		col.add(str10);
		col.add(str11);
		col.add(str12);
		col.add(str13);
		col.add(str14);
		col.add(str15);
		col.add(str16);
		col.add(str17);
		col.add(str18);
		col.add(str19);
		col.add(str20);
		col.add(str21);
		col.add(str22);
		col.add(str23);
		col.add(str24);
		col.add(str25);
		col.add(str26);
		col.add(str27);
		col.add(str28);
		col.add(str29);
		col.add(str30);
		col.add(str31);
		col.add(str32);
		col.add(str33);
		col.add(str34);
		col.add(str35);
		col.add(str36);
		col.add(str37);
		col.add(str38);
		col.add(str39);
		col.add(str40);
		col.add(str41);
		col.add(str42);
		col.add(str43);
		col.add(str44);
		col.add(str45);
		col.add(str46);
		col.add(str47);
		col.add(str48);
		col.add(str50);
		col.add(str51);
		col.add(str52);
		col.add(str53);
		col.add(str54);
		col.add(str55);
		col.add(str56);
		col.add(str57);
		col.add(str58);
		col.add(str59);
		col.add(str60);
		System.out.println(col.size());

		col.clear();

		System.out.println(col.size());
		Iterator<String> itr = col.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		boolean bol = col.contains("xyz");
		System.out.println(bol);

		System.out.println("/,/,/,/,/,/,/,/,/,/,/,/,/");
		boolean del = col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(del)));

	}

}
