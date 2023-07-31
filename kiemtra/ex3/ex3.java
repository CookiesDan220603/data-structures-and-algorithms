import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try {
            File myFile = new File("am.txt");
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
            System.out.println("DFS");
            adj.DFS(0);
            System.out.println();
            System.out.println("BFS");
            adj.BFS(0);
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}