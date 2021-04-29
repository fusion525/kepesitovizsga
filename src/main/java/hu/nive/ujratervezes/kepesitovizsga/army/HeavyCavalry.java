package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.concurrent.atomic.AtomicBoolean;

public class HeavyCavalry extends MilitaryUnit{

    public int health = 150;
    public int damage = 20;
    boolean isShielded = true;
    private boolean firstAttack = false;

    @Override
    public int doDamage() {
        if (!firstAttack)
        {
            firstAttack = true;
            return 60;
        }
        return 20;
    }

    @Override
    public void sufferDamage(int damage) {
        this.health = health - damage/2;
    }

    @Override
    public int getHitPoints() {
        return health;
    }

    @Override
    public int getHealth() {
        return health;
    }

}
