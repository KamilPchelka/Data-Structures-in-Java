package pl.kamilpchelka.codecool.datastructures.exceptions;

public class QueueFullException extends RuntimeException {

    public QueueFullException() {
        super("The queue is full.");
    }
}
