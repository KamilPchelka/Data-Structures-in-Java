package pl.kamilpchelka.codecool.datastructures.linkedlist;

public class SingleNode<T> {

    public SingleNode next;
    T value;

    public SingleNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
