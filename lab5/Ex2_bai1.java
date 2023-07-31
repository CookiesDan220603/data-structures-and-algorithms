import java.util.*;
public class Ex2_bai1 {
    public static int evaluatePostfix(String exp){
            //create a stack
            Stack<Integer> stack = new Stack<>();
             
            // Scan all characters one by one
            for(int i = 0; i < exp.length(); i++)
            {
                char c = exp.charAt(i);
                 
                if(c == ' ')
                continue;
                 
                // If the scanned character is an operand
                // (number here),extract the number
                // Push it to the stack.
                else if(Character.isDigit(c))
                {
                    int n = 0;
                     
                    //extract the characters and store it in num
                    while(Character.isDigit(c))
                    {
                        n = n*10 + (int)(c-'0');
                        i++;
                        c = exp.charAt(i);
                    }
                    i--;
     
                    //push the number in stack
                    stack.push(n);
                }
                 
                // If the scanned character is an operator, pop two
                // elements from stack apply the operator
                else
                {
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                     
                    switch(c)
                    {
                        case '+':
                        stack.push(val2+val1);
                        break;
                         
                        case '-':
                        stack.push(val2- val1);
                        break;
                         
                        case '/':
                        stack.push(val2/val1);
                        break;
                         
                        case '*':
                        stack.push(val2*val1);
                        break;
                }
                }
            }
            return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(evaluatePostfix("100 200 + 2 / 5 * 7 +"));
    }
    
}
