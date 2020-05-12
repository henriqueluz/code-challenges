package com.github.henriqueluz.challenges.patterns.observer;

public class Logger implements Observer {

    private String logMessage;

    @Override
    public void update(Double temperature, Double pressure, Double windSpeed) {
        logMessage = String.format("Weather Alert: Temperature %s, Pressure %s, WindSpeed %s.", temperature, pressure, windSpeed);
        this.log();
    }

    public void log() {
        System.out.println(logMessage);
    }
}
