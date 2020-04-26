package com.isaxved.Week1.Week4.ErrorHomeWork;

public abstract class Warrior {

    private String firstName;
    private String lastName;
    private Weapon weapon;


    public void fight(){
        weapon.fight();
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) throws WrongWeaponException {
        this.weapon = weapon;
    }
}
