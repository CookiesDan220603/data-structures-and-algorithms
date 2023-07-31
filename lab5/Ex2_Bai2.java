import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;
public class Ex2_Bai2 {
    public static boolean check (int n){
        String str = String.valueOf(n);
        Stack<String> st1 = new Stack<String>();
        Queue<String> q1 = new LinkedList<>();
        for (int i =0 ; i <str.length();i++){
            st1.push(String.valueOf(str.charAt(i)));
            q1.offer(String.valueOf(str.charAt(i)));
        }
        while(!st1.isEmpty()){
            if(!st1.peek().equals(q1.peek())) return false;
            st1.pop();
            q1.poll();
        }
        return true;
    }

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        if(check(number)) {
            System.out.print("Is a palindrome");
        }
        else{
            System.out.print("Is not a palindrome");
        }

    
    }
}