package com.codecool;


class Weather {

    private static boolean raining = false;
    private RandomHelpers generate = new RandomHelpers();

    void setRaining() {
        int chance = generate.genRandNum(1, 100);
        raining = chance < 30;
    }


    boolean isRaining() {
        return raining;
    }

}
