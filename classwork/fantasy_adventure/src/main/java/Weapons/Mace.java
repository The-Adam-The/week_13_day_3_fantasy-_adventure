package Weapons;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public class Mace implements IAttack {

    public void attack(ITakeDamage target) {
        target.takeDamage(30);
    }
}
