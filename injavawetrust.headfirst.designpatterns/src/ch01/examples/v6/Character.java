package ch01.examples.v6;

public abstract class Character {

    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void performWeapon() {
        weapon.useWeapon();
    }

}
