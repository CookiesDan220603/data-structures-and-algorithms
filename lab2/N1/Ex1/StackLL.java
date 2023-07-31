import java.util.*;

class StackLL extends MyStack implements StackADT {
    private MyStack list;

    public StackLL() {
        list = new MyStack();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Fraction peek() throws EmptyStackException {
        try {
            return list.getFirst();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    public Fraction pop() throws EmptyStackException {
        Fraction obj = peek();
        list.removeFirst();
        return obj;
    }

    public void push(Fraction o) {
        list.addFirst(o);
    }

    public void print() {
        list.print();
    }
}