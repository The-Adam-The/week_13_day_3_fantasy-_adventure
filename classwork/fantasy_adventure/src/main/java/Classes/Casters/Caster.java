package Classes.Casters;

import Behaviours.ISpell;
import Classes.PlayerCharacter;
import Familiars.Familiar;
import Spells.Spell;

import java.util.ArrayList;

public abstract class Caster extends PlayerCharacter {

    private Familiar familiar;
    private ArrayList<ISpell> spells;

    public Caster(Familiar familiar, double totalHealth, int age, String name, String race, String gender ) {
        super(totalHealth, age, name, race, gender);
        this.familiar = familiar;
        this.spells = new ArrayList<ISpell>();
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

    public void addSpell(ISpell spell){
        this.spells.add(spell);
    }

    public ArrayList<ISpell> getSpells(){
        return this.spells;
    }


}
