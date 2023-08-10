package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.lang.Math;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            if ((Math.abs(nums.get(i))) % 2 == 1) {
                newList.add(nums.get(i));
            }

        }

        for (int i = 0; i < nums.size(); i++) {

            if ((Math.abs(nums.get(i))) % 2 == 0) {
                newList.add(nums.get(i));
            }

        }

        return newList;
    }
}
