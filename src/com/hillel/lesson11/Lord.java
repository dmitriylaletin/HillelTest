package com.hillel.lesson11;

import java.util.Random;

public class Lord {
    private String name;
    private int life = 100;
    private boolean loyalty;
    private int defence;

    public Lord(String name, int life) {
        this.loyalty = randomLoyalty();
        this.name = name;
        this.life = life;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
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

    public boolean isLoyalty() {
        return loyalty;
    }

    public void setLoyalty(boolean loyalty) {
        this.loyalty = loyalty;
    }

    private boolean randomLoyalty() {

        Random myRnd = new Random(100);
        int a = myRnd.nextInt();

        if (a > 50) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lord{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", loyalty=" + loyalty +
                ", defence=" + defence +
                '}';
    }
}
