package com.codecool;


public class Car extends Vehicle {

    private int normalSpeed;

    private int getNormalSpeed() {
        return normalSpeed;
    }

    public Car() {
        RandomHelpers rh = new RandomHelpers();
        setName(rh.getCarName());
        normalSpeed = rh.genRandNum(80, 110);
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getName() + ", speed: " + car.getNormalSpeed());
    }
}
