package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;



public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        if (nth > 0) {
            int previous = 1;

            newList.add(previous);


            for (int i = 1; i <= nth; i++) {

                int current = (previous * (nth - i + 1)) / i;
                newList.add(current);
                previous = current;

            }
        }
        else {

            newList.add(1);

        }

        return newList;
    }
}
