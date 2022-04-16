package ClassTests.Casters;

import Classes.Casters.Warlock;
import Familiars.Familiar;
import Spells.Spell;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock(Familiar.VOIDLING);
    }

    @Test
    public void hasAFamiliar() {
        assertEquals(Familiar.VOIDLING, warlock.getFamiliar());
    }

    @Test
    public void hasSpells() {
        warlock.addSpell(Spell.SHADOWBOLT);
        warlock.addSpell(Spell.CONFLAGARATE);
        warlock.addSpell(Spell.DETECTMAGIC);
        assertEquals(Arrays.asList(Spell.SHADOWBOLT, Spell.CONFLAGARATE, Spell.DETECTMAGIC), warlock.getSpells());
    }
}
