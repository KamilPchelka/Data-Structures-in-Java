package pl.kamilpchelka.codecool.datastructures;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MySinglyLinkedList<T> implements MyList<T>{

    private SingleNode<T> head;

    @Override
    public void delete(T value) {

    }

    @Override
    public void append(T value) {
        if (head == null) {
            head = new SingleNode<>(value);
            return;
        }

        SingleNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new SingleNode<>(value);
    }

    @Override
    public void prepend(T value) {
        if (head == null) {
            head = new SingleNode<>(value);
            return;
        }

        SingleNode<T> singleNode = new SingleNode<>(value);
        singleNode.next = head;
        head = singleNode;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        if (head.next == null) {
            result.append(head);
        } else {
            forEach(e -> result.append(e).append(","));
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        SingleNode current = head;
        while (current != null) {
            action.accept(current);
            current = current.next;

        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
