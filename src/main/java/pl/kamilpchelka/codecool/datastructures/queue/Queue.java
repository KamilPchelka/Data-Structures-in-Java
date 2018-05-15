package pl.kamilpchelka.codecool.datastructures.queue;

public interface Queue<T> {

    void enqueue(T value);

    T peek();

    T dequeue();

    int queueSize();

    boolean isEmpty();

    boolean isFull();


}
