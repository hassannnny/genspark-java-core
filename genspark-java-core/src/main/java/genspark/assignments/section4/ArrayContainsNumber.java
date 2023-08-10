package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class ArrayContainsNumber implements Assignment {
    public boolean solution(int[] nums, int num) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        boolean yes = false;

        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                yes = true;
                i = nums.length;
            }
            else {
                yes = false;
            }
        }

        return yes;

    }
}
