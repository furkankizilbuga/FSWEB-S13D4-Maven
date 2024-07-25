package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;



    public Player(String name, int healthPercentage, Weapon weapon) {
        this.healthPercentage = healthPercentage > 100 ? 100 : healthPercentage < 0 ? 0 : healthPercentage;
        this.name = name;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if(healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of game");
            healthPercentage = 0;
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if(healthPercentage > 100) healthPercentage = 100;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
