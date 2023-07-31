public class Ex4 {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }  
    public static int ex_a (int n){
        if(n==1){
            return 2*n +1;
        }
        else{
            return (2*n+1) + ex_a(n-1);
        }
    }
    public static int ex_b(int n){
        if(n==1){
            return 1;
        }
        else{
            return factorial(n)+ ex_b(n-1);
        }
    }
    public static int ex_c (int n){
        if(n==1){
            return 1;
        }
        else{
            return factorial(n)*ex_c(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Tong (2i + 1)");
        System.out.println(ex_a(5));
        System.out.println("Tong i!");
        System.out.println(ex_b(4));
        System.out.println("Tich i!");
        System.out.println(ex_c(3));
    }
}
