package pl.kamilpchelka.codecool.datastructures.stack;

import pl.kamilpchelka.codecool.datastructures.exceptions.StackOverflow;
import pl.kamilpchelka.codecool.datastructures.exceptions.StackUnderflow;

public interface Stack<T> {

    void push(T value) throws StackOverflow;

    void pop() throws StackUnderflow;

    T peek() throws StackUnderflow;

    int getMaximumCapacity();

    int leftSpace();

}
