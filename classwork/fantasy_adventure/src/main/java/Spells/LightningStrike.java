package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class LightningStrike extends Spell implements ISpell {

    public LightningStrike(int manaCost){
        super(manaCost, 200);
    }
}
