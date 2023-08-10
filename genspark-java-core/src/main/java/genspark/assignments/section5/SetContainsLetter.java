package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class SetContainsLetter implements Assignment {
    public Object solution(HashSet<Integer> nums, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        if (nums.contains(elm)) {

            Integer obj = elm;
            return obj;

        }
        else {

            return "?";

        }

    }
}
