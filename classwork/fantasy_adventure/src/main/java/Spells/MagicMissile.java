package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class MagicMissile extends Spell implements ISpell {

    public MagicMissile(int manaCost) {
        super(manaCost, 30);
    }
}
