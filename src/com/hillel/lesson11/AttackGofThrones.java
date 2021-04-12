package com.hillel.lesson11;

public interface AttackGofThrones {
    //объекты домов вестероса должны уметь атаковать
    int attackLords (int countOfInhabitants);
    //объекты армия должны уметь атаковать замки
    int attackCastle (int defenceOfCastle);
    //объекты армия должны уметь атаковать армии
    int attackArmy (int armyDefence);
    //объект дракон должен уметь атаковать
    int dragonAttack ();


}
