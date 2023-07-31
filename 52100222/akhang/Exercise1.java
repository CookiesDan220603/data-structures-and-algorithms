import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            File myFile = new File("graph1.txt");
            Scanner myReader = new Scanner(myFile);

            int size = Integer.parseInt(myReader.nextLine());

            AdjacencyMatrix adj = new AdjacencyMatrix(size);

            String line;
            int i = 0;
            int numEdges = 0;

            while (myReader.hasNextLine()) {
                String[] val = null;
                line = myReader.nextLine();
                val = line.split(" ");

                for (int j = 0; j < val.length; j++) {
                    adj.setEgde(i, j, Integer.parseInt(val[j]));

                    if (adj.getEgde(i, j) == 1) {
                        numEdges++;
                    }
                }
                i++;
            }

            Scanner sc = new Scanner(System.in);

            System.out.println("Print the graph: ");
            adj.printGraph();
            System.out.println();
            System.out.println("Number of vertices: " + size);
            System.out.println("Number of edges: " + numEdges / 2);

            System.out.print("Enter a vertex: ");
            int vertex = sc.nextInt();

            System.out.print("Neighbour of vertex " + vertex + ": ");

            for (int j = 0; j < size; j++) {
                if (adj.getEgde(vertex - 1, j) == 1) {
                    System.out.print(j + 1 + " ");
                }
            }
            System.out.println();

            System.out.print("Input u: ");
            int u = sc.nextInt();

            System.out.print("Input v: ");
            int v = sc.nextInt();

            if (adj.getEgde(u, v) == 1) {
                System.out.println("Existence");
            } else {
                System.out.println("No Existence");
            }

            myReader.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}