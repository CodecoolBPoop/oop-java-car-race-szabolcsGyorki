package com.codecool;

import java.util.Random;

class RandomHelpers {

    private Random generateRandom = new Random();

    int genRandNum(int start, int end) {
        return generateRandom.nextInt(end - start) + start;
    }

    String getCarName() {
        int end = CarNames.getSize();
        int first = genRandNum(0, end);
        int second;
        do {
            second = genRandNum(0, end);
        } while (second == first);

        return CarNames.getName(first) +
                " " +
                CarNames.getName(second);
    }
}
