import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DemoFXShapePolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane, a polygon, and place polygon to pane
		Pane pane = new Pane();
		
		Polygon triangle = new Polygon(100,50,150,150,50,150);
//		triangle.setFill(Color.WHITE);
//		triangle.setStroke(Color.BLACK);
		pane.getChildren().add(triangle);
		
//		Polygon polygon = new Polygon();
//		//Polyline polygon = new Polyline();
//		polygon.setFill(Color.WHITE);
//		polygon.setStroke(Color.BLACK);
//		pane.getChildren().add(polygon);
//		
//		ObservableList<Double> list = polygon.getPoints();
//		
//		final double WIDTH = 200, HEIGHT = 200;
//		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
//		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
//		
//		// Add points to the polygon list
//		for (int i = 0; i < 6; i++) {
//			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
//			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
//		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	* The launch method is a static method defined in 
	* the Application class for launching a stand-alone JavaFX application
	*/
	public static void main(String[] args) {
		Application.launch(args);
	}
}
