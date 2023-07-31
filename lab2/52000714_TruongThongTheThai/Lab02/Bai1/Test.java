import java.util.*;

public class Test {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        System.out.println("stack is empty? " + stack.isEmpty());
        stack.push(new Fraction(3, 4));
        stack.push(new Fraction(5, 4));
        System.out.println("top of stack is " + stack.peek());
        System.out.println("top of stack is " + stack.pop());
        stack.push(new Fraction(9, 4));
        System.out.println("top of stack is " + stack.pop());
        System.out.println("stack is empty? " + stack.isEmpty());
        stack.print();
    }
}