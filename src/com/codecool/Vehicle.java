package com.codecool;

public abstract class Vehicle {

    private int distanceTraveled;
    private String name;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    String getName() {
        return name;
    }

    public void setDistanceTraveled(int distanceTraveld) {
        this.distanceTraveled = distanceTraveld;
    }

    void setName(String name) {
        this.name = name;
    }

    void moveForAnHour(Race race){
        distanceTraveled++;
    }

}
