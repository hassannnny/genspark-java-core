package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Dog extends Animal implements Assignment {
    @Override
    public String speak() {
        return "arf";
    }
}
