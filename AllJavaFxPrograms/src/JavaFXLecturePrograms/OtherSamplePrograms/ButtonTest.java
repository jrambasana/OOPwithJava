package JavaFXLecturePrograms.OtherSamplePrograms;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
  
public class ButtonTest extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
          
        StackPane root = new StackPane();   
        Button btn=new Button("This is a button");  
        Scene scene=new Scene(root,300,300);  
        root.getChildren().add(btn);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Button Class Example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
}  
