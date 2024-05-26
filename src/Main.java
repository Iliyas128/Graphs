import java.util.LinkedList;
import java.util.Queue;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        MyGraph g = new MyGraph(8);

        g.addEdge(0, 1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(1,5);
        g.addEdge(1,6);
        g.addEdge(2,7);

        g.printGraph();
    }


}