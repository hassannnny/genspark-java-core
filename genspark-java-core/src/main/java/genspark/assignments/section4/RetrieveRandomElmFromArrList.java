package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class RetrieveRandomElmFromArrList implements Assignment {
    public Integer solution(ArrayList<Integer> arrList, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int num = 0;

        if (arrList.size() > 0 && elm < arrList.size()) {

            num = arrList.get(elm);
        }

        return num;
    }
}
