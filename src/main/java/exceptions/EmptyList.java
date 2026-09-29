package exceptions;

public class EmptyList extends RuntimeException {
    public EmptyList() {
        super("Empty list");
    }
}
