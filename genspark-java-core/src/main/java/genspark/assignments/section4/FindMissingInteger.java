package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) != i + 1) {
                count = i + 1;
                i = numbers.size();
            }

        }

        return count;
    }
}
