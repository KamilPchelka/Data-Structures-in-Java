package pl.kamilpchelka.codecool.datastructures.linkedlist;

public class DoubleNode<T> {

    public DoubleNode next;
    public DoubleNode previous;
    T value;

    public DoubleNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
