import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex( V data){
        this.data=data;
        this.adjacentVertices= new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void addAdjacentVertice(Vertex <V> dest, double weight) {
        adjacentVertices.put(dest,weight);
    }

    public void addAdjacentVertice(Vertex<V> dest) {
        adjacentVertices.put(dest,1.0);
    }

    public Map<Vertex<V> , Double> getadjacentVertices() {
        return adjacentVertices;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(getData(), vertex.getData());
    }

}
