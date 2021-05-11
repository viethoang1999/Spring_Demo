package main.spring.java.spring.interfaceWeather.weather;

import java.util.List;

public interface WeatherInterface {
    String getCurrentTime();
    WetherIntraday getWeatherOneDay(String date, String location);
    List<WetherIntraday> getWeatherWeek(String loacation,String startDate,String endDate);

}
