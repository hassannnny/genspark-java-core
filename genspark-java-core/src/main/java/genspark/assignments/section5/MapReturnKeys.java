package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;

public class MapReturnKeys implements Assignment {
    public ArrayList<String> solution(HashMap<String,Integer> map){
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<String> newList = new ArrayList<String>();

        for (String key: map.keySet()) {

            newList.add(key);

        }



        return newList;
    }
}
