import javafx.application.Application;
import javafx.animation.PathTransition;  
import javafx.animation.PathTransition.OrientationType;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.CubicCurveTo;  
import javafx.scene.shape.MoveTo;  
import javafx.scene.shape.Path;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Path_Transition extends Application{  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    //Creating Polygon   
    Polygon poly = new Polygon();   
    poly.getPoints().addAll(new Double[] {320.0,270.0,270.0,220.0,270.0,270.0,320.0,120.0,370.0,270.0,370.0,220.0});  
      
    //Setting Colour and Stroke properties for the polygon    
    poly.setFill(Color.LIMEGREEN);  
    poly.setStroke(Color.BLACK);  
  
    //Setting up the path   
    Path path = new Path();  
    path.getElements().add (new MoveTo (150f, 70f));  
    path.getElements().add (new CubicCurveTo (240f, 230f, 500f, 340f, 600, 50f));  
      
    //Instantiating PathTransition class   
    PathTransition pathTransition = new PathTransition();  
     
    //Setting duration for the PathTransition  
    pathTransition.setDuration(Duration.millis(1000));  
      
    //Setting Node on which the path transition will be applied   
    pathTransition.setNode(poly);  
      
    //setting path for the path transition   
    pathTransition.setPath(path);  
      
    //setting orientation for the path transition   
    pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);  
      
    //setting up the cycle count   
    pathTransition.setCycleCount(10);  
      
    //setting auto reverse to be true   
    pathTransition.setAutoReverse(true);  
  
    //Playing path transition   
    pathTransition.play();  
      
    //Configuring group and scene   
    Group root = new Group();  
    root.getChildren().addAll(poly);  
    Scene scene = new Scene(root,700,350,Color.WHEAT);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Path Transition Example");  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
}  
  
}  