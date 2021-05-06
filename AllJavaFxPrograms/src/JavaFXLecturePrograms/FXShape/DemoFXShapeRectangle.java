import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class DemoFXShapeRectangle extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a pane
    Pane pane = new Pane();
    // Create rectangles and add to pane
    Rectangle r1 = new Rectangle(25, 10, 60, 30);
    r1.setStroke(Color.RED);
    r1.setFill(Color.WHITE);
    pane.getChildren().add(new Text(10, 27, "r1"));
    pane.getChildren().add(r1);

    Rectangle r2 = new Rectangle(25, 50, 60, 30);
    pane.getChildren().add(new Text(10, 67, "r2"));
    r2.setStroke(Color.RED);
    r2.setFill(Color.YELLOW);
    pane.getChildren().add(r2);

    Rectangle r3 = new Rectangle(25, 90, 60, 30);
    r3.setArcWidth(15);
    r3.setArcHeight(25);
    pane.getChildren().add(new Text(10, 107, "r3"));
    pane.getChildren().add(r3);

    for (int i = 0; i < 4; i++) {
        Rectangle r = new Rectangle(100, 50, 100, 30);
        r.setRotate(i * 360 / 8);
        r.setStroke(Color.BLACK);
        r.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        pane.getChildren().add(r);
    }

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 150);
    primaryStage.setTitle("Show Rectangle"); // Set the stage title
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
