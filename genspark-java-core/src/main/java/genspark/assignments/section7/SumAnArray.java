package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class SumAnArray implements Assignment {
    public int solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        return Arrays.stream(nums)
                .reduce(0, (a, b) -> a + b);



    }
}
