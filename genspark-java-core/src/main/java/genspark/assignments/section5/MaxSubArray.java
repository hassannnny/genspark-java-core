package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MaxSubArray implements Assignment {

    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        int sum = 0;
        int firstMaxFound = 1;

        if (nums.size() >= 1) {
            int max = nums.get(0);
            for (int i = 0; i < nums.size(); i++) {
                for (int j = i; j < nums.size(); j++) {
                    for (int k = i; k <= j; k++) {

                        sum += nums.get(k);

                    }
                    if ((sum > max) || (sum == max && firstMaxFound == 1))  {
                        max = sum;
                        newList.clear();

                        for (int s = i; s <= j; s++) {

                            newList.add(nums.get(s));

                        }
                    }
                    sum = 0;
                    firstMaxFound++;
                }
            }
        }

        return newList;
    }
}
