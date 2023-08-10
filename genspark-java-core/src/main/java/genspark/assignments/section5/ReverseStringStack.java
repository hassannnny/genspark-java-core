package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String str = "";

        Stack<String> myStack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {

            myStack.push(word.charAt(i) + "");

        }

        for (int i = 0; i < word.length(); i++) {

            str += myStack.pop();

        }

        return str;
    }
}
