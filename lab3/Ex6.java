import java.util.Scanner;

public class Ex6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter arr:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int min = arr[0], sum = 0, c = 0;
        for(int x: arr){
            if(x < min) 
                min = x;
            sum += x;
            if(x%2 == 0) 
                c++;
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Sum of array: " + sum);
        System.out.println("c) " + c);
    }
}