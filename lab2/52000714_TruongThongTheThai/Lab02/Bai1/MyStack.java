import java.util.*;

public class MyStack implements StackInterface {
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

    public void print() {
        if (head != null) {
            ListNode temp = head;
            System.out.print("List: " + temp.getElement());
            temp = temp.getNext();
            while (temp != null) {
                System.out.print(" -> " + temp.getElement());
                temp = temp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }
}
