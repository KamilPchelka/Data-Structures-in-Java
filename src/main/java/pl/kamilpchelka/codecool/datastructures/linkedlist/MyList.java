package pl.kamilpchelka.codecool.datastructures.linkedlist;

public interface MyList<T> extends Iterable<T> {

    void delete(T value);

    void append(T value);

    void prepend(T value);

    String toString();
}
