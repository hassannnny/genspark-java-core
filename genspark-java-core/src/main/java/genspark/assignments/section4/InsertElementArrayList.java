package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class InsertElementArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(5);

        for (int i = 0; i < list.size(); i++) {

            myList.add(list.get(i));

        }


        return myList;
    }
}
