package genspark.assignments.section1;

import genspark.assignments.Assignment;

public class StringInterpolation implements Assignment {
    public String solution(String str){
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String field = "INSERTED";


        return String.format(str, field);
    }
}
