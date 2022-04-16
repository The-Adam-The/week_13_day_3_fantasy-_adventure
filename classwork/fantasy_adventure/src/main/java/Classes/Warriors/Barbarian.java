package Classes.Warriors;

import Weapons.Weapon;

public class Barbarian extends Warrior {

    private Weapon weapon;

    public Barbarian(Weapon weapon, double totalHealth, int age, String name, String race, String gender) {
        super(weapon, totalHealth, age, name, race, gender);
    }


}
