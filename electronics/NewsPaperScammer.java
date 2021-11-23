package com.xworkz.electronics;

public class NewsPaperScammer {

	public static void main(String[] args) {
		NewsPaper news = new NewsPaper();
		System.out.println(news.hashCode());
		System.out.println();

		NewsPaper news1 = new NewsPaper();
		System.out.println(news1.toString());
		System.out.println();

		news.setLang("KANNADA");
		news1.setLang("ENGLISH");
		boolean right = news.equals(news1);
		System.out.println(right);

	}

}
