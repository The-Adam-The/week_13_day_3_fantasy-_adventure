package ClassTests.Casters;

import Classes.Casters.Warlock;
import Familiars.Familiar;
import org.junit.Before;
import org.junit.Test;

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
}
