package com.codecool;


public class Weather {

    private static boolean raining = false;
    private RandomHelpers generate = new RandomHelpers();

    protected void setRaining() {
        int chance = generate.genRandNum(1, 100);
        raining = chance < 30;
    }


    protected boolean isRaining() {
        return raining;
    }

}
