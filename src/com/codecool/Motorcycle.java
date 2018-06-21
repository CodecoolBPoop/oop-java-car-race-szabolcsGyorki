package com.codecool;

public class Motorcycle extends Vehicle {

    public Motorcycle(int nameNumber) {
        RandomHelpers rh = new RandomHelpers();
        setDistanceTraveled(0);
        setName("Motorcycle " + (nameNumber + 1));
        setSpeed(100);
        setCurrentSpeed(getSpeed());
        setType("motorcycle");
    }

}
