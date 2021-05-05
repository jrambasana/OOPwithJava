package JavFXLabPrograms;

/*
* Program - 19
* Write a program that displays the color 
* of a circle as red when the mouse button
* is pressed and as blue when the mouse button 
* is released.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Pract19 extends Application 
{
 @Override
     public void start(Stage primaryStage) 
     {
         Circle c = new Circle(200,200,50, Color.BLUE);
         StackPane pane = new StackPane(c);
         primaryStage.setScene(new Scene(pane, 600, 600));
         pane.setOnMousePressed(e -> c.setFill(Color.RED));
         pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
         primaryStage.setTitle("OOP-I Practical 19");
         primaryStage.show();
     }
    public static void main(String[] args) {
        Application.launch(args);

    }
}