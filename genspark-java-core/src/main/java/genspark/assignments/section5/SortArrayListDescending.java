package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class SortArrayListDescending implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        boolean sorted = false;
        int holder = 0;
        int count = 0;

        if (list.size() > 1) {

            while (!sorted) {

                for(int i = 0; i < list.size() - 1; i++) {

                    if (list.get(i) < list.get(i + 1)) {

                        holder = list.get(i);
                        list.set(i, list.get(i + 1)) ;
                        list.set(i + 1, holder);
                    }
                    else if (list.get(i) >= list.get(i + 1)) {

                        count++;
                    }
                }
                if (count == list.size() - 1) {

                    sorted = true;
                }
                count = 0;
            }
            return list;
        }
        else {

            return list;
        }
    }
}
