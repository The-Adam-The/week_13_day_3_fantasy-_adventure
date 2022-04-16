package ClassTests.Warriors;

import Classes.Warriors.Barbarian;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(Weapon.CLUB);
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, barbarian.getWeapon());
    }
}
