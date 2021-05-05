import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoFXMouseEvent extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a border pane
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(30,30,10,30));
		
		Pane textPane1 = new Pane();
		Text text1 = new Text("Click anywhere in the pane or drag this text.");
		textPane1.getChildren().add(text1);
		
		Pane textPane2 = new Pane();
		Text text2 = new Text(10,10,"");
		Text text3 = new Text(10,30,"");
		textPane2.getChildren().addAll(text2,text3);

		textPane1.setOnMouseClicked(e -> {
			text2.setText("pane("+e.getX()+","+e.getY()+"), "
					+ "scene("+e.getSceneX()+","+e.getSceneY()+"), "
					+ "screen("+e.getScreenX()+","+e.getScreenY()+")");
			
			if(e.getButton() == MouseButton.PRIMARY)
				text3.setText("Left button was pressed");
			else if(e.getButton() == MouseButton.SECONDARY)
				text3.setText("Right button was pressed");
			else if(e.getButton() == MouseButton.MIDDLE)
				text3.setText("Middle button was pressed");
		});
		
		text1.setOnMouseDragged(e -> {
			text1.setX(e.getX());
			text1.setY(e.getY());
		});
		
		// Place nodes in the pane
		pane.setCenter(textPane1);
		pane.setBottom(textPane2);
			
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,600,400);
		primaryStage.setTitle("Mouse Event Demo"); // Set the stage title
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
