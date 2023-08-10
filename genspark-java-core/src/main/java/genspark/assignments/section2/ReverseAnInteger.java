package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        String s = String.valueOf(number);

        String reversed = "";

        for (int i = String.valueOf(number).length() - 1; i >= 0; i--) {

            reversed += s.charAt(i) + "";

        }

        return reversed;

    }
}
