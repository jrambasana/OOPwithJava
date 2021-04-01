package javafxapplication01;

/*
* Program - 17
* Write a program that displays a tic-tac-toe board. 
* A cell may be X, O, or empty. What to display at each cell 
* is randomly decided. The X and O are images in the files X.gif and O.gif.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class GTU_Practical017 extends Application 
{
 @Override 
 public void start(Stage primaryStage) 
 {
  
  GridPane pane = new GridPane();
  
  for (int i = 0; i < 3; i++) 
  {
   for (int j = 0; j < 3; j++) 
   {
    int n = (int)(Math.random() * 3);
    if (n == 0)
     pane.add(new ImageView(new Image("images/x.gif")), j, i);
    else if (n == 1)
     pane.add(new ImageView(new Image("images/o.gif")), j, i);
    else
     continue;
   }
  }

  Scene scene = new Scene(pane, 120, 130);
  primaryStage.setTitle("Tic-Tac-Toe"); 
  primaryStage.setScene(scene); 
  primaryStage.show(); 
 }
public static void main(String[] args) {
    launch(args);
}
}
