package Classes;

import Behaviours.IAttack;
import Behaviours.ITakeDamage;

public abstract class PlayerCharacter implements ITakeDamage {

    private double totalHealth;
    protected double currentHealth;
    private int age;
    private String name;
    private String race;
    private String gender;

    public PlayerCharacter(double totalHealth, int age, String name, String race, String gender) {
        this.totalHealth = totalHealth;
        this.currentHealth =totalHealth;
        this.age = age;
        this.name = name;
        this.race = race;
        this.gender = gender;
    }

    public double getTotalHealth() {
        return this.totalHealth;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public String getGender() {
        return this.gender;
    }

    public double getCurrentHealth() {
        return this.currentHealth;
    }

    public void takeDamage(double damageAmount) {
        this.currentHealth -= damageAmount;
    }

}


