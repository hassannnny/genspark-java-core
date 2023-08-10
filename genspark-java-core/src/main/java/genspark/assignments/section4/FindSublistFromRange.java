package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        int size = to - from;
        int elmsCount = from;

        for (int i = 0; i < size; i++) {

            newList.add(elms.get(from));
            from++;


        }



        return newList;
    }
}
