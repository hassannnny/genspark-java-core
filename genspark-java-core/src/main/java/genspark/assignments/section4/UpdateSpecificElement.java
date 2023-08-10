package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class UpdateSpecificElement implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list, int val, int index) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (list.size() > 0 && index >= 0 && index < list.size()) {

            list.set(index, val);
        }

        return list;
    }
}
