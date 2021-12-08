package java.com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;

public class Bike {

	public static void main(String[] args) {
		
			String str1 = "Royal enfield";
			String str2 = "Honda XBlade";
			String str3 = "Honda CB Hornet 160";
			String str4 = "Honda CB Unicorn 160";
			String str5 = "TVS Apache RTR 160 4V";
			String str6 = "	TVS Apache RTR FI 4V";
			String str7 = "Bajaj Pulsar NS 160";
			String str8 = "Yamaha YZF R15 V3";
			String str9 = "Yamaha MT15";
			String str10 = "Suzuki Gixxer";
			String str11 = "Suzuki Gixxer SF";
			String str12 = "Hero Xtreme 160R";
			String str13 = "Yamaha XSR155";
			String str14 = "Aftek Knight Rider";
			String str15 = "Royal Enfield Bullet 350";
			String str16 = "Yamaha YZF R15 V3";
			String str17 = "Yamaha MT 15";
			String str18 = "Hero Splendor Plus";
			String str19 = "Bajaj Pulsar 150";
			String str20 = "KTM 200 Duke";
			String str21 = "KTM RC 125";
			String str22 = "TVS Apache RTR 160";
			String str23 = "Zeus";
			String str24 = "Raven ";
			String str25 = "Pegasus";
			String str26 = "Bumblebee";
			String str27 = "Bonnie";
			String str28 = " Ebony";
			String str29 = "Stiletto";
			String str30 = "Kermit";
			String str31 = "Silver Bullet";
			String str32 = "The Tank";
			String str33 = "Rocketman";
			String str34 = "Audrey";
			String str35 = "Tequila ";
			String str36 = "Siren";
			String str37 = "Archie ";
			String str38 = "Patriot ";
			String str39 = "Shotgun";
			String str40 = "Lolita ";
			String str41 = "Berry";
			String str42 = "Black Panther";
			String str43 = "Dracarys";
			String str44 = "Speedliner ";
			String str45 = "Globetrotter";
			String str46 = "Blackhawk";
			String str47 = "Jet";
			String str48 = "Phoenix";
			String str49 = "Quinn";
			String str50 = "Raani ";
			String str51 = "Pikachu ";
			String str52 = "Firefly";
			String str53 = "Habibi";
			String str54 = "Novaa";
			String str55 = "black enfield";
			String str56 = "red ktm";
			String str57 = "blue ktm";
			String str58 = "hero honda";
			String str59 = "nova 15";
			String str60 = "bullet";

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
		col.clear();

		System.out.println(col.size());
		Iterator<String> itr = col.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		boolean bachan = col.contains("xyz");
		System.out.println(bachan);

		System.out.println(".,.,.,.,,.,.,.,,.");
		boolean hp = col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(hp)));




	}

}
