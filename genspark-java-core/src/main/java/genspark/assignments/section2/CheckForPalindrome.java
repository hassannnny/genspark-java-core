package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        boolean correct = true;

        int i = 0;
        int j = pally.length() - 1;

        while (i <= j && correct == true) {

            if (pally.charAt(i) != pally.charAt(j)) {

                correct = false;

            }
            i++;
            j--;

        }

        return correct;

    }
}
