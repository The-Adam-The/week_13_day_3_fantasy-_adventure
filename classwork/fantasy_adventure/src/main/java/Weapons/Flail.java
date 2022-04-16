package Weapons;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public class Flail implements IAttack {
    public void attack(ITakeDamage target) {
        target.takeDamage(35);
    }
}
