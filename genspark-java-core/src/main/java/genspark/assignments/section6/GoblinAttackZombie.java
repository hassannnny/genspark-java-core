package genspark.assignments.section6;

import clojure.lang.Obj;
import genspark.assignments.Assignment;

public class GoblinAttackZombie implements Assignment {

    // ↓↓↓↓ your code goes here ↓↓↓↓

    Zombie zombie = new Zombie();
    Goblin goblin = new Goblin();

    public Zombie attack(Zombie zombie) {

        zombie.setHealth(zombie.getHealth() + goblin.strength);

        return zombie;
    }

    public String determineOutcome(Zombie zombie) {

        if (zombie.getHealth() <= 0) {
            return "ermmm I am still alive!";
        }
        else {
            return "Zombie is alive, therefore it is not a zombie!";
        }
    }
}
