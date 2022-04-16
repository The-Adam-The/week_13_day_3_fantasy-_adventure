package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class FireBall implements IAttack, ISpell {

    public void attack(ITakeDamage target) {
        target.takeDamage(70);
    }
}
