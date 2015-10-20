import java.util.*;

public class UnweightedGraph<V> extends AbstractGraph<V> {
    /** Construct an empty graph */
    public UnweightedGraph() {
    }

    /** Construct a graph from vertices and edges stored in arrays */
    public UnweightedGraph(V[] vertices, int[][] edges) {

        super(vertices, edges);
    }

    /** Construct a graph from vertices and edges stored in List */
    public UnweightedGraph(List<V> vertices, List<Edge> edges) {

        super(vertices, edges);
    }
}
