package JavaFXLecturePrograms.OtherSamplePrograms;
import javafx.animation.RotateTransition;  
import javafx.application.Application;  
import javafx.geometry.Point3D;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Rotate_Transition extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
      
        //Creating Rectangle   
        Rectangle rect = new Rectangle(200,100,200,200);  
        rect.setFill(Color.YELLOW);  
        rect.setStroke(Color.BLUE);  
        rect.setStrokeWidth(10);  
          
        //Instantiating RotateTransition class   
        RotateTransition rotate = new RotateTransition();  
          
        //Setting Axis of rotation   
        rotate.setAxis(Rotate.Z_AXIS);  
          
        // setting the angle of rotation   
        rotate.setByAngle(360);  
          
        //setting cycle count of the rotation   
        rotate.setCycleCount(5);  
          
        //Setting duration of the transition   
        rotate.setDuration(Duration.millis(1000));  
          
        //the transition will be auto reversed by setting this to true   
        rotate.setAutoReverse(false);  
              
        //setting Rectangle as the node onto which the   
// transition will be applied  
        rotate.setNode(rect);  
          
        //playing the transition   
        rotate.play();  
          
        //Configuring Group and Scene   
        Group root = new Group();  
        root.getChildren().add(rect);  
        Scene scene = new Scene(root,600,400,Color.BLACK);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Rotate Transition example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}  
