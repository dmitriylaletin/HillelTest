package com.hillel.lesson11;

/*6)  Обьект армия с полями расположение (замок или нет), сила атаки, защита, усталость*/
public class _06Army {

    private boolean armyLocationInCastle = true;
    private int armyAttackForce;
    private int armyDefense;
    private int lassitude; // - усталость

    public _06Army(boolean armyLocationInCastle, int armyAttackForce, int armyDefense, int lassitude) {
        this.armyLocationInCastle = armyLocationInCastle;
        this.armyAttackForce = armyAttackForce;
        this.armyDefense = armyDefense;
        this.lassitude = lassitude;
    }

    public boolean isArmyLocationInCastle() {
        return armyLocationInCastle;
    }

    public void setArmyLocationInCastle(boolean armyLocationInCastle) {
        this.armyLocationInCastle = armyLocationInCastle;
    }

    public int getArmyAttackForce() {
        return armyAttackForce;
    }

    public void setArmyAttackForce(int armyAttackForce) {
        this.armyAttackForce = armyAttackForce;
    }

    public int getArmyDefense() {
        return armyDefense;
    }

    public void setArmyDefense(int armyDefense) {
        this.armyDefense = armyDefense;
    }

    public int getLassitude() {
        return lassitude;
    }

    public void setLassitude(int lassitude) {
        this.lassitude = lassitude;
    }

    @Override
    public String toString() {
        return "_06Army{" +
                "armyLocationInCastle=" + armyLocationInCastle +
                ", armyAttackForce=" + armyAttackForce +
                ", armyDefense=" + armyDefense +
                ", lassitude=" + lassitude +
                '}';
    }
}
