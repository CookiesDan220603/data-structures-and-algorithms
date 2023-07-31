import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Cau3 {
    private static boolean isNumber(String s){
        return s.matches("\\d+");
    }
    public static int calculate(String[] expression) {
        Queue<Integer> stack = new LinkedList<>();
        for (int i = 0;i<expression.length;i++){
            if(isNumber(expression[i])){
                stack.offer(Integer.parseInt(expression[i]));
            }
            else{
                int val1 = stack.poll();
                int val2 = stack.poll();
                String a = expression[i];
                switch(a){
                    case "+":
                        stack.offer(val1+val2);
                        break;
                    case "-":
                        stack.offer(val1-val2);
                        break;
                    case "*":
                        stack.offer(val2*val1);
                        break;
                    case "/":
                        stack.offer(val1/val2);
                        break;

                }

            }
        }
        return stack.poll();
    }

    public static void main(String args[]){
		System.out.println(calculate(new String[]{"31", "12", "-"}));
	}
}