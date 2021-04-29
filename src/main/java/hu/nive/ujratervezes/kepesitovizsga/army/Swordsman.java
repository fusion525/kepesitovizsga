package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    public int health = 100;
    public int damage = 10;
    boolean isShielded;

    public Swordsman(boolean isShielded) {
        this.isShielded = isShielded;
    }

    @Override
    public int doDamage() {
        return 0;
    }

    @Override
    public void sufferDamage(int damage) {
        if (isShielded == true && this.health == 100)
        {
            isShielded = false;
        }
        else {
            this.health = health - damage;
        }
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
