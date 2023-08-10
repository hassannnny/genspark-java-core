package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import java.util.*;

public class RetrieveValueFromGivenKey implements Assignment {
    public int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int answer = 0;


        for (Entry<Integer, Integer> entry: map.entrySet()) {

            if (entry.getKey() == value) {

                answer = entry.getValue();

            }

        }

        return answer;
    }
}
