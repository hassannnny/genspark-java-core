package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class IndexOutBounds implements Assignment {
    public Object solution(int[] array, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String exception = "";

        int answer = 0;


        try {

            answer = array[index];

            return answer;

        } catch (Exception e) {

            exception ="Caught Exception: Index Out of Bounds.";
        }

        return exception;
    }
}
