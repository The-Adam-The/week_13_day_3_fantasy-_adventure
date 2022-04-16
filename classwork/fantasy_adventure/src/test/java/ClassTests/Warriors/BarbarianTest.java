package ClassTests.Warriors;

import Classes.Warriors.Barbarian;
import Weapons.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian(Weapon.CLUB, 150, 32, "Golian", "Orc", "female");
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

    @Test
    public void hasTotalHealth() {
        assertEquals(150, barbarian.getTotalHealth(), 0.1);
    }

    @Test
    public void hasAge() {
        assertEquals(32, barbarian.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Golian", barbarian.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Orc", barbarian.getRace());
    }

    @Test
    public void hasGender() {
        assertEquals("female", barbarian.getGender());
    }
}
