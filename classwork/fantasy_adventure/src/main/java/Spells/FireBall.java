package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class FireBall extends Spell implements ISpell {

    public FireBall(int manaCost){
        super(manaCost,120);
    }

}
