package ClassTests.Casters;

import Classes.Casters.Wizard;
import Familiars.Familiar;
import org.junit.Before;
import org.junit.Test;

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
}
