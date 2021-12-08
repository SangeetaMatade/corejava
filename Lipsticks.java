package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lipsticks {

	public static void main(String[] args) {
		String str1 = "Chanel";
		String str2 = "Giorgio Armani Beauty";
		String str3 = "Charlotte Tilbury";
		String str4 = "NARS";
		String str5 = "Stila Cosmetics";
		String str6 = "	Smashbox";
		String str7 = "Yves Saint Laurent";
		String str8 = " Dior";
		String str9 = "Fenty Beauty";
		String str10 = "Pat McGrath";
		String str11 = "MAC Cosmetics";
		String str12 = "Victoria Beckham";
		String str13 = "Shiseido";
		String str14 = "Tom Ford";
		String str15 = "Kjaer Weis";
		String str16 = "Chantecaille";
		String str17 = "Westman Atelier";
		String str18 = "Gucci";
		String str19 = "Hermès";
		String str20 = "Revlon";
		String str21 = "Maybelline";
		String str22 = "Lakme";
		String str23 = "Lakme";
		String str24 = "Color bar";
		String str25 = "NYX";
		String str26 = "MAC";
		String str27 = "Max Factor";
		String str28 = "Lotus Herbals";
		String str29 = "Coloressence";
		String str30 = "Bobbi Brown";
		String str31 = "Avon";
		String str32 = "Faces";
		String str33 = "Christian Dior";
		String str34 = "Lancome";
		String str35 = "MUA";
		String str36 = "Amway";
		String str37 = "Color life";
		String str38 = "Konad";
		String str39 = "Color street";
		String str40 = "Viviana";
		String str41 = "Soul Tree";
		String str42 = "Blue Heaven";
		String str43 = "Biotique";
		String str44 = "Blue Heaven Special Matte Lip Color";
		String str45 = "Elle18 Color Pops Matte Lipstick";
		String str46 = "Blue Heaven Xpression Lip Color Pencil";
		String str47 = "Insight Cosmetics Matte Lipstick";
		String str48 = "Lakme Forever Matte Liquid Lip Colour - Nude Dream 08 5.6ml";
		String str49 = "Lakme Nude Pink 13 Forever Matte Liquid Lip Colour 5.6 ml";
		String str50 = "Lakme Forever Matte Liquid Lip Colour - Nude Twist 19 5.6 ml";
		String str51 = "Lakme Cushion Matte Lipstick - Red Wine CR3";
		String str52 = "NYX";
		String str53 = "Sugar";
		String str54 = "Faces Canada";
		String str55 = "Anastasia Beverly Hills";
		String str56 = "L’Oréal Paris";
		String str57 = "Urban Decay";
		String str58 = "NYX Cosmetics";
		String str59 = "Kat Von D Beauty";
		String str60 = "Too Faced Cosmetics";

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
		col.add(null);

		System.out.println(col.size());
		col.clear();

		
		Iterator<String> itr = col.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		boolean fog = col.contains("xyz");
		System.out.println(fog);

		System.out.println("][][][][][[[][][][][][][");
		boolean chair = col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(chair)));

	}

}
