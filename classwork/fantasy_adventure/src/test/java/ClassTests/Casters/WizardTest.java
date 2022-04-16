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
        wizard = new Wizard(Familiar.DRAGON);
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
}
