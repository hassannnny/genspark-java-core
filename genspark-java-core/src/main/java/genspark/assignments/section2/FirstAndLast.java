package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        boolean correct = true;


        if (word.length() > 0) {

            int last = word.length() - 1;


            if (word.charAt(0) == word.charAt(last)) {

                correct = true;
            } else {
                correct = false;
            }
        }

        return correct;

    }

}


