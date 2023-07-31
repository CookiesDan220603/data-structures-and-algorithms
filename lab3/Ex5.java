import java.util.Scanner;

public class Ex5{
    public static String convertToBaseOther(int n, int x){
        if(n == 0)
            return "";
        return convertToBaseOther(n/x, x) + String.valueOf(n%x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap co so: ");
        int x = sc.nextInt();
        System.out.println(convertToBaseOther(n, x));
    }
}