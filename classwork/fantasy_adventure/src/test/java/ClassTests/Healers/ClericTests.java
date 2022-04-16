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
        cleric = new Cleric(HealingItem.STAFFOFAESCLIPIUS);
    }

    @Test
    public void hasHealingItem() {
        assertEquals(HealingItem.STAFFOFAESCLIPIUS, cleric.getHealingItem());
    }

}
