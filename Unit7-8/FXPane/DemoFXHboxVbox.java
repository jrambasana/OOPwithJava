import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

public class DemoFXHboxVbox extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a border pane
		BorderPane pane = new BorderPane();
		// Place nodes in the pane
		pane.setTop(getHBox());
		pane.setBottom(getVBox());
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,200,150);
		primaryStage.setTitle("ShowHBoxVBox"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	private HBox getHBox() {
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(10,10,10,10));
		Rectangle[] r1 = {
				new Rectangle(10,10,20,20),
				new Rectangle(10,10,20,20),
				new Rectangle(10,10,20,20)
		};
		for(Rectangle r:r1) {
			r.setStyle("-fx-stroke: Blue; -fx-fill: Green;");
			hBox.getChildren().add(r);
		}
		return hBox;
	}
	private VBox getVBox() {
		VBox vBox = new VBox(5);
		vBox.setPadding(new Insets(10,10,10,10));
		Circle[] circles = { 
				new Circle(0,0,10),
				new Circle(0,0,10),
				new Circle(0,0,10)
		};
		for(Circle c:circles) {
			c.setStyle("-fx-stroke: Blue; -fx-fill: Red;");
			vBox.getChildren().add(c);
		}
		return vBox;
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
