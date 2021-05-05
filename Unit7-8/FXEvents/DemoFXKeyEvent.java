import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoFXKeyEvent extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "A");
		pane.getChildren().add(text);
		
		text.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case DOWN: text.setY(text.getY() + 10); break;
				case UP: text.setY(text.getY() - 10); break;
				case LEFT: text.setX(text.getX() - 10); break;
				case RIGHT: text.setX(text.getX() + 10); break;
				case SHIFT: break;
				default:
					if (Character.isLetterOrDigit(e.getText().charAt(0)))
						text.setText(e.getText());
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("KeyEventDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		text.requestFocus(); // text is focused to receive key input
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
