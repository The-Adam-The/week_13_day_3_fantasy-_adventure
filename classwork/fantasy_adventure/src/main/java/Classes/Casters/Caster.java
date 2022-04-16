package Classes.Casters;

import Familiars.Familiar;
import Spells.Spell;

import java.util.ArrayList;

public abstract class Caster {

    private Familiar familiar;
    private ArrayList<Spell> spells;

    public Caster(Familiar familiar) {
        this.familiar = familiar;
        this.spells = new ArrayList<Spell>();
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

    public void addSpell(Spell spell){
        this.spells.add(spell);
    }

    public ArrayList<Spell> getSpells(){
        return this.spells;
    }


}
