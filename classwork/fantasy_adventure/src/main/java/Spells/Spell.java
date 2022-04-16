package Spells;

import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public abstract class Spell implements ISpell {

    int manaCost;
    int spellDamage;

    public Spell(int manaCost, int spellDamage) {
        this.spellDamage = spellDamage;
        this.manaCost = manaCost;
    }

    public void castSpell(ITakeDamage target) {
        target.takeDamage(spellDamage);
    }

    public int getManaCost() {
        return this.manaCost;
    }
}
