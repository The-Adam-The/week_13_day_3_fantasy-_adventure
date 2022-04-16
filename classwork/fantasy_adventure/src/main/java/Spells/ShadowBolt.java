package Spells;

import Behaviours.ISpell;


public class ShadowBolt extends Spell implements  ISpell {

    public ShadowBolt(int manaCost) {
        super(manaCost,40);
    }
}
