package com.codecool;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;
    private RandomHelpers rh = new RandomHelpers();

    public Truck() {
        setDistanceTraveled(0);
        setName(String.valueOf(rh.genRandNum(0, 1000)));
        setSpeed(100);
        setType("truck");
        this.breakdownTurnsLeft = 0;
    }

    private void isTruckBroken() {
        if (rh.genRandNum(0, 100) < 5) {
            this.breakdownTurnsLeft += 2;
        }
    }

    @Override
    void moveForAnHour(Race race){
        if (this.breakdownTurnsLeft == 0) {
            setDistanceTraveled(getDistanceTraveled() + getSpeed());
            isTruckBroken();
        } else {
            this.breakdownTurnsLeft--;
        }
    }
}
