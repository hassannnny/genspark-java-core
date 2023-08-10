package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramComputation implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        boolean correct = false;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();



        if (word1.length() > 1 && word1.length() == word2.length() && !word1.equals(word2)) {

            correct = true;


            Arrays.sort(w1);
            Arrays.sort(w2);

            for (int i = 0; i < w1.length; i++) {

                if (w1[i] != w2[i]) {
                    correct = false;
                }

            }

        }

        return correct;
    }
}
