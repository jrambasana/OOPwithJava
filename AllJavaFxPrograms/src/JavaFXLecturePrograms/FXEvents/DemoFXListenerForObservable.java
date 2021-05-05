import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoFXListenerForObservable extends Application {
@Override // Override the start method in the Application class 
public void start(Stage primaryStage) 
{
    // Create a pane to hold the circle
    Pane pane = new Pane();

    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setRadius(50);
    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));
    circle.setStyle("-fx-stroke: Blue; -fx-fill: Red;");

    Text text = new Text(10,30,"");

    pane.getChildren().addAll(circle,text);

    pane.widthProperty().addListener(new InvalidationListener() {
            public void invalidated(Observable ov) {
                    text.setText("("+pane.widthProperty().divide(2).doubleValue()+
                                    ","+pane.heightProperty().divide(2).doubleValue()+")");
            }
    });
    pane.heightProperty().addListener(new InvalidationListener() {
            public void invalidated(Observable ov) {
                    text.setText("("+pane.widthProperty().divide(2).doubleValue()+
                                    ","+pane.heightProperty().divide(2).doubleValue()+")");
            }
    });

    // Create a scene and place it in the stage and show
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("Show Circle");
    primaryStage.setScene(scene);
    primaryStage.show();
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
