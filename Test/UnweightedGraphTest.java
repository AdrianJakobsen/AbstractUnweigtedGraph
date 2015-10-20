import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnweightedGraphTest {
    City[] vertices = {new City(0, "Seattle", 75, 50),
            new City(1, "San Francisco", 50, 210),
            new City(2, "Los Angeles", 75, 275),
            new City(3, "New York", 75, 275)
    };

    int[][] edges = {
            {0, 1}, {0, 2},
            {1, 0}, {1, 3},
            {2, 0}, {2, 1},
            {3, 1}
    };

    Graph<City> graph = new UnweightedGraph<>(vertices, edges);

    @Test
    public void dfs(){
        AbstractGraph<City>.Tree dfs = graph.dfs(0);

        int numberOfVerticesFound = dfs.getNumberOfVerticesFound();

        assertEquals(4, numberOfVerticesFound);
        List<Integer> searchOrder = dfs.getSearchOrder();
        assertEquals(0, (int)searchOrder.get(0));
        assertEquals(2, (int)searchOrder.get(3));

    }

    @Test
    public void anotherdfsTest() {
        AbstractGraph<City>.Tree dfs = graph.dfs(1);
        int numberOfVerticesFound = dfs.getNumberOfVerticesFound();

        assertEquals(4, numberOfVerticesFound);
        List<Integer> searchOrder = dfs.getSearchOrder();
        assertEquals(1, (int)searchOrder.get(0));
        assertEquals(3, (int)searchOrder.get(3));
    }
}