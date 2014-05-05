package dhbw.java.practice.algorithms.excercise13;

import java.util.ArrayList;

public class FeldStapel {
    ArrayList pseudoStack = new ArrayList();

    public void push(Object newElement) {
        pseudoStack.add(0, newElement);
    }

    public Object pop() {
        if (pseudoStack.isEmpty()) return null;
        Object top = pseudoStack.get(0);
        pseudoStack.remove(0);
        return top;
    }
}
