import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DemoFXFlowPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a pane and set its properties
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setOrientation(Orientation.VERTICAL);
		pane.setAlignment(Pos.TOP_RIGHT);
		
		// Place nodes in the pane
		pane.getChildren().addAll(
				new Label("First Name:"),
				new TextField(), 
				new Label("MI:"), 
				new TextField(), 
				new Label("Last Name:"),
				new TextField());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 700, 200);
		primaryStage.setTitle("ShowFlowPane"); // Set the stage title
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
