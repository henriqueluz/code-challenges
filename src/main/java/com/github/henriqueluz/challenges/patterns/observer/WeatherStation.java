package com.github.henriqueluz.challenges.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private Double temperature;
    private Double windSpeed;
    private Double pressure;
    private List<Observer> observers;

    WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        this.notifyObservers();
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this.temperature, this.pressure, this.windSpeed));
    }

}
