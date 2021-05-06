import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

public class DemoFXPathFadeTransition extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a pane
    Pane pane = new Pane();

    // Create a rectangle
    Rectangle rectangle = new Rectangle (0, 0, 25, 50);
    rectangle.setFill(Color.GREEN);

    // Create a circle path
    Circle circle = new Circle(125, 125, 50);
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
//    Rectangle circle = new Rectangle (50, 50, 100, 150);
//    rectangle.setFill(Color.WHITE);
//    rectangle.setStroke(Color.BLACK);
    
    // Add circle and rectangle to the pane
    pane.getChildren().add(circle);
    pane.getChildren().add(rectangle);

    // Create a path transition
    PathTransition pt = new PathTransition();
    pt.setDuration(Duration.millis(4000));
    pt.setPath(circle);
    pt.setNode(rectangle);
    pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    pt.setAutoReverse(false);
    pt.setCycleCount(Timeline.INDEFINITE);
    pt.setRate(5);
    pt.play(); // Start animation

    circle.setOnMousePressed(e -> pt.pause());
    circle.setOnMouseReleased(e -> pt.play());

    // Apply a fade transition to rectangle
//    FadeTransition ft = new FadeTransition(Duration.millis(2000), rectangle);
//    ft.setFromValue(1.0);
//    ft.setToValue(0.1);
//    ft.setCycleCount(Timeline.INDEFINITE);
//    ft.setAutoReverse(true);
//    ft.play(); // Start animation

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("Path Transition Demo"); // Set the stage title
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
