package ClassTests.Healers;

import Classes.Healers.Cleric;
import HealingItems.HealingItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTests {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric(HealingItem.STAFFOFAESCLIPIUS, 100, 35, "Alius", "Dragonkin", "male");
    }

    @Test
    public void hasHealingItem() {
        assertEquals(HealingItem.STAFFOFAESCLIPIUS, cleric.getHealingItem());
    }

    @Test
    public void hasTotalHealth() {
        assertEquals(100, cleric.getTotalHealth(), 0.1);
    }

    @Test
    public void hasAge() {
        assertEquals(35, cleric.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Alius", cleric.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Dragonkin", cleric.getRace());
    }

    @Test
    public void hasGender() {
        assertEquals("male", cleric.getGender());
    }
}
