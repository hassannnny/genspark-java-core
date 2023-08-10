package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class SwitchItUp implements Assignment {
    public String solution(int x) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String s = ""; 
        
        
        switch (x) {
            case 1:
                s = "one";
                break;
                
            case 2: 
                s = "two"; 
                break;
                
            case 3: 
                s = "three";
                break;
                
            case 4: 
                s = "four"; 
                break;
                
            case 5: 
                s = "five"; 
                break;
        }

        return s;
    }
}
