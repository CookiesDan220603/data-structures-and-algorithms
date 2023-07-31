import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex2{

    public static void printAL(int a[][], int n){
        System.out.println(n);
        for(int i = 0; i < n; i++){
            System.out.println();
        }
    }

    public static void main(String args[]){
        try{
            File myFile = new File("al.txt");
            Scanner sc = new Scanner(myFile);
            int n = sc.nextInt();
            sc.nextLine();
            AdjacencyList adj = new AdjacencyList(n);
            int c = 0;
            for(int i = 0; i < n; i++){
                String str = sc.nextLine();
                String vertices[] = str.split(" ");
                int u = Integer.valueOf(vertices[0]);
                for(int j = 1; j< vertices.length; j++){
                    adj.addEdge(u, Integer.valueOf(vertices[j]));
                    c++;
                }
            }
            // adj.printGraph();
            adj.DFS(0);
            adj.BFS(0);
            // System.out.println("The number of vertices: " + n);
            // System.out.println("The number of edges: " + c/2);
            sc.close();
        }catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}