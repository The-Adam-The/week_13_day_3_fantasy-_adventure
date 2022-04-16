package Classes.Warriors;

import Classes.PlayerCharacter;
import Weapons.Weapon;

public abstract class Warrior extends PlayerCharacter {

    private Weapon weapon;

    public Warrior(Weapon weapon, double totalHealth, int age, String name, String race, String gender) {
        super(totalHealth, age, name, race, gender);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
