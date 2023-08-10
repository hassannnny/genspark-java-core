package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int middle = 0;
        if (stack.size() > 0) {

            //determines middle element
            if (stack.size() % 2 == 0) {

                middle = (stack.size() / 2) - 1;
            }
            else {

                middle = stack.size() / 2;
            }

            ArrayList<Integer> list = new ArrayList<>();

            //popping all the elements above the middle index inclusive
            for (int i = stack.size() - 1; i > middle; i--) {

                list.add(stack.pop()); //last element of list is the middle element
            }

            middle = stack.pop();

            //pushing elements back on stack
            for (int i = list.size() - 1; i >= 0; i--) {

                stack.push(list.get(i));

            }
        }
        return stack;
    }
}
