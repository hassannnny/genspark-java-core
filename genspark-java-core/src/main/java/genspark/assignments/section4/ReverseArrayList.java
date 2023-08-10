package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();


        for (int i = list.size() -1; i >= 0; i--) {


            newList.add(list.get(i));

        }


        return newList;
    }
}
