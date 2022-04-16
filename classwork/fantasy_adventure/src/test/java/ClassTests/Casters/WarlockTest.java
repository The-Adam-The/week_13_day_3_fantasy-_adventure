package ClassTests.Casters;

import Behaviours.ISpell;
import Classes.Casters.Warlock;
import Familiars.Familiar;
import Spells.Conflagarate;
import Spells.DetectMagic;
import Spells.ShadowBolt;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    ISpell shadowBolt;
    ISpell conflagarate;
    ISpell detectMagic;

    @Before
    public void before() {

        shadowBolt = new ShadowBolt(40);
        conflagarate = new Conflagarate(150);
        detectMagic = new DetectMagic(20);
        warlock = new Warlock(Familiar.VOIDLING, 90, 311, "Maliketh", "Obsidianite", "n/a", 200);
    }

    @Test
    public void hasAFamiliar() {
        assertEquals(Familiar.VOIDLING, warlock.getFamiliar());
    }

    @Test
    public void hasSpells() {
        warlock.addSpell(shadowBolt);
        warlock.addSpell(conflagarate);
        warlock.addSpell(detectMagic);
        assertEquals(Arrays.asList(shadowBolt, conflagarate, detectMagic), warlock.getSpells());
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

    @Test
    public void hasTotalMana() {
        assertEquals(200, warlock.getTotalMana());
    }

    @Test
    public void hasCurrentMana() {
        assertEquals(200, warlock.getCurrentMana());
    }

    @Test
    public void canConsumeMana() {
        warlock.consumeMana(50);
        assertEquals(150, warlock.getCurrentMana());
    }
}
