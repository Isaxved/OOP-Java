package com.isaxved.Week1.Week3.WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature = 13;
    private float humidity = 13;
    private float pressure = 13;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurmentsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }



    public float getTemp() {
        return temperature;
    }

    public void setTemp(float temp) {
        this.temperature = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
