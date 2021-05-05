package JavaFXLecturePrograms;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Sample01 extends Application 
{
public void start(Stage primaryStage) {
    Pane pane = new Pane();
    
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(50);
    circle.setCenterY(50);
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.RED);
    pane.getChildren().add(circle);    
    pane.getChildren().add(new Button("OK"));

// Create a scene and place it in the stage and show
    Scene scene = new Scene(pane, 300, 300);
    primaryStage.setTitle("ShowCircle");
    primaryStage.setScene(scene);
    primaryStage.show();
    // Set the stage title
    primaryStage.setTitle("Circle & Button in a pane");
    primaryStage.setScene(scene);
    primaryStage.show(); // Display the stage
}
 public static void main(String[] args) {
        launch(args);
    }
    
}

