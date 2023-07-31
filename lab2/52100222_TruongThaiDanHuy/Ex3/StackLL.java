import java.util.*;

class StackLL extends MyStack {
    private MyStack list;

    public StackLL() {
        list = new MyStack();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String peek() throws EmptyStackException {
        try {
            return list.getFirst();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    public String pop() throws EmptyStackException {
        String obj = peek();
        list.removeFirst();
        return obj;
    }

    public void push(String o) {
        list.addFirst(o);
    }
}