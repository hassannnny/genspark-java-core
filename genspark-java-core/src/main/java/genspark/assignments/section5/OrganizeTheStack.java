package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        ArrayList<Integer> holder = new ArrayList<>();

        Stack<Integer> newStack = new Stack<>();

        if (stack.size() >= 1) {

            int max = stack.peek();
            int size = stack.size();
            int index = 0;

            //adding stack elements to list
            for (int i = stack.size() - 1; i >= 0; i--) {

                holder.add(stack.pop());

            }

            for (int i = 0; i < size; i++) { //pushing max elements on stack

                for (int j = 0; j < holder.size(); j++) {

                    if (holder.get(j) > max) {
                        max = holder.get(j);
                        index = j;
                    }
                }
                newStack.push(max);
                holder.remove(index);
                if (holder.size() >= 1) {
                    max = holder.get(0);
                }
                index = 0;

            }
        }
        return newStack;
    }
}
