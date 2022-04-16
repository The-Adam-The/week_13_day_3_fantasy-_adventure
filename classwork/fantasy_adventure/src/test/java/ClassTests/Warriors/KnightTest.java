package ClassTests.Warriors;

import Classes.Warriors.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KnightTest {
    Knight knight;

    @Before
    public void before() {
        knight = new Knight(Weapon.MACE);
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapon.MACE, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        knight.changeWeapon(Weapon.LONGSWORD);
        assertEquals(Weapon.LONGSWORD, knight.getWeapon());
    }
}
