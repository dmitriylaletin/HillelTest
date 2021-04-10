package com.hillel.lesson11;

public class HouseOfVesteros {
    private Lord lord;
    private String army;
    private int castleDefence;
    private Meister meister;
    private int gold;
    private String enemyArmy;

    public HouseOfVesteros(Lord lord, String army, int castleDefence, Meister meister, int gold, String enemyArmy) {
        this.lord = lord;
        this.army = army;
        this.castleDefence = castleDefence;
        this.meister = meister;
        this.gold = gold;
        this.enemyArmy = enemyArmy;
    }

    public Lord getLord() {
        return lord;
    }

    public void setLord(Lord lord) {
        this.lord = lord;
    }

    public String getArmy() {
        return army;
    }

    public void setArmy(String army) {
        this.army = army;
    }

    public int getCastleDefence() {
        return castleDefence;
    }

    public void setCastleDefence(int castleDefence) {
        this.castleDefence = castleDefence;
    }

    public Meister getMeister() {
        return meister;
    }

    public void setMeister(Meister meister) {
        this.meister = meister;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getEnemyArmy() {
        return enemyArmy;
    }

    public void setEnemyArmy(String enemyArmy) {
        this.enemyArmy = enemyArmy;
    }

    @Override
    public String toString() {
        return "HouseOfVesteros{" +
                "lord=" + lord +
                ", army='" + army + '\'' +
                ", castleDefence=" + castleDefence +
                ", meister=" + meister +
                ", gold=" + gold +
                ", enemyArmy='" + enemyArmy + '\'' +
                '}';
    }
}
