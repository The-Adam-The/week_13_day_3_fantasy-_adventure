package Behaviours;

import Classes.Warriors.Barbarian;
import Classes.Warriors.Knight;
import Weapons.Club;
import Weapons.Mace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IAttackTest {

    IAttack club;
    Barbarian barbarian;

    IAttack mace;
    Knight knight;

    @Before
    public void before() {
        club = new Club();
        barbarian = new Barbarian(club, 150, 32, "Golian", "Orc", "female");

        mace = new Mace();
        knight = new Knight(mace, 140, 24, "Arthur", "Human", "Male");
    }

    @Test
    public void canAttack() {
        barbarian.attack(knight);
        assertEquals(90, knight.getCurrentHealth(),0.1);
    }

}
