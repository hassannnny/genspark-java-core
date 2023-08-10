package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        Set<Integer> mySet = new TreeSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            mySet.add(nums[i]);
        }

        int[] arr = new int[mySet.size()];

        Iterator  value = mySet.iterator();

        for (int i = 0; i < mySet.size(); i++) {

            arr[i] = (Integer) value.next();
        }

        return arr;
        }
    }

