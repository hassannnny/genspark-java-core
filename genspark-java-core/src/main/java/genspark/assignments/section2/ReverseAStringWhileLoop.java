package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String s = "";

        int count = str.length() -1;

        while (count >= 0) {
            s += str.charAt(count);
            count--;
        }

        return s;
    }
}
