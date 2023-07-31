import java.util.*;

public class Ex4 {
    public static boolean StackBT5(String a) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char a1 = a.charAt(i);
            if (a1 == '(' || a1 == '{' || a1 == '[') {
                stack.push(a1);
            } else {
                if (stack.isEmpty())
                    return false;
                char peek = stack.peek();
                if ((a1 == ')' && peek == '(') || ((a1 == '}' && peek == '{')) || ((a1 == ']' && peek == '['))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String a = "([])";
        if (StackBT5(a))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}