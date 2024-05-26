import java.util.LinkedList;
import java.util.Queue;
public class MyGraph {

    private int V, E;
    LinkedList<Integer>[] adj;


    public MyGraph(int nodes){

        this.V = nodes;
        this.adj = new LinkedList[V];

        for(int i =0; i<V;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void printGraph(){

        for(int v = 0; v < V; v++){
            System.out.print("AdjList[" + v + "]: ");

            for(int w = 0;w < adj[v].size();w++){
                System.out.print(adj[v].get(w) + " ");
            }
            System.out.println();
        }

    }

}
