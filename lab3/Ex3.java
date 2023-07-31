public class Ex3 {
    public static boolean check_prime(int n, int d){
        if(n <=2){
            return true;
        }
        if(n%d==0){
            return false;
        }
        if (d*d > n){
            return true;
        }
        return check_prime(n, d + 1);
    }
    public static void main(String[] args) {
        System.out.println(check_prime(7, 2));
    }
}
