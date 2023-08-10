package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String s = "";

        int count = from;

        while (count <= to) {

            s += count + "";

            count++;
        }

        return s;
    }
}
