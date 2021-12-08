package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Car {

	public static void main(String[] args) {

		String str1 = "1935 Duesenberg SJ LA Phaeton";
		String str2 = "1957 Corvette";
		String str3 = "Volkwagen Beetle";
		String str4 = "Ferrari Enzo";
		String str5 = "Toyota XB Scion";
		String str6 = "Aston Martin DB9";
		String str7 = "Shelby Cobra";
		String str8 = "Lamborghini Countach";
		String str9 = "Dodge Viper";
		String str10 = "Hummer H1";
		String str11 = "Reliant Robin";
		String str12 = "Loremo LS";
		String str13 = "1968-1969 Dodge Charger";
		String str14 = "Rolls Royce Phantom";
		String str15 = "Studebaker Commander";
		String str16 = "1959 Cadillac Eldorado";
		String str17 = "Porsche 911";
		String str18 = "Shelby Mustang Cobra";
		String str19 = "1978 Pontiac Firebird";
		String str20 = "Delorean DMC 12";
		String str21 = "1932 Ford Roadster";
		String str22 = "1955 Chevy Bel Air";
		String str23 = "Ford GT40";
		String str24 = "Tesla";
		String str25 = "1937 Packard";
		String str26 = "Mercedes Benz 300sl";
		String str27 = "Jaguar xk120";
		String str28 = "Toyota Prius";
		String str29 = "Mini Cooper";
		String str30 = "El Camino";
		String str31 = "Stout Scarab";
		String str32 = "Pierce Silver Arrow";
		String str33 = "1969 Chevelle";
		String str34 = "Mazda Miata";
		String str35 = "Audi TT";
		String str36 = "Bentley Continental";
		String str37 = "Ferrari 288";
		String str38 = "Minivan";
		String str39 = "Mercedes McLaren SLR";
		String str40 = "Maserati";
		String str41 = "Bugatti Veyron";
		String str42 = "Station Wagon";
		String str43 = "Woodie";
		String str44 = "PT Cruiser";
		String str45 = "SUV";
		String str46 = "Jeep CJ";
		String str47 = "Jaguar S-3";
		String str48 = "Lotus Esprit";
		String str49 = "Porsche 928";
		String str50 = "1957 Ford";
		String str51 = "Ford Edsel";
		String str52 = "Tata Nano";
		String str53 = "Chrysler Airflow";
		String str54 = "AMC Pacer";
		String str55 = "Plymouth Prowler";
		String str56 = "Chevy SSR";
		String str57 = "Alfa Romeo Spider";
		String str58 = "1969 Camaro";
		String str59 = "AMC Gremlin";
		String str60 = "VW Minibus";

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

		System.out.println(".,.,.,.,,.,.,.,,.");
		boolean del = col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(del)));

	}

}
