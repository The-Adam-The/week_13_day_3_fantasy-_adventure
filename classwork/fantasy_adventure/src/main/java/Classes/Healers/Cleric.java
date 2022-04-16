package Classes.Healers;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;
import HealingItems.HealingItem;

public class Cleric extends Healer {

    public Cleric(HealingItem healingItem, double totalHealth, int age, String name, String race, String gender) {
        super(healingItem, totalHealth, age, name, race, gender);
    }

}