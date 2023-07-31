import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex1{

    public static void printAM(int a[][], int n){
        System.out.println(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        try{
            File myFile = new File("am.txt");
            Scanner sc = new Scanner(myFile);
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j< n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            printAM(a, n);
            System.out.println("The number of vertices: " + n);
            // int c = 0;
            // for(int i = 0; i < n; i++){
            //     for(int j = i; j< n; j++){
            //         if(a[i][j] == 1) c++;
            //     }
            // }
            Boolean[][] b = new Boolean[n][n]; // initialize a boolean array
            for (int i = 0;i<n;i++){
                for(int j = 0;j < n;j++){
                    b[i][j]= false;
                }
            }
            int k = 0;
            for (int i = 0;i<n;i++){
                for(int j = 0;j < n;j++){
                    if (a[i][j]==1 && b[i][j]== false){
                        k ++;
                        b[i][j] = true;
                        b[j][i]= true;
                    }
                }
            }
            System.out.println(k);
        //     sc = new Scanner(System.in);
        //     System.out.print("Enter u: ");
        //     int u = sc.nextInt();
        //     System.out.println("Neighbors of " + u + " : ");
        //     for(int j = 0; j< n; j++){
        //         if(a[u][j] == 1) 
        //             System.out.print(j + " ");
        //     }
        //     System.out.println();
        //     System.out.print("Enter u: ");
        //     u = sc.nextInt();
        //     System.out.print("Enter v: ");
        //     int v = sc.nextInt();
        //     System.out.printf(((a[u - 1][v - 1] == 0)?"Not existence":"Existence") + " of edge (%d, %d)\n", u, v);
        }catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}