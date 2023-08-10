package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int count = 0;

        ArrayList<Integer> intList = new ArrayList<>();


        //isolate individual string element, and for each through each string

        for (int i = 0; i < myList.size(); i++) {

            count = myList.get(i).length();

            intList.add(count);

        }


        return intList;
    }
}
