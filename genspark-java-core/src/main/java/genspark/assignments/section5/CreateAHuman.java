package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;

public class CreateAHuman implements Assignment {
    public HashMap<String, Object> solution(String name, Long age) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        HashMap<String, Object> hm = new HashMap<String, Object>();


        hm.put("name", name);
        hm.put("age", age);


        return hm;
    }
}
