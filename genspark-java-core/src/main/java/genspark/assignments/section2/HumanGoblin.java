package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String answer = "";

        if (str == "human") {
            answer = "You aRe one of us!";
        }
        else if (str == "goblin") {
            answer = "Attack the Goblin!";
        }
        return answer;
    }
}
