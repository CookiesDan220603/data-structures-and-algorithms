import java.util.*;

public class Bai3 {
    public static int sum(Stack<Integer> stack, int n) {
        int s = 0;
        if (n == 1) {
            return 3;
        } else {
            stack.push(3);
            for (int i = 2; i <= n; i++) {
                s = s + (int) Math.pow(2, i) + (int) Math.pow(i, 2) + stack.peek();
                stack.push(s);
                s = 0;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum: 2^n + n^2 + P(n-1)");
        System.out.print("input: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + sum(stack, n));
    }
}