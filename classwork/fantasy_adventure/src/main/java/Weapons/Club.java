package Weapons;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public class Club implements IAttack {

    public void attack(ITakeDamage target) {
        target.takeDamage(50);
    }
}
