package com.codecool;

public class Motorcycle extends Vehicle {

    public Motorcycle(int nameNumber) {
        setDistanceTraveled(0);
        setName("Motorcycle " + (nameNumber + 1));
        setSpeed(100);
        setCurrentSpeed(getSpeed());
        setType("motorcycle");
    }

    @Override
    void moveForAnHour(Race race){
        if (race.isRaining()) {
            RandomHelpers rh = new RandomHelpers();
            int speedDecrease = rh.genRandNum(5, 50);
            setCurrentSpeed(getSpeed() - speedDecrease);
        } else {
            setCurrentSpeed(getSpeed());
        }
        setDistanceTraveled(getDistanceTraveled() + getCurrentSpeed());
    }
}
