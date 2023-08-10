package genspark.assignments.section4;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

         ArrayList<Integer> list = new ArrayList<>();
         int size = String.valueOf(number).length();

         int holder = 0;

         for (int i = 0; i < size; i++) {

             holder = number % 10;

             list.add(holder);

             number = number / 10;

         }

         String ans = "";

         for (int i = 0; i < list.size(); i++) {
             ans += list.get(i) + "";
         }

         int answer = Integer.parseInt(ans);

        return answer;
    }
}
