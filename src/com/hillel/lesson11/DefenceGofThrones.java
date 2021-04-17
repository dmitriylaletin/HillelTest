package com.hillel.lesson11;

public interface DefenceGofThrones {
    //объекты домов вестероса должны уметь защищаться
    int defendLords (Lord);
    //объекты армия должны уметь защищаться
    int defenceOfArmy (int armyDefense);
    //объект дракон должен уметь обороняться
    int dragonDefence (int health);
}
