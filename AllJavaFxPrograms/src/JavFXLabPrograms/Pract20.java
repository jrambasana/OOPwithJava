package JavFXLabPrograms;

/*
* Program - 20
* Write a GUI program that use button to move 
* the message to the left and right and use 
* the radio button to change the color for the message displayed.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Pract20 extends Application 
{
 protected Text text = new Text(50, 50, "MEFGI - Sem 6 EC1 Class");

 @Override 
 public void start(Stage primaryStage) 
 {
  BorderPane mainPane = new BorderPane();

  HBox paneForButtons = new HBox(20);
  Button btLeft = new Button("<= Move Left");
  Button btRight = new Button("=> Move Right");
  paneForButtons.getChildren().addAll(btLeft, btRight);
  paneForButtons.setAlignment(Pos.CENTER);

  HBox paneForRadioButtons = new HBox(20);
  RadioButton rbRed = new RadioButton("Red");
  RadioButton rbYellow = new RadioButton("Yellow");
  RadioButton rbBlack = new RadioButton("Black");
  RadioButton rbOrange = new RadioButton("Orange");
  RadioButton rbGreen = new RadioButton("Green");
  paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, 
   rbBlack, rbOrange, rbGreen);

  ToggleGroup group = new ToggleGroup();
  rbRed.setToggleGroup(group);
  rbYellow.setToggleGroup(group);
  rbBlack.setToggleGroup(group);
  rbOrange.setToggleGroup(group);
  rbGreen.setToggleGroup(group);

  Pane paneForText = new Pane();
  paneForText.setStyle("-fx-border-color: black");
  paneForText.getChildren().add(text);

  mainPane.setTop(paneForRadioButtons);
  mainPane.setCenter(paneForText);
  mainPane.setBottom(paneForButtons);

  btLeft.setOnAction(e -> text.setX(text.getX() - 10));
  btRight.setOnAction(e -> text.setX(text.getX() + 10));

  rbRed.setOnAction(e -> {
   if (rbRed.isSelected()) {
    text.setFill(Color.RED);
   }
  });

  rbYellow.setOnAction(e -> {
   if (rbYellow.isSelected()) {
    text.setFill(Color.YELLOW);
   }
  });

  rbBlack.setOnAction(e -> {
   if (rbBlack.isSelected()) {
    text.setFill(Color.BLACK);
   }
  });

  rbOrange.setOnAction(e -> {
   if (rbOrange.isSelected()) {
    text.setFill(Color.ORANGE);
   }
  });

  rbGreen.setOnAction(e -> {
   if (rbGreen.isSelected()) {
    text.setFill(Color.GREEN);
   }
  });
  
  Scene scene = new Scene(mainPane, 450, 150);
  primaryStage.setTitle("OOP-I Practical 20");
  primaryStage.setScene(scene);
  primaryStage.show();
 }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
}

