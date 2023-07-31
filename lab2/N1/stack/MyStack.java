import java.util.*;

public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int numNode;

    public MyStack() {
        this.top = null;
        numNode = 0;
    }

    @Override
    public void push(E item) {
        top = new Node<E>(item, top);
        numNode++;
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (this.top == null) {
            throw new NoSuchElementException();
        } else {
            Node<E> tmp = top;
            top = top.getNext();
            this.numNode--;
            return tmp.getData();
        }
    }

    @Override
    public int size() {
        return this.numNode;
    }

    @Override
    public boolean contains(E item) throws NoSuchElementException {
        if (this.top == null) {
            throw new NoSuchElementException();
        } else {
            Node<E> tmp = top;
            while (tmp != null) {
                if (tmp.equals(item))
                    return true;
                tmp = tmp.getNext();
            }
            return false;
        }
    }

    @Override
    public void print() {
        if (this.top == null) {
            System.out.println("Stack is empty!");
        } else {
            Node<E> tmp = top;
            while (tmp != null) {
                System.out.print(tmp.getData() + " ");
                tmp = tmp.getNext();
            }
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.numNode == 0)
            return true;
        return false;
    }

    @Override
    public E getPeek() {
        return this.top.getData();
    }
}