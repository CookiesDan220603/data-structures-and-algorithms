import java.util.*;

class QueueLL extends MyQueue implements QueueADT {
    private MyQueue list;

    public QueueLL() {
        list = new MyQueue();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean offer(Fraction o) {
        list.addLast(o); 
        return true;
    }

    public Fraction peek() {
        if (isEmpty())
            return null;
        return list.getFirst();
    }

    public Fraction poll() {
        Fraction obj = peek();
        if (!isEmpty())
            list.removeFirst();
        return obj;
    }

    public void print() {
        list.print();
    }
}