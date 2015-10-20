import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayUSMap extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        City[] vertices = {new City(0, "Seattle", 75, 50),
                new City(1, "San Francisco", 50, 210),
                new City(2, "Los Angeles", 75, 275),
                new City(3, "Denver", 275, 175),
                new City(4, "Kansas City", 400, 245),
                new City(5, "Chicago", 450, 100),
                new City(6, "Boston", 700, 80),
                new City(7, "New York", 675, 120),
                new City(8, "Atlanta", 575, 295),
                new City(9, "Miami", 600, 400),
                new City(10, "Dallas", 408, 325),
                new City(11, "Houston", 450, 360) };

        // Edge array for graph in Figure 28.1
        int[][] edges = {
                {0, 1}, {0, 3}, {0, 5}, {1, 0}, {1, 2}, {1, 3},
                {2, 1}, {2, 3}, {2, 4}, {2, 10},
                {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
                {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
                {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
                {6, 5}, {6, 7}, {7, 4}, {7, 5}, {7, 6}, {7, 8},
                {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
                {9, 8}, {9, 11}, {10, 2}, {10, 4}, {10, 8}, {10, 11},
                {11, 8}, {11, 9}, {11, 10}
        };

        Graph<City> graph = new UnweightedGraph<>(vertices, edges);

        // Create a scene and place it in the stage
        Scene scene = new Scene(new GraphView(graph), 750, 450);
        primaryStage.setTitle("DisplayUSMap"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

