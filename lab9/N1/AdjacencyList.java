import java.util.*;

public class AdjacencyList{
    private int V;
    private ArrayList<LinkedList<Integer>> adj;

    public AdjacencyList(int v){
        V = v;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i < v; ++i)
            adj.add(new LinkedList <Integer >());
        }

    public void addEdge(int u, int v)
    {
        adj.get(u).add(v);
    }

    public void printGraph(){
        for(int i = 0; i < V; i++){
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for(Integer v: adj.get(i)){
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }

    public void neighbors(int u){
        for(Integer v: adj.get(u)){
            System.out.print(" " + v);
        }
        System.out.println();
    }

    public boolean search(int u, int v){
        for(Integer x: adj.get(u)){
            if(x == v) return true;
        }
        return false;
    }

    public void DFS(int i) {
    }

    public void BFS(int i) {
    }
}