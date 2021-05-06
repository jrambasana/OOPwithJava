package JavaFXLecturePrograms.OtherSamplePrograms;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Slider;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
public class SliderTest extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Slider slider = new Slider(1,100,20);  
        StackPane root = new StackPane();  
        root.getChildren().add(slider);  
        Scene scene = new Scene(root,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Slider Example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);     
        }  
  
}  
