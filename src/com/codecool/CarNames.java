package com.codecool;

public enum CarNames {
    INFERNO (0),
    PASSION (1),
    DOMINION (2),
    PARADOX (3),
    DRAGON (4),
    ROAMER (5),
    PINNACLE (6),
    GRIT (7),
    VAGABOND (8),
    TIGRESS (9),
    PROSPECT (10),
    PROPHECY (11),
    HEIRLOOM (12),
    CONQUEROR (13),
    FLOW (14),
    MAJESTY (15),
    PATRON (16),
    SCOUT (17);

    private final int nameNumber;

    CarNames(int num) {
        this.nameNumber = num;
    }

    public int getNameNumber() {
        return nameNumber;
    }

    public static int getSize() {
        int size = 0;
        for (CarNames name : CarNames.values()) {
            size++;
        }
        return size;
    }

    public static String getName(int num) {
        for (CarNames name : CarNames.values()) {
            if (name.getNameNumber() == num) {
                return name.toString();
            }
        }
        return "INFERNO";
    }
}
