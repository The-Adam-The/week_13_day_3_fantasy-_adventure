package Classes;

public abstract class PlayerCharacter {

    private double totalHealth;
    private int age;
    private String name;
    private String race;
    private String gender;

    public PlayerCharacter(double totalHealth, int age, String name, String race, String gender) {
        this.totalHealth = totalHealth;
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



}
