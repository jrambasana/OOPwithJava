/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ADMIN
 */
public class JavaFXApplication01 extends Application {
    
//    @Override
//    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

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
