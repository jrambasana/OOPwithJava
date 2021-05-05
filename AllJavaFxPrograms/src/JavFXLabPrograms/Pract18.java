package JavFXLabPrograms;

/*
* Program - 18
* Write a program that moves a circle 
* up, down, left or right using arrow keys.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Pract18 extends Application 
{
 @Override 
 public void start(Stage primaryStage) {
  Pane pane = new Pane();
  pane.setPadding(new Insets(30, 30, 30, 30));
  Circle circle = new Circle(50, 50, 30);
  
  pane.getChildren().add(circle);

  pane.setOnKeyPressed(e -> {
   switch (e.getCode()) {
    case UP : circle.setCenterY(circle.getCenterY() > 
     circle.getRadius() ? circle.getCenterY() - 15 :
     circle.getCenterY()); break;
    case DOWN : circle.setCenterY(circle.getCenterY() < 
     pane.getHeight() - circle.getRadius() ? 
     circle.getCenterY() + 15 : circle.getCenterY()); 
     break;
    case LEFT : circle.setCenterX(circle.getCenterX() >
     circle.getRadius() ? circle.getCenterX() - 15 :
     circle.getCenterX()); break;
    case RIGHT : circle.setCenterX(circle.getCenterX() <
     pane.getWidth() - circle.getRadius() ?
     circle.getCenterX() + 15: circle.getCenterX());
   }
  });

  Scene scene = new Scene(pane, 200, 200);
  primaryStage.setTitle("OOP-I Practical 18"); 
  primaryStage.setScene(scene); 
  primaryStage.show(); 
  pane.requestFocus();
 }
 public static void main(String[] args) {
        launch(args);
    }
    
}

