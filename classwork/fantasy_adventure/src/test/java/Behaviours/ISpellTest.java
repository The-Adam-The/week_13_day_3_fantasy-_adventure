package Behaviours;

import Classes.Casters.Wizard;
import Classes.Warriors.Knight;
import Familiars.Familiar;
import Spells.FireBall;
import Weapons.Mace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ISpellTest {

    IAttack mace;
    ISpell fireBall;
    Wizard wizard;
    Knight knight;


    @Before
    public void before() {
        fireBall = new FireBall(130);
        wizard = new Wizard(Familiar.DRAGON, 80, 88, "Merl", "Human", "male", 250);
        wizard.addSpell(fireBall);
        mace = new Mace();
        knight = new Knight(mace, 140, 24, "Arthur", "Human", "Male");
    }

    @Test
    public void canDoDamageWithSpells() {
        wizard.castSpell(fireBall, knight);
        assertEquals(20, knight.getCurrentHealth(),0.1);
    }



}
