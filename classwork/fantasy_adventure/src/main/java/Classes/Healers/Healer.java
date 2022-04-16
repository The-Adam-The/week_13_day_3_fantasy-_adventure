package Classes.Healers;

import Classes.PlayerCharacter;
import HealingItems.HealingItem;

public abstract class Healer extends PlayerCharacter {

    HealingItem healingItem;

    public Healer(HealingItem healingItem, double totalHealth, int age, String name, String race, String gender) {
        super(totalHealth, age, name, race, gender);
        this.healingItem = healingItem;
    }

    public HealingItem getHealingItem() {
        return this.healingItem;
    }

}
