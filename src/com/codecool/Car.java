package com.codecool;


public class Car extends Vehicle {

    public Car() {
        RandomHelpers rh = new RandomHelpers();
        setDistanceTraveled(0);
        setName(rh.getCarName());
        setSpeed(rh.genRandNum(80, 110));
        setCurrentSpeed(getSpeed());
        setType("car");
    }


    @Override
    void moveForAnHour(Race race){
        if (race.isThereABrokenTruck()) {
            setCurrentSpeed(75);
        } else {
            setCurrentSpeed(getSpeed());
        }
        setDistanceTraveled(getDistanceTraveled() + getCurrentSpeed());
    }
}
