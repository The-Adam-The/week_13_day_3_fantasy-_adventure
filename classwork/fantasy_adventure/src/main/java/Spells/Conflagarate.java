package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class Conflagarate extends Spell implements ISpell {

    public Conflagarate(int manaCost) {
        super(manaCost, 90);
    }

}
