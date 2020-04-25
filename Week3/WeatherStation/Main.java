package com.isaxved.Week1.Week3.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        Statistics statistics = new Statistics(weatherData);
        Forecast forecast = new Forecast(weatherData);


        weatherData.setMeasurements(13f, 13.2f,41.2f);
    }
}
