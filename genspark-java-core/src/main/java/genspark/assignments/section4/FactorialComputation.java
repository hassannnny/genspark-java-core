package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓




        for (int i = n - 1; i > 0; i--) {

            n = i * n;

        }

        return n;
    }
}
