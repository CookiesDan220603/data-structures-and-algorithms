import java.util.LinkedList;
import java.util.*;
public class AdjacencyList {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[];
    public Queue<Integer> queues = new LinkedList<>();
    public StringBuffer str = new StringBuffer();
    public AdjacencyList(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }
    

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex: " + i + ": ");
            System.out.print("head");
            for (Integer v : adj[i]) {
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }
    public void DFS_helper(int s, boolean visited[]){
         // current node is visited 
         visited[s] = true; 
         System.out.print(s+" "); 
    
         // process all adjacent vertices 
         Iterator<Integer> i = adj[s].listIterator(); 
         while (i.hasNext()) 
         { 
             int n = i.next(); 
             if (!visited[n]) 
                 DFS_helper(n, visited); 
         } 
    }
    public void DFS(int k) { 
        //initially none of the vertices are visited 
        boolean visited[] = new boolean[V]; 
   
        // call recursive DFS_helper function for DFS technique 
        DFS_helper(k, visited); 
    }
    public void BFS(int s){
        int free[] = new int[V];
        Arrays.fill(free, 0);
        queues.add(s);
        while(queues.isEmpty() != true){
            int f = (int)queues.poll();
            if(free[f] == 0){
                free[f] = 1;
                System.out.print(f + " ");
                Iterator<Integer> i = adj[f].listIterator(); 
                while (i.hasNext()) 
                { 
                    int n = i.next(); 
                    if(free[n]==1)
                        continue;
                    queues.add(n);
                }
            }
            // for (int v : adj[f]) {
            //     if(free[v] != 1)
            //         queues.add(v);
            // }

        }

    }
}