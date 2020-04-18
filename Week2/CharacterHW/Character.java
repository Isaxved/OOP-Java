package Week2.CharacterHW;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
