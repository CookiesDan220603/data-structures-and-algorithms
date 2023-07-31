import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            File myFile = new File("graph2.txt");
            Scanner myReader = new Scanner(myFile);

            int size = Integer.parseInt(myReader.nextLine());

            AdjacencyList al = new AdjacencyList(size);

            String line;
            int i = 0;
            int numEdge = 0;

            while (myReader.hasNextLine()) {
                String[] val = null;
                line = myReader.nextLine();
                val = line.split(" ");

                numEdge += val.length - 1;

                for (String j : val) {
                    al.addEdge(i, Integer.parseInt(j));
                }
                i++;
            }

            System.out.println("Print the grapth: ");
            al.printGraph();

            System.out.println("Number of vertices: " + size);
            System.out.println("Number of edges: " + numEdge / 2);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a vertex: ");
            int vertex = sc.nextInt();

            System.out.print("Neighbour of vertex " + vertex + ": ");

            System.out.println();
            sc.close();
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
