package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveOddsFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓



        nums = Arrays.stream(nums)
                .filter(s -> s % 2 == 0) //filters OUT all odd numbers -- it keeps what you want
                .toArray();



        return nums; //returns array with odd numbers removed
    }
}
