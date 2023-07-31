public class Ex1{
    public static int factorial(int n){
        int p = 1;
        for(int i = 1; i<=n; i++) p*=i;
        return p;
    }

    public static int pow(int x, int n){
        int p = 1;
        for(int i = 1; i<=n; i++)
            p*=x;
        return p;
    }

    public static int countDigits(int n){
        int c = 0, t;
        while(n > 0){
            t = n%10;
            if(t > 0)
                c++;
            n/=10;
        }
        return c;
    }

    public static int GCD(int a, int b){
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        while(a%b != 0){
            a%=b;
            if(a < b){
                int t = a;
                a = b;
                b = t;
            }
        }
        return b;
    }

    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(pow(2, 10));
        System.out.println(countDigits(1208));
        System.out.println(GCD(5, 2));
    }
}