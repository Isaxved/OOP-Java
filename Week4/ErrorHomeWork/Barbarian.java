package com.isaxved.Week1.Week4.ErrorHomeWork;

public class Barbarian extends Warrior{

    @Override
    public void setWeapon(Weapon weapon) throws WrongWeaponException {

            if(weapon.equals(new MagicSword())){
                throw new WrongWeaponException("Do not joke with "+getFirstName()+" Barbarians have a allergy on Magic weapons");
            } else {
                System.out.println(getFirstName() + " has a double axe!");
            }

    }

}
