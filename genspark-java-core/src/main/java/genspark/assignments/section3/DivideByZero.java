package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String exception = "";

        try {

            int product = one / two;

            return product;


        } catch (Exception e) {

            exception = "Caught Exception: Divide by zero";

        }

        return exception;

    }
}
