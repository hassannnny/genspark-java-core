package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class RetrieveSpecifiedElement implements Assignment {
    public int solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int num = 0;

        if (list.size() > 0) {

            num = list.get(0);
        }

        return num;
    }
}
