package com.hillel.lesson11;

import java.util.Arrays;

public class RoyalHarbor {

    private Lord lord;
    private Lord suzerain[] = new Lord[4];
    private int loyalty;
    private int defenceOfCastle;
    private String enemyArmy;

    public RoyalHarbor(Lord lord, Lord[] suzerain, int loyalty, int defenceOfCastle, String enemyArmy) {
        this.lord = lord;
        this.suzerain = suzerain;
        this.loyalty = loyalty;
        this.defenceOfCastle = defenceOfCastle;
        this.enemyArmy = enemyArmy;
    }

    public Lord getLord() {
        return lord;
    }

    public void setLord(Lord lord) {
        this.lord = lord;
    }

    public Lord[] getSuzerain() {
        return suzerain;
    }

    public void setSuzerain(Lord[] suzerain) {
        this.suzerain = suzerain;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getDefenceOfCastle() {
        return defenceOfCastle;
    }

    public void setDefenceOfCastle(int defenceOfCastle) {
        this.defenceOfCastle = defenceOfCastle;
    }

    public String getEnemyArmy() {
        return enemyArmy;
    }

    public void setEnemyArmy(String enemyArmy) {
        this.enemyArmy = enemyArmy;
    }

    @Override
    public String toString() {
        return "RoyalHarbor{" +
                "lord='" + lord + '\'' +
                ", suzerain=" + Arrays.toString(suzerain) +
                ", loyalty=" + loyalty +
                ", defenceOfCastle=" + defenceOfCastle +
                ", enemyArmy='" + enemyArmy + '\'' +
                '}';
    }
}
