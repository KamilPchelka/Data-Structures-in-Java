package pl.kamilpchelka.codecool.datastructures.queue;

public class QueueImpl<T> implements Queue<T> {

    private final T[] data;
    private int pointer = -1;

    @SuppressWarnings("unchecked")
    public QueueImpl(int size) {
        if (size <= 0) throw new IllegalArgumentException();
        this.data = (T[]) new Object[size];
    }


    @Override
    public void enqueue(T value) {

    }

    @Override
    public T peek() {
        return data[pointer];
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int queueSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public boolean isFull() {
        return pointer == data.length - 1;
    }
}
