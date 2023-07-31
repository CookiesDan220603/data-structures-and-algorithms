import java.util.*;
public class Queue {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public void enQueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    public int deQueue() {
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
        }

        int x = s1.peek();
        s1.pop();
        return x;
    }
}