package com.xworkz.electronics;

public class NewsPaper {
	private String name;
	private String lang;

	public NewsPaper(String name, String lang) {
		super();
		this.name = name;
		this.lang = lang;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked method equsls");
		if (obj == null) {
			System.out.println("it is not poninting to null");
			return false;
		}
		if (obj instanceof NewsPaper) {
			NewsPaper casted = (NewsPaper) obj;
			String castednewspaper = casted.lang;
			if (this.lang.equals(castednewspaper)) {
				System.out.println("matched");
				return true;
			} else {
				System.out.println("missmatched");
			}
		} else {
			System.out.println("pass Newspaper");
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked method hashcode");
		return 99;

	}

	@Override
	public String toString() {
		System.out.println("invoked method tostring");
		return name;
	}

	public NewsPaper() {
		System.out.println("invoked no arg const");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
