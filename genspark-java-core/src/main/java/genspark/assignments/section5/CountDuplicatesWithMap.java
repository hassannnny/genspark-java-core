package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int count = 1;

        int key = 0;


        for (int i = 0; i < nums.size(); i++) {

            //it only needs to iterate just one time, the map will search for the same key

            key = nums.get(i);

            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            }
            else {
                hm.put(key, 1);
            }


        }


        return hm;
    }
}
