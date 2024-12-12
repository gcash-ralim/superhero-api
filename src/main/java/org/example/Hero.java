package org.example;

public class Hero {
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public Hero(String response, int id, String name, int intelligence, int strength, int speed, int durability, int power, int combat) {
        this.response = response;
        this.id = id;
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "response='" + response + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", intelligence=" + intelligence +
                ", strength=" + strength +
                ", speed=" + speed +
                ", durability=" + durability +
                ", power=" + power +
                ", combat=" + combat +
                '}';
    }

    private String response;

    private int id;

    private String name;

    private int intelligence;
    private int strength;
    private int speed;
    private int durability;
    private int power;
    private int combat;

}
