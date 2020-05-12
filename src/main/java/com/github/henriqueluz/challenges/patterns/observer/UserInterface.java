package com.github.henriqueluz.challenges.patterns.observer;

public class UserInterface implements Observer {

    private String uiMessage;

    @Override
    public void update(Double temperature, Double pressure, Double windSpeed) {
        uiMessage = String.format("Displaying details for UI: Temperature %s, Pressure %s, WindSpeed %s.", temperature, pressure, windSpeed);
        this.display();
    }

    public void display() {
        System.out.println(uiMessage);
    }
}
