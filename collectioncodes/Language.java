package java.com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collection;

public class Language {

	public static void main(String[] args) {
		String str1 = "	Chinese";
		String str2 = "Spanish";
		String str3 = "English";
		String str4 = "Arabic";
		String str5 = "Hindi";
		String str6 = "	Bengali";
		String str7 = "Portuguese";
		String str8 = "Russian";
		String str9 = "Leonardo DiCaprio";
		String str10 = "Japanese";
		String str11 = "German";
		String str12 = "Javanese";
		String str13 = "Lahnda";
		String str14 = "	Telugu";
		String str15 = "Vietnamese";
		String str16 = "Marathi";
		String str17 = "French";
		String str18 = "	Korean";
		String str19 = "	Tamil";
		String str20 = "	Italian";
		String str21 = "	Urdu";
		String str22 = "Mandarin Chinese";
		String str23 = "Spanish";
		String str24 = "English";
		String str25 = "Hindi";
		String str26 = "Portuguese";
		String str27 = " Russian";
		String str28 = "	Egyptian Arabic";
		String str29 = "Gujarati";
		String str30 = " Iranian Persian";
		String str31 = "	Bhojpuri";
		String str32 = "Southern Min";
		String str33 = "Hakka";
		String str34 = "	Hausa";
		String str35 = "	Kannada";
		String str36 = "Indonesian";
		String str37 = "Polish";
		String str38 = "Yoruba";
		String str39 = "Xiang Chinese";
		String str40 = "Malayalam";
		String str41 = "	Odia";
		String str42 = "Maithili";
		String str43 = "Burmese";
		String str44 = "Sunda";
		String str45 = "Sudanese Arabic";
		String str46 = "Algerian Arabic";
		String str47 = "Romanian";
		String str48 = "	Tagalog";
		String str49 = "Dutch";
		String str50 = "Magahi";
		String str51 = "Thai";
		String str52 = "Saraiki";
		String str53 = "Nepali";
		String str54 = "Assamese";
		String str55 = "Sinhalese";
		String str56 = "	Northern Kurdish";
		String str57 = "Bavarian";
		String str58 = "Greek";
		String str59 = "Kazakh";
		String str60 = "Deccan";

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
		boolean monkey=col.remove(str30);
		System.out.println("The 30th element is removed ".concat(String.valueOf(monkey)));

	}

}
