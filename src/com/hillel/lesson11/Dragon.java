package com.hillel.Lesson11;

public class Dragon {

    private String name;
    private int health;
    private int attackPower;

    public Dragon() {

    }

    public Dragon(String name) {
        this.name = name;
    }

    public Dragon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Dragon(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "Dpacon{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}
