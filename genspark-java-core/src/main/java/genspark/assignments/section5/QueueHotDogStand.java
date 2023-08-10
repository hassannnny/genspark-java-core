package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        Queue<Integer> myQueue = new LinkedList<>();

        ArrayList<Integer> newList = list;

        int temp = 0;

        if (list.size() >= 1) {
            for (int i = 0; i < 3; i++) {

                temp = list.get(0);

                for (int j = 0; j < list.size() - 1; j++) {

                    list.set(j, list.get(j + 1));

                }
                list.set(list.size() - 1, temp);

            }
        }



        return list;
    }
}
