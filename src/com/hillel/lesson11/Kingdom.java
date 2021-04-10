package com.hillel.lesson11;

public class Kingdom {
    static int gold = 100000;
    static String nameOfKingdom = "Vesteros";
    static boolean isWar = true;
    static int countOfInhabitants = 1000000;

    public static void main(String[] args) {

        Lord Baratheon = new Lord("Baratheon", 100);
        Lord Starks = new Lord("Starks", 100);
        Lord Lanisters = new Lord("Lanisters", 100);
        Lord Greyjoy = new Lord("Greyjoy", 100);

        Lord[] suzerain = {Baratheon, Starks, Lanisters, Greyjoy};

        RoyalHarbor korolevskayaGavan = new RoyalHarbor(Baratheon, suzerain, 30, 40, "enemyArmy");

    }
}
