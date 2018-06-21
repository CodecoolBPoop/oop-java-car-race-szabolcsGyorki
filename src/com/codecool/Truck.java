package com.codecool;

public class Truck extends Vehicle {

    public Truck() {
        RandomHelpers rh = new RandomHelpers();
        setDistanceTraveled(0);
        setName(String.valueOf(rh.genRandNum(0, 1000)));
        setSpeed(100);
        setCurrentSpeed(getSpeed());
        setType("truck");
    }

}
