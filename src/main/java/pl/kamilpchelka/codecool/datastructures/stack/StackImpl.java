package pl.kamilpchelka.codecool.datastructures.stack;

import pl.kamilpchelka.codecool.datastructures.exceptions.StackOverflow;
import pl.kamilpchelka.codecool.datastructures.exceptions.StackUnderflow;

import java.util.ArrayList;

public class StackImpl<T> extends ArrayList<T> implements Stack<T> {

    private final int maximumCapacity;

    public StackImpl(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public void push(T value) throws StackOverflow {
        if (this.size() == maximumCapacity) throw new StackOverflow();
        this.add(value);
    }

    @Override
    public void pop() throws StackUnderflow {
        T value = peek();
        this.remove(value);
    }

    @Override
    public T peek() throws StackUnderflow {
        int highestIndex = this.size() - 1;
        if (highestIndex < 0) throw new StackUnderflow();

        return this.get(highestIndex);
    }

    @Override
    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    @Override
    public int leftSpace() {
        return maximumCapacity - size();
    }


}
