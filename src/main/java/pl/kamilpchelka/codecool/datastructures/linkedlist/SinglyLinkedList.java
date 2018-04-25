package pl.kamilpchelka.codecool.datastructures.linkedlist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;

public class SinglyLinkedList<T> implements MyList<T> {

    private SingleNode<T> head;
    private SingleNode<T> last;
    private int length = 0;

    @Override
    public void delete(T value) {

        if (head == null) return;

        if (head.value == value) {
            head = null;
            return;
        }

        SingleNode current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    @Override
    public void append(T value) {
        if (head == null) {
            head = new SingleNode<>(value);
            last = head;
            length++;
            return;
        }

        SingleNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        SingleNode<T> newNode = new SingleNode<>(value);
        current.next = newNode;
        last = newNode;

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
        length++;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        if (head == null) {
            return "";
        } else if (head.next == null) {
            result.append(head);
        } else {
            forEach((Consumer<? super T>) e -> result.append(e).append(","));
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        SingleNode<T> current = head;

        while (current != null) {
            action.accept(current.value);
            current = current.next;

        }
    }

    public void map(Function<T, T> function) {
        SingleNode<T> current = head;

        while (current != null) {
            current.value = function.apply(current.value);
            current = current.next;

        }
    }

    @Override
    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }

    public T getLast() {
        return last == null ? null : last.value;
    }

    public int getLength() {
        return length;
    }
}
