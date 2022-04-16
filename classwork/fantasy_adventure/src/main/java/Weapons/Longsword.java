package Weapons;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public class Longsword implements IAttack {

    public void attack(ITakeDamage target) {
        target.takeDamage(40);
    }
}
