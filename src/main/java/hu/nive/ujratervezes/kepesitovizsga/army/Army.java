package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Army {

    public List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit)
    {
        units.add(militaryUnit);
    }

    public void damageAll(int damage)
    {
        ListIterator<MilitaryUnit> iterator = units.listIterator();
        while (iterator.hasNext())
        {
            iterator.next().sufferDamage(damage);
            if (iterator.next().getHealth() < 25)
            {
                iterator.remove();
            }
        }
    }

    public int getArmySize()
    {
        return units.size();
    }

    public int getArmyDamage()
    {
        int allDamage = 0;
        for (MilitaryUnit unit : units)
        {
            allDamage += unit.doDamage();
        }
        return allDamage;
    }

}
