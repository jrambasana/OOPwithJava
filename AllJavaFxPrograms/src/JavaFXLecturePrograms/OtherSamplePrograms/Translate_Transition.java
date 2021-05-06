package JavaFXLecturePrograms.OtherSamplePrograms;

import javafx.animation.TranslateTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Translate_Transition extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        //Creating the circle   
        Circle cir = new Circle(50,100,50);  
          
        //setting color and stroke of the cirlce  
        cir.setFill(Color.RED);  
        cir.setStroke(Color.YELLOW);  
          
        //Instantiating TranslateTransition class   
        TranslateTransition translate = new TranslateTransition();  
          
        //shifting the X coordinate of the centre of the circle by 400   
        translate.setByX(400);  
          
        //setting the duration for the Translate transition   
        translate.setDuration(Duration.millis(1000));  
          
        //setting cycle count for the Translate transition   
        translate.setCycleCount(500);  
          
        //the transition will set to be auto reversed by setting this to true   
        translate.setAutoReverse(false);  
          
        //setting Circle as the node onto which the transition will be applied  
        translate.setNode(cir);  
          
        //playing the transition   
        translate.play();  
          
        //Configuring Group and Scene   
        Group root = new Group();  
        root.getChildren().addAll(cir);  
        Scene scene = new Scene(root,500,200,Color.WHEAT);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Translate Transition example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}  
      
