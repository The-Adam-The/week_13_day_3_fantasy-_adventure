package Classes.Warriors;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;
import Classes.PlayerCharacter;

public abstract class Warrior extends PlayerCharacter {

    private IAttack weapon;

    public Warrior(IAttack weapon, double totalHealth, int age, String name, String race, String gender) {
        super(totalHealth, age, name, race, gender);
        this.weapon = weapon;
    }

    public IAttack getWeapon() {
        return this.weapon;
    }

    public void changeWeapon(IAttack weapon) {
        this.weapon = weapon;
    }


    public void attack(ITakeDamage target) {
        this.weapon.attack(target);
    }

}
