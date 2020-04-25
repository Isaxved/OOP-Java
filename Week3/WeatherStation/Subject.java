package com.isaxved.Week1.Week3.WeatherStation;

public interface Subject {
    public abstract void registerObserver(Observer observer);
    public abstract void notifyObserver();
    public abstract void removeObserver(Observer observer);
}
