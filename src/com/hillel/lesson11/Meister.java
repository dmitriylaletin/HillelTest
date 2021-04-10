package com.hillel.lesson11;

public class Meister {
    private String name;
    private int life = 100;
    private int potionForHealth;

    public Meister(String name, int life, int potion) {
        this.name = name;
        this.life = life;
        this.potionForHealth = potion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPotion() {
        return potionForHealth;
    }

    public void setPotion(int potion) {
        this.potionForHealth = potion;
    }

    @Override
    public String toString() {
        return "Meister{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", potion=" + potionForHealth +
                '}';
    }
}
