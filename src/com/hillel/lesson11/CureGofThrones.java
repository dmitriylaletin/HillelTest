package com.hillel.lesson11;

public interface CureGofThrones {
    //лорды вестероса должны уметь лечиться
    int cureKingdom (int life);
    //армия должны уметь лечиться
    int cureArmy (int lassitude);
    //мейстер может лечить
    int cureMeister (int lassitude);
    //Дейнерис может лечить
    int cureDaenerys (int health);


}
