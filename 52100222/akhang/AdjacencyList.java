import java.util.LinkedList;

public class AdjacencyList {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[];
    private boolean visited[] = new boolean[V];
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
    public void dfs(int s){
        if (visited[s] != true){
            visited[s] = true;
            System.out.println(s+ " ");
            for(int x : adj[s]){
                dfs(x);
            }
        }
    }
}