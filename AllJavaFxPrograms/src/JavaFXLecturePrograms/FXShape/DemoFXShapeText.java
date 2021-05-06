import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoFXShapeText extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a pane to hold the texts
    Pane pane = new Pane();
    pane.setPadding(new Insets(5, 5, 5, 5));

    Text text1 = new Text(40, 40, "Programming is fun");
    text1.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 55));

    Text text2 = new Text( 60, 60, "Programming is fun\nDisplay text");

    Text text3 = new Text(10, 100, "Programming is fun\nDisplay text");
    text3.setFill(Color.RED);
    text2.setUnderline(true);
    text3.setStrikethrough(true);

    pane.getChildren().addAll(text1,text2,text3);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Show Text"); // Set the stage title
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
