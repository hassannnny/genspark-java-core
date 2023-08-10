package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<Integer> newList = new ArrayList<>();

        String str = "";
        int num = 0;
        for (int i = 0; i < list.size(); i++) {

            str += list.get(i) + "";

        }

        num = Integer.parseInt(str);

        num = num + 1;

        str = String.valueOf(num);


        for (int i = 0; i < list.size(); i++) {

            newList.add(Integer.parseInt(String.valueOf(str.charAt(i))));


        }



        return  newList;
    }
}
