import java.util.*;

public class MyQueue implements QueueInterface {
    private ListNode head = null;
    private int num_nodes = 0;

    public boolean isEmpty() {
        return (num_nodes == 0);
    }

    public int size() {
        return num_nodes;
    }

    public Fraction getFirst() throws NoSuchElementException {
        if (head == null)
            throw new NoSuchElementException("can't get from an empty list");
        else
            return head.getElement();
    }

    public boolean contains(Fraction item) {
        for (ListNode n = head; n != null; n = n.getNext())
            if (n.getElement().equals(item))
                return true;
        return false;
    }

    public void addFirst(Fraction item) {
        head = new ListNode(item, head);
        num_nodes++;
    }

    public Fraction removeFirst() throws NoSuchElementException {
        ListNode ln;
        if (head == null)
            throw new NoSuchElementException("can't remove from empty list");
        else {
            ln = head;
            head = head.getNext();
            num_nodes--;
            return ln.getElement();
        }
    }

    public void addLast(Fraction item) {
        if (head == null) {
            addFirst(item);
        } else {
            ListNode tmp = head;
            while (tmp.getNext() != null) {
                tmp.getNext();
            }
            ListNode newNode = new ListNode(item, null);
            tmp.setNext(newNode);
            num_nodes++;
        }
    }

    public void print() {
        if (head != null) {
            ListNode tmp = head;
            System.out.print("List: " + tmp.getElement());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getElement());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }
}
