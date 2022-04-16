package ClassTests.Casters;

import Behaviours.ISpell;
import Classes.Casters.Wizard;
import Familiars.Familiar;
import Spells.FireBall;
import Spells.LightningStrike;
import Spells.MagicMissile;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    ISpell fireBall;
    ISpell lightningStrike;
    ISpell magicMissile;

    @Before
    public void before() {
        fireBall = new FireBall(130);
        lightningStrike = new LightningStrike(150);
        magicMissile = new MagicMissile(30);

        wizard = new Wizard(Familiar.DRAGON, 80, 88, "Merl", "Human", "male", 250);
    }

    @Test
    public void hasAFamiliar() {
        assertEquals(Familiar.DRAGON, wizard.getFamiliar());
    }

    @Test
    public void hasSpells() {
        wizard.addSpell(fireBall);
        wizard.addSpell(lightningStrike);
        wizard.addSpell(magicMissile);
        assertEquals(Arrays.asList(fireBall, lightningStrike, magicMissile), wizard.getSpells());
    }

    @Test
    public void hasTotalHealth() {
        assertEquals(80, wizard.getTotalHealth(), 0.1);
    }

    @Test
    public void hasAge() {
        assertEquals(88, wizard.getAge());
    }

    @Test
    public void hasName() {
        assertEquals("Merl", wizard.getName());
    }

    @Test
    public void hasRace() {
        assertEquals("Human", wizard.getRace());
    }

    @Test
    public void hasGender() {
        assertEquals("male", wizard.getGender());
    }

    @Test
    public void hasTotalMana() {
        assertEquals(250, wizard.getTotalMana());
    }

    @Test
    public void hasCurrentMana() {
        assertEquals(250, wizard.getCurrentMana());
    }

    @Test
    public void canConsumeMana() {
        wizard.consumeMana(50);
        assertEquals(200, wizard.getCurrentMana());
    }
}
