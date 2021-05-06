package JavaFXLecturePrograms.OtherSamplePrograms;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.RadioButton;  
import javafx.scene.control.ToggleGroup;  
import javafx.scene.layout.VBox;  
import javafx.stage.Stage;  
public class RadioButtonTest extends Application {  
  
      
public static void main(String[] args) {  
launch(args);     
}  
  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    ToggleGroup group = new ToggleGroup();  
    RadioButton button1 = new RadioButton("option 1");  
    RadioButton button2 = new RadioButton("option 2");  
    RadioButton button3 = new RadioButton("option 3");  
    RadioButton button4 = new RadioButton("option 4");  
    button1.setToggleGroup(group);  
    button2.setToggleGroup(group);  
    button3.setToggleGroup(group);  
    button4.setToggleGroup(group);  
    VBox root=new VBox();  
    root.setSpacing(10);  
    root.getChildren().addAll(button1,button2,button3,button4);  
    Scene scene=new Scene(root,400,300);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Radio Button Example");  
    primaryStage.show();  
}  
}  

