package Spells;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class Conflagarate implements IAttack, ISpell {

    public void attack(ITakeDamage target) {
        target.takeDamage(90);
    }
}
