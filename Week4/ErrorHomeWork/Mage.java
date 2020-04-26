package com.isaxved.Week1.Week4.ErrorHomeWork;

public class Mage extends Warrior{

    @Override
    public void setWeapon(Weapon weapon) throws WrongWeaponException {
        if(!weapon.equals(new DoubleAxe())){
            throw new WrongWeaponException("Ooops: Mages cannot use Axes");
        } else {
            System.out.println(getFirstName() + "has a magic sword!");
        }

    }
}
