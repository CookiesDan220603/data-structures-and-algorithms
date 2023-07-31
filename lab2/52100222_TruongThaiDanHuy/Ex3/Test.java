import java.util.*;
public class Test {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        String a = "A man, a plan, a canal: Panama";
        System.out.println("Chuoi ban dau: " + a);
        for (int i = 0; i < a.length(); i++) {
            String h = a.substring(0 + i, 1 + i);
            stack.push(h);
        }
        System.out.print("Chuoi sau khi dao nguoc: ");
        for (int i = 0; i < a.length(); i++) {
            String h = a.substring(0 + i, 1 + i);
            System.out.print(stack.pop());
        }
    }
}