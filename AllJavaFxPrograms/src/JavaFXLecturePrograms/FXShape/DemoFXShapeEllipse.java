import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class DemoFXShapeEllipse extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a pane
    Pane pane = new Pane();

    // Create an ellipse and add it to pane
    Ellipse e = new Ellipse(150, 100, 100, 50);
    e.setStroke(Color.BLACK);
    e.setFill(Color.WHITE);
    pane.getChildren().add(e);

    for (int i = 0; i < 16; i++) {
            // Create an ellipse and add it to pane
            Ellipse e1 = new Ellipse(150, 100, 100, 50);
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e1.setFill(Color.WHITE);
            e1.setRotate(i * 180 / 16);
            pane.getChildren().add(e1);
    }

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 200);
    primaryStage.setTitle("Show Ellipse"); // Set the stage title
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
