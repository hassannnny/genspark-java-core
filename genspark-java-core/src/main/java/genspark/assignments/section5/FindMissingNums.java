package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        int counter = 1;

        for (int i = 0; i < 100; i++) {

            if (!nums.contains(counter)) {

                newList.add(counter);

            }
            counter++;

        }

        return newList;
    }
}
