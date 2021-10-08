class WeatherRunner{
	public static void main(String args[]){
		WeatherSeason season=WeatherSeason.SUMMER;
		String humidity="Sunny";
		Weather weather=new Weather(season,humidity);
		weather.feel=false;
		System.out.println(weather.season);
		System.out.println(weather.temperatureinCelsius);
		System.out.println(weather.humidity);
		System.out.println(weather.feel);
		System.out.println(Weather.numberOfInstance);
	}
}