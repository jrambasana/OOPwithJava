import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DemoFXEvent extends Application {
// Create hBox1 pane to have label
HBox hBox1 = new HBox(10);

@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // hBox1 setup
    hBox1.setPadding(new Insets(10,10,10,10));
    hBox1.getChildren().add(new Label("This is Demo Text."));

    // Create hBox2 pane to have alignment buttons
    HBox hBox2 = new HBox(10);
    hBox2.setPadding(new Insets(10,10,10,10));
    hBox2.setAlignment(Pos.CENTER);
    Button btnLeft = new Button("Align Left");
    Button btnRight = new Button("Align Right");
    hBox2.getChildren().addAll(btnLeft,btnRight);

    // Create and register the handler
    btnLeft.setOnAction(new AlignLeft());
    btnRight.setOnAction(new AlignRight());

    // Anonymous Inner Class Handlers
//    btnLeft.setOnAction(new EventHandler<ActionEvent>() {
//        @Override // Override the handle method
//        public void handle(ActionEvent e) {
//                hBox1.setAlignment(Pos.CENTER_LEFT);
//        }
//    });
//    btnRight.setOnAction(new EventHandler<ActionEvent>() {
//        @Override // Override the handle method
//        public void handle(ActionEvent e) {
//                hBox1.setAlignment(Pos.CENTER_RIGHT);
//        }
//    });

    // Lambda expressions
//    btnLeft.setOnAction(e -> { hBox1.setAlignment(Pos.CENTER_LEFT); });
//    btnRight.setOnAction(e -> { hBox1.setAlignment(Pos.CENTER_RIGHT); });

    // Create a border pane to have hBox1 and hBox2
    BorderPane pane = new BorderPane();
    // Place hBox1 and hBox2 in the pane
    pane.setCenter(hBox1);
    pane.setBottom(hBox2);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane,300,100);
    primaryStage.setTitle("Event Demo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
}

class AlignLeft implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
            hBox1.setAlignment(Pos.CENTER_LEFT);
    }
}

class AlignRight implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
            hBox1.setAlignment(Pos.CENTER_RIGHT);
    }
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