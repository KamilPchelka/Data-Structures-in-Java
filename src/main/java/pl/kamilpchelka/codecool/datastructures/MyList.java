package pl.kamilpchelka.codecool.datastructures;

public interface MyList<T> extends Iterable<T>{

    void delete(T value);

    void append(T value);

    void prepend(T value);

    String toString();
}
