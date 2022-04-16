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
        warlock = new Warlock(Familiar.VOIDLING, 90, 311, "Maliketh", "Obsidianite", "n/a");
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

    @Test
    public void hasTotalHealth() {
        assertEquals(90, warlock.getTotalHealth(), 0.1);
    }

    @Test
    public void hasAge() {
        assertEquals(311, warlock.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Maliketh", warlock.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Obsidianite", warlock.getRace());
    }

    @Test
    public void hasGender() {
        assertEquals("n/a", warlock.getGender());
    }

}
