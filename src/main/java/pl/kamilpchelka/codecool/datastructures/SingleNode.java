package pl.kamilpchelka.codecool.datastructures;

public class SingleNode<T> {

    T value;
    public SingleNode next;

    public SingleNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }



}
