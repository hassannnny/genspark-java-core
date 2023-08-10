package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        int max = 0;
        int min = 0;

        ArrayList<Long> list = new ArrayList<>();

        if (nums.length > 0) {

            min = nums[0];
            max = nums[0];

            for (int i = 0; i < nums.length; i++) {


                if (nums[i] > max) {
                    max = (nums[i]);
                } else if (nums[i] <= min) {
                    min = (nums[i]);
                }
            }
        }
        list.add(Long.valueOf(max));
        list.add(Long.valueOf(min));


        return list;
    }
}
