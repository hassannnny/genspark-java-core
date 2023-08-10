package genspark.assignments.section6;

import clojure.lang.Obj;
import genspark.assignments.Assignment;

public class Zombie extends Humanoid implements Assignment{

    public Class whoIsTheParent() {
        return Zombie.class.getSuperclass();
    }

    public String attack(Object object) {

        Human human = (Human) object;

        human.setHealth(human.getHealth() - strength);

        if (human.getHealth() <= 3) {
            return "The zombie bites the human for " + strength + " damage, the human has died...";
        }
        else {
            return "The zombie bites the human for " + strength + " damage, the human survives but will be turning soon...";
        }



    }

    // Default Constructor
    public Zombie() {

        super();
    }

    private int brainLust;
    private int strength;
    private int intelligence;
    private int health;
    private int compassion;

    public int getBrainLust() {
        return brainLust;
    }

    public void setBrainLust(int brainLust) {
        this.brainLust = brainLust;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCompassion() {
        return compassion;
    }

    public void setCompassion(int compassion) {
        this.compassion = compassion;
    }

    public Zombie(int brainLust, int strength, int intelligence, int health, int compassion) {
        this.brainLust = brainLust;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.compassion = compassion;
    }



}


