package ClassTests.Warriors;

import Classes.Warriors.Gladiator;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GladiatorTest {

    Gladiator gladiator;

    @Before
    public void before() {
        gladiator = new Gladiator(Weapon.SPEAR, 140, 22, "Pantheon", "Numean", "Male");
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.SPEAR ,gladiator.getWeapon());
    }

    @Test
    public void canChangeWeapon() {gladiator.changeWeapon(Weapon.FLAIL);
        assertEquals(Weapon.FLAIL, gladiator.getWeapon());
    }

}
