import java.util.*;
public class Ex6 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        LinkedList<String> queue = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            String a = input.substring(i, i + 1);
            stack.push(a);
            queue.offer(a);
        }
        boolean temp = true;
        while (!stack.isEmpty() && temp) {
            if (!(stack.pop().equals(queue.poll())))
                temp = false;
        }
        if(temp==true)
            System.out.println("A palindrome");
        else
            System.out.println("NOT a palindrome");
    }
}