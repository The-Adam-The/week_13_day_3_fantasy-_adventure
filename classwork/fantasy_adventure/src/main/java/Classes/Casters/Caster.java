package Classes.Casters;

import Behaviours.ISpell;
import Behaviours.ITakeDamage;
import Classes.PlayerCharacter;
import Familiars.Familiar;

import java.util.ArrayList;

public abstract class Caster extends PlayerCharacter {

    private Familiar familiar;
    private ArrayList<ISpell> spells;
    private int totalMana;
    private int currentMana;

    public Caster(Familiar familiar, double totalHealth, int age, String name, String race, String gender, int totalMana) {
        super(totalHealth, age, name, race, gender);
        this.familiar = familiar;
        this.spells = new ArrayList<ISpell>();
        this.totalMana = totalMana;
        this.currentMana = totalMana;
    }

    public Familiar getFamiliar() {
        return this.familiar;
    }

    public void addSpell(ISpell spell) {
        this.spells.add(spell);
    }

    public ArrayList<ISpell> getSpells() {
        return this.spells;
    }

    public int getTotalMana() {
        return this.totalMana;
    }

    public int getCurrentMana() {
        return this.currentMana;
    }

    public void consumeMana(int manaCost) {
        if (currentMana >= manaCost) {
            currentMana -= manaCost;
        }
    }

    public void castSpell(ISpell spell, ITakeDamage target){

        int spellManaCost;

        spellManaCost = spell.getManaCost();

        if (spells.contains(spell)) {
            spell.castSpell(target);
        }
    }

}





