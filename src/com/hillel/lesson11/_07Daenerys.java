package com.hillel.lesson11;

import java.util.Arrays;

/*7)  Обьект Дейнерис с полями имя(<- не нужно), жизнь и драконы*/
public class _07Daenerys {

    private int daenerysLife = 100;
    private _08Dragon dragon[] = initDragons();

    private _08Dragon[] initDragons() {
        _08Dragon firstDragon = new _08Dragon("Drago", 1000, 200);
        _08Dragon secondDragon = new _08Dragon("Vizerys", 1000, 200);
        _08Dragon thirdDragon = new _08Dragon("Reygal", 1000, 200);

        _08Dragon initDragons[] = {firstDragon, secondDragon, thirdDragon};
        return initDragons;
    }

    public _07Daenerys(int daenerysLife, _08Dragon[] dragon) {
        this.daenerysLife = daenerysLife;
        this.dragon = dragon;
    }

    public int getDaenerysLife() {
        return daenerysLife;
    }

    public void setDaenerysLife(int daenerysLife) {
        this.daenerysLife = daenerysLife;
    }

    public _08Dragon[] getDragon() {
        return dragon;
    }

    public void setDragon(_08Dragon[] dragon) {
        this.dragon = dragon;
    }

    @Override
    public String toString() {
        return "_07Daenerys{" +
                "daenerysLife=" + daenerysLife +
                ", dragon=" + Arrays.toString(dragon) +
                '}';
    }
}
