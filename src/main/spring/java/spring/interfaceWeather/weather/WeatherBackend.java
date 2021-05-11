package main.spring.java.spring.interfaceWeather.weather;

import java.util.Date;
import java.util.List;

public class WeatherBackend implements WeatherInterface {

    @Override
    public String getCurrentTime() {
        return String.valueOf(new Date());
    }

    @Override
    public WetherIntraday getWeatherOneDay(String date, String location) {
        WetherIntraday responese=new WetherIntraday();

        return responese;
    }

    @Override
    public List<WetherIntraday> getWeatherWeek(String loacation, String startDate, String endDate) {
        return null;
    }
}
