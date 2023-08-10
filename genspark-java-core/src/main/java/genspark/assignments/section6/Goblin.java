package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Goblin implements Assignment{
    // ↓↓↓↓ your code goes here ↓↓↓↓

    int strength;
    String stamina;
    String name;
    String color;

    // Do not change the constructor for goblin please!
    public Goblin() {
    }



    public Zombie attack(Zombie zombie) {

        zombie.setHealth(zombie.getHealth() + this.strength);

        return zombie;
    }

    public Goblin(int strength){
        this.strength = strength;
    }


    public int getStrength() {
        return strength;
    }
}
