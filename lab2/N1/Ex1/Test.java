import java.util.*;

public class Test {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        System.out.println("queue is empty? " + queue.isEmpty());
        queue.offer(new Fraction(3, 4));
        queue.offer(new Fraction(2, 4));

        queue.print();
        System.out.println("front now is: " + queue.poll());
        System.out.println("front now is: " + queue.poll());
        System.out.println("front now is: " + queue.poll());

        StackLL stack = new StackLL();
        System.out.println("stack is empty? " + stack.isEmpty());
        stack.push(new Fraction(3, 4));
        stack.push(new Fraction(2, 4));
        stack.print();
        System.out.println("top of stack is " + stack.peek());
        System.out.println("top of stack is " + stack.pop());
        System.out.println("top of stack is " + stack.pop());
        System.out.println("stack is empty? " + stack.isEmpty());

    }
}