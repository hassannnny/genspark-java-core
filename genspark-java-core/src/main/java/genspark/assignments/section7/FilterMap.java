package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap implements Assignment {
    public Object[] solution(ArrayList<ArrayList<Integer>> listolists) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        return listolists.stream()
                .filter(l -> l.size() % 2 == 1)
                .map(l -> l.stream().map(x -> x * 10).collect(Collectors.toList()))
                .toArray();


    }




}
