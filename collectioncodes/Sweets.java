package java.com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {

	public static void main(String[] args) {
		String str1 = "	jamun";
		String str2 = "rasmalai";
		String str3 = "dhudpheda";
		String str4 = "dharwad pheda";
		String str5 = "kadabu";
		String str6 = "	holagi";
		String str7 = "huggi";
		String str8 = "godi huggi";
		String str9 = "akki huggi";
		String str10 = "pheda";
		String str11 = "carrot halwa";
		String str12 = "kaju katli";
		String str13 = "ladoo";
		String str14 = "kulfi";
		String str15 = "modaks";
		String str16 = "poli";
		String str17 = "jalebi";
		String str18 = "kheer";
		String str19 = "nankhatai";
		String str20 = "rabdi";
		String str21 = "barfi";
		String str22 = "lassi";
		String str23 = "shrikhand";
		String str24 = "shashi tukra";
		String str25 = "basundi";
		String str26 = "sandesh";
		String str27 = "pistachio ice cream";
		String str28 = "petha";
		String str29 = "sheera";
		String str30 = "unni appam";
		String str31 = "shankarpali";
		String str32 = "dhondas";
		String str33 = "doodhpak";
		String str34 = "sutar feni";
		String str35 = "sohan papdi";
		String str36 = "anarsa";
		String str37 = "poornalu";
		String str38 = "mysore pak";
		String str39 = "pootharekulu";
		String str40 = "palathalikalu";
		String str41 = "kuzhi paniyaram";
		String str42 = "gavvalu";
		String str43 = "ada";
		String str44 = "adhirasam";
		String str45 = "sbalushar";
		String str46 = "boondi";
		String str47 = "ghevar";
		String str48 = "imarti";
		String str49 = "kalakand";
		String str50 = "malpua";
		String str51 = "singori";
		String str52 = "chenna poda";
		String str53 = "ledikeni";
		String str54 = "lyangcha";
		String str55 = "misti dahi";
		String str56 = "pantua";
		String str57 = "pithe";
		String str58 = "rasabali";
		String str59 = "ariseli";
		String str60 = "kakinada khaja";

		Collection col = new ArrayList();

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
		
		Iterator<String> itr = col.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			
		}
		
		
		boolean basket=col.contains("xyz");
		System.out.println(basket);
		
		System.out.println(">kkkkkkkkkkkkkkkkkkkkkkkkkk>");
		boolean table=col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(table)));


	}

}
