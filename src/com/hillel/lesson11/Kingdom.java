package com.hillel.lesson11;

public class Kingdom {
    static int gold = 100000;
    static String nameOfKingdom = "Vesteros";
    static boolean isWar = true;
    static int countOfInhabitants = 1000000;

    public static void main(String[] args) {
        String[] suzerain = {"Baratheons", "Starks", "Lanisters", "Greyjoy"};

        RoyalHarbor korolevskayaGavan = new RoyalHarbor("Baratheon", suzerain, 30, 40, "enemyArmy");

    }
}
