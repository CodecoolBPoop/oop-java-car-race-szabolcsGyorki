package com.codecool;

abstract class Vehicle {

    private int speed;
    private int currentSpeed;
    private int distanceTraveled;
    private String name;
    private String type;

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    String getName() {
        return name;
    }

    void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    void setName(String name) {
        this.name = name;
    }

    void moveForAnHour(Race race){

    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getCurrentSpeed() {
        return currentSpeed;
    }

    void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }
}
