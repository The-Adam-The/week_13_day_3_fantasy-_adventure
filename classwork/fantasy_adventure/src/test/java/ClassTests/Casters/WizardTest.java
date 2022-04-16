package ClassTests.Casters;

import Classes.Casters.Wizard;
import Familiars.Familiar;
import Spells.Spell;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard(Familiar.DRAGON, 80, 88, "Merl", "Human", "male");
    }

    @Test
    public void hasAFamiliar() {
        assertEquals(Familiar.DRAGON, wizard.getFamiliar());
    }

    @Test
    public void hasSpells() {
        wizard.addSpell(Spell.FIREBALL);
        wizard.addSpell(Spell.LIGHTNINGSTRIKE);
        wizard.addSpell(Spell.MAGICMISSILE);
        assertEquals(Arrays.asList(Spell.FIREBALL, Spell.LIGHTNINGSTRIKE, Spell.MAGICMISSILE), wizard.getSpells());
    }

    @Test
    public void hasTotalHealth() {
        assertEquals(80, wizard.getTotalHealth(), 0.1);
    }

    @Test
    public void hasAge() {
        assertEquals(88, wizard.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Merl", wizard.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Human", wizard.getRace());
    }

    @Test
    public void hasGender() {
        assertEquals("male", wizard.getGender());
    }
}