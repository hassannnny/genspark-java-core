package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Goblin implements Assignment{
    int strength;
    String stamina;
    String name;
    String color;

    // Do not change the constructor for goblin please!
    public Goblin() {
    }
    public Goblin(int strength){
        this.strength = strength;
    }

    public Zombie attack(Zombie zombie) {
        zombie.setHealth(zombie.getHealth() + this.strength);
        return zombie;
    }

    public int getStrength() {
        return strength;
    }
}
