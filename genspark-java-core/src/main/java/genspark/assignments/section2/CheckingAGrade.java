package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String score = "";

        if (grade >= 90 && grade <= 100) {
            score = "A";
        }
        else if (grade >= 80 && grade < 90) {
            score = "B";
        }
        else if (grade >= 70 && grade < 80) {
            score = "C";
        }
        else if (grade < 70) {
            score = "FAILURE";
        }

        return score;
    }
}
