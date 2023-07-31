public class Ex2 {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }  
    public static int x_n(int x,int n){
        if (n==1){
            return x;
        }
        else{
            return x*x_n(x, n-1);
        }
    }
    public static int count_degit(int n){
        int count = 0;
        if(n==0){
            return 0;
        }
        else{
            return 1+ count_degit(n/10);
        }
    }
    public static boolean check_prime(int n,int i){
        if(n==i){
            return true;
        }
        else{
            if(n%i==0){
                return false;
            }
            else{
                return check_prime(n, i+1);
            }
        }
    }
   public static int findGCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return findGCD(num2, num1%num2);
   }
    public static void main(String[] args) {
        System.out.println("fine factorial");
        System.out.println(factorial(5));
        System.out.println("find X^n");
        System.out.println(x_n(5, 3));
        System.out.println("Find count of digits");
        System.out.println(count_degit(12345));
        System.out.println("check prime number");
        System.out.println(check_prime(7, 2));
        System.out.println("find GDC");
        System.out.println(findGCD(54,24));

    }
}
