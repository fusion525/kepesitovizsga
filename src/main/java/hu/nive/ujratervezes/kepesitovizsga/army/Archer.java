package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    public int health = 50;
    public int damage = 20;

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        this.health = health - damage;
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
