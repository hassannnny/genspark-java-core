package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MapReduce implements Assignment {
    public int[] solution(ArrayList<ArrayList<Integer>> innerNums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        Object[] obj = new Object[innerNums.size()];

        obj = innerNums.stream()
                .map(inner -> inner.stream()
                        .reduce(0, (a, b) -> a + b))
                .toArray();

        int[] intArray = new int[obj.length];

        for(int i = 0; i < obj.length; i++) {

            intArray[i] = (int) obj[i];

        }


        return intArray;
    }
}
