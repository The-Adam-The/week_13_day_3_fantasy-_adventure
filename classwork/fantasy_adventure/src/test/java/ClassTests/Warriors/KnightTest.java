package ClassTests.Warriors;

import Classes.Warriors.Knight;
import Weapons.Longsword;
import Weapons.Mace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KnightTest {
    Knight knight;
    Mace mace;

    @Before
    public void before() {
        mace = new Mace();
        knight = new Knight(mace, 140, 24, "Arthur", "Human", "Male");
    }

    @Test
    public void hasWeapon() {
        assertEquals(mace, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Longsword longsword;

        longsword = new Longsword();

        knight.changeWeapon(longsword);
        assertEquals(longsword, knight.getWeapon());
    }
}
