package Classes.Healers;

import HealingItems.HealingItem;

public abstract class Healer {

    HealingItem healingItem;

    public Healer(HealingItem healingItem) {
        this.healingItem = healingItem;
    }

    public HealingItem getHealingItem() {
        return this.healingItem;
    }

}
