package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class ParsingAnInteger implements Assignment {
    public Object solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String exception = "";
        int num = 0;

        try {

            num = Integer.parseInt(word);
            return num;

        } catch (Exception e) {

            exception = "Caught Exception: Number Format Exception";

        }

        return exception;

    }
}
