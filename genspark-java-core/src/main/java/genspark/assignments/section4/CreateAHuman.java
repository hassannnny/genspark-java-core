package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.HashMap;

public class CreateAHuman implements Assignment {
    public HashMap<String, Object> solution(String name, Long age) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<String, Object> humans = new HashMap<>();
        humans.put("name", name);
        humans.put("age", age);
        return humans;
    }
}