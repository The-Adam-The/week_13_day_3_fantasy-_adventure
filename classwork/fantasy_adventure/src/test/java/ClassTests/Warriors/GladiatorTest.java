package ClassTests.Warriors;

import Classes.Warriors.Gladiator;
import Weapons.Flail;
import Weapons.Spear;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GladiatorTest {

    Gladiator gladiator;
    Spear spear;

    @Before
    public void before() {
        spear = new Spear();
        gladiator = new Gladiator(spear, 140, 22, "Pantheon", "Numean", "Male");
    }

    @Test
    public void hasWeapon() {
        assertEquals(spear ,gladiator.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Flail flail;

        flail = new Flail();
        gladiator.changeWeapon(flail);
        assertEquals(flail, gladiator.getWeapon());
    }

}
