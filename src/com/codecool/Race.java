package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Vehicle> racers = new ArrayList<>();
    private static Race race = new Race();

    private Weather weather = new Weather();

    private void createVehicles() {
        for (int i = 0; i < 10; i++) {
            racers.add(new Truck());
            racers.add(new Motorcycle(i));
            racers.add(new Car());
        }
    } // creates 10 racers, 10 trucks and 10 motorcycles.


    private void simulateRace() {
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : racers) {
                weather.setRaining();
                vehicle.moveForAnHour(race);
            }
        }

    } // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining


    private void printRaceResults() {
        for (Vehicle vehicle : racers) {
            System.out.println("Type: " + vehicle.getType());
            System.out.println(" Name: " + vehicle.getName());
            System.out.println(" Traveled: " + vehicle.getDistanceTraveled());
            System.out.println();

        }

    } // prints each vehicle's name, distance traveled ant type.


    boolean isThereABrokenTruck() {
        return false;
    }


    boolean isRaining() {
        return weather.isRaining();
    }


    public static void main(String[] args) {
	// write your code here
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();
    }
}
