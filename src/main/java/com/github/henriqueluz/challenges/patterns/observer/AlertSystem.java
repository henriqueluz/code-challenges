package com.github.henriqueluz.challenges.patterns.observer;

public class AlertSystem implements Observer {

    private String alert;

    @Override
    public void update(Double temperature, Double pressure, Double windSpeed) {
        alert = String.format("Weather Alert: Temperature %s, Pressure %s, WindSpeed %s.", temperature, pressure, windSpeed);
        this.alert();
    }

    public void alert() {
        System.out.println(alert);
    }
}
