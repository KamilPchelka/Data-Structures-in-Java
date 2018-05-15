package pl.kamilpchelka.codecool.datastructures.queue;

public class QueueImpl<T> implements Queue<T> {

    private final T[] data;

    @SuppressWarnings("unchecked")
    public QueueImpl(int size) {

        this.data = (T[]) new Object[size];
    }


    @Override
    public void enqueue(T value) {

    }

    @Override
    public T peek() {
        return null;
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
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
