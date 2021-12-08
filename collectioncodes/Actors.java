package java.com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;

public class Actors {

	public static void main(String[] args) {
		String str1 = "Johnny Depp";
		String str2 = "Al Pacino";
		String str3 = "Robert De Niro";
		String str4 = "Kevin Spacey";
		String str5 = "Denzel Washington";
		String str6 = "Russell Crowe";
		String str7 = "Brad Pitt";
		String str8 = "Angelina Jolie";
		String str9 = "Leonardo DiCaprio";
		String str10 = "Tom Cruise";
		String str11 = "John Travolta";
		String str12 = "Arnold Schwarzenegger";
		String str13 = "Sylvester Stallone";
		String str14 = "Kate Winslet";
		String str15 = "Christian Bale";
		String str16 = "Morgan Freeman";
		String str17 = "Keanu Reeves";
		String str18 = "Nicolas Cage";
		String str19 = "Hugh Jackman";
		String str20 = "Edward Norton";
		String str21 = "Bruce Willis";
		String str22 = "Tom Hanks";
		String str23 = "Charlize Theron";
		String str24 = "Will Smith";
		String str25 = "Sean Connery";
		String str26 = "Keira Knightley";
		String str27 = " Vin Diesel";
		String str28 = "Matt Damon";
		String str29 = "Catherine Zeta-Jones";
		String str30 = " Clive Owen";
		String str31 = "Mel Gibson";
		String str32 = "George Clooney";
		String str33 = "Jack Nicholson";
		String str34 = "Scarlett Johansson";
		String str35 = "Tom Hardy";
		String str36 = "Robert Downey Jr.";
		String str37 = "Orlando Bloom";
		String str38 = "Ian McKellen";
		String str39 = "Antonio Banderas";
		String str40 = "Guy Pearce";
		String str41 = "Samuel L. Jackson";
		String str42 = "Sandra Bullock";
		String str43 = "Meg Ryan";
		String str44 = "Megan Fox";
		String str45 = "Nicole Kidman";
		String str46 = "Gerard Butler";
		String str47 = "Simon Baker";
		String str48 = "Cameron Diaz";
		String str49 = "Katherine Heigl";
		String str50 = "yash";
		String str51 = "appu";
		String str52 = "shivrajkumar";
		String str53 = "akshaykumar";
		String str54 = "muralivijay";
		String str55 = "ganesh";
		String str56 = "prem";
		String str57 = "hrithik";
		String str58 = "varun";
		String str59 = "siddarth";
		String str60 = "arjun";

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

		boolean bol = col.contains("xyz");
		System.out.println(bol);

		System.out.println(".,.,.,.,,.,.,.,,.");
		boolean del = col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(del)));

	


	}

}
