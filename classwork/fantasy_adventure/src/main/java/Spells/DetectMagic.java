package Spells;

import Behaviours.ISpell;
import Behaviours.ITakeDamage;

public class DetectMagic extends Spell implements ISpell {

    public DetectMagic(int manaCost){
        super(manaCost, 0);
    }

    @Override
    public void castSpell(ITakeDamage target) {
        System.out.println("There is magic.");
    }

}
