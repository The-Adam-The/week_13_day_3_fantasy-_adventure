package ClassTests.Warriors;

import Classes.Warriors.Barbarian;
import Classes.Warriors.Gladiator;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Spear;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;

    @Before
    public void before() {
        club = new Club();
        barbarian = new Barbarian(club, 150, 32, "Golian", "Orc", "female");
    }

    @Test
    public void hasWeapon() {
        assertEquals(club, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        Axe axe;

        axe = new Axe();
        barbarian.changeWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
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

    @Test
    public void doesDamage() {
        Spear spear;
        spear = new Spear();

        Gladiator gladiator;
        gladiator = new Gladiator(spear, 140, 22, "Pantheon", "Numean", "Male");



    }
}
