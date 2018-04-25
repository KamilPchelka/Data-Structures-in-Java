package pl.kamilpchelka.codecool.datastructures.stack;

public interface Stack<T> {

    void push(T value);

    T pop();

    T peek();

    int getSize();

    int leftSpace();

}
