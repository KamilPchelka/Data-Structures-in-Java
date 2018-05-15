package pl.kamilpchelka.codecool.datastructures.queue;

import pl.kamilpchelka.codecool.datastructures.exceptions.QueueFullException;

public interface Queue<T> {

    void enqueue(T value) throws QueueFullException;

    T peek();

    T dequeue();

    int queueSize();

    boolean isEmpty();

    boolean isFull();


}
