package Weapons;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public class Axe implements IAttack {

    public void attack(ITakeDamage target) {
        target.takeDamage(45);
    }

}
