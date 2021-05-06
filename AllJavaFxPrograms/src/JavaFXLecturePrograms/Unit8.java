import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Unit8  extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
    // Create a border pane
    BorderPane pane = new BorderPane();

    // Creating header part
    VBox header = new VBox(5);
    header.setPadding(new Insets(10,10,10,10));
    pane.setTop(header); // add header in top section of borderpane

    Text txtHeader1 = new Text(0,0, "COVID-19 Scan Database");
    txtHeader1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 20));
    Text txtHeader2 = new Text(0,0, "Person Details");
    txtHeader2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 14));
    header.getChildren().addAll(txtHeader1,txtHeader2);

    // Creating form
    GridPane form = new GridPane();
    form.setPadding(new Insets(10, 10, 10, 10));
    form.setHgap(5);
    form.setVgap(5);
    pane.setLeft(form); // add form in left section of borderpane

    // Place all labels
    form.add(new Label("Name:"), 0, 0);
    form.add(new Label("Address:"), 0, 1);
    form.add(new Label("Gender:"), 0, 2);
    form.add(new Label("Age:"), 0, 3);
    form.add(new Label("Nationality:"), 0, 4);
    form.add(new Label("Travel History:"), 0, 5);
    form.add(new Label("Symptoms:"), 0, 6);

    // Place add and cancel button
    Button btnAdd = new Button("Add");//, new ImageView("file:testFolder/icon-add.png"));
    btnAdd.setGraphicTextGap(10);
    //btnAdd.setContentDisplay(ContentDisplay.RIGHT);
    Button btnCancel = new Button("Cancel");//, new ImageView("file:testFolder/icon-cancel.png"));
    btnCancel.setGraphicTextGap(10);
    form.add(btnAdd,0,7);
    form.add(btnCancel,1,7);
    form.setHalignment(btnCancel, HPos.RIGHT);

    // place checkbox for symptoms
    CheckBox chkFever = new CheckBox("Fever");
    CheckBox chkDryCough = new CheckBox("Dry Cough");
    CheckBox chkTiredness = new CheckBox("Tiredness");
    FlowPane symptoms = new FlowPane(5,5);
    symptoms.setPrefWrapLength(250);
    symptoms.getChildren().addAll(chkFever,chkDryCough,chkTiredness);
    form.add(symptoms,1,6);

    EventHandler<ActionEvent> handler = e -> {
        String str = "";
        if (chkFever.isSelected()) str += "Fever ";
        if (chkDryCough.isSelected()) str += "Dry Cough ";
        if (chkTiredness.isSelected()) str += "Tiredness ";
        System.out.println(str);
    };
    chkFever.setOnAction(handler);
    chkDryCough.setOnAction(handler);
    chkTiredness.setOnAction(handler);

    // place radio button for male and female
    RadioButton rbMale = new RadioButton("Male");
    rbMale.setSelected(true);
    RadioButton rbFemale = new RadioButton("Female");

    ToggleGroup rbGroup = new ToggleGroup();
    rbMale.setToggleGroup(rbGroup);
    rbFemale.setToggleGroup(rbGroup);

    FlowPane gender = new FlowPane(5,5);
    gender.setPrefWrapLength(250);
    gender.getChildren().addAll(rbMale,rbFemale);
    form.add(gender,1,2);

    rbMale.setOnAction(e -> {
        if (rbMale.isSelected()) {
                System.out.println("Gender: Male");
        }
    });
    rbFemale.setOnAction(e -> {
        if (rbFemale.isSelected()) {
                System.out.println("Gender: Female");
        }
    });

    // place text field for name
    TextField txtName = new TextField();
    //TextField txtName = new TextField("Jhon Doe");
    //txtName.setEditable(false);
    form.add(txtName, 1, 0);

    txtName.setOnAction(e -> { System.out.println(txtName.getText()); });

    // place textarea for address
    TextArea taAddress = new TextArea();
    //TextArea taAddress = new TextArea("This is a text area with default content.");
    taAddress.setPrefColumnCount(20);
    taAddress.setPrefRowCount(3);
    taAddress.setWrapText(true);
    // Create a scroll pane to hold text area
    ScrollPane spAddress = new ScrollPane(taAddress);
    form.add(spAddress, 1, 1);

    // place combobox for nationality
    ComboBox<String> nationality = new ComboBox<>();
    nationality.getItems().addAll("American", "Australian", "British", "Chinese", "Indian", "Nepalese");
    nationality.setValue("Indian");
    form.add(nationality, 1, 4);

    nationality.setOnAction(e -> { System.out.println(nationality.getValue()); });

    // place listview for travel history
    ListView<String> travelHistory = new ListView<>();
    travelHistory.getItems().addAll("America", "Australia", "China", "Nepal", "Dubai", "Canada");
    travelHistory.setPrefSize(250, 100);
    travelHistory.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    form.add(travelHistory, 1, 5);

    travelHistory.getSelectionModel().selectedItemProperty().addListener(ov -> {
    System.out.println(travelHistory.getSelectionModel().getSelectedIndices() + 
    "/" +travelHistory.getSelectionModel().getSelectedItems());
    });

    // place slider for age
    Slider ageSlider = new Slider();
    //ageSlider.setOrientation(Orientation.VERTICAL);
    ageSlider.setShowTickLabels(true);
    ageSlider.setShowTickMarks(true);
    ageSlider.setMin(1);
    ageSlider.setMax(100);
    ageSlider.setValue(20);
    Label ageLabel = new Label("Age: 20");
    FlowPane age = new FlowPane(20,5);
    age.setPrefWrapLength(250);
    age.getChildren().addAll(ageSlider,ageLabel);
    form.add(age, 1, 3);

    ageSlider.valueProperty().addListener(
        (obs,oldVal,newVal) -> {
        ageLabel.setText("Age: " + newVal.intValue());
    });

    // Creating info panel
    VBox info = new VBox(5);
    info.setPadding(new Insets(10,10,10,10));
    pane.setRight(info); // add infopane in right section of borderpane

    Text iTxtName = new Text(0,0, "Name:");
    Text iTxtAddress = new Text(0,0, "Address:");
    Text iTxtGender = new Text(0,0, "Gender:");
    Text iTxtAge = new Text(0,0, "Age:");
    Text iTxtNationality = new Text(0,0, "Nationality:");
    Text iTxtTravelHistory = new Text(0,0, "Travel History:");
    Text iTxtSymptoms = new Text(0,0, "Symptoms:");
    info.getChildren().addAll(iTxtName,iTxtAddress,iTxtGender,
        iTxtAge,iTxtNationality,iTxtTravelHistory,iTxtSymptoms);

    btnAdd.setOnAction(e -> {
        iTxtName.setText("Name: "+txtName.getText());
        iTxtAddress.setText("Address: "+taAddress.getText());
        String genderstr = "";
        if (rbMale.isSelected()) genderstr = "Gender: Male";
        if (rbFemale.isSelected()) genderstr = "Gender: Female";
        iTxtGender.setText(genderstr);
        iTxtAge.setText(ageLabel.getText());
        iTxtNationality.setText("Nationality: "+nationality.getValue());
        iTxtTravelHistory.setText("TravelHistory: "+travelHistory.getSelectionModel().getSelectedItems());
        String symptomsstr = "";
        if (chkFever.isSelected()) symptomsstr += "Fever ";
        if (chkDryCough.isSelected()) symptomsstr += "Dry Cough ";
        if (chkTiredness.isSelected()) symptomsstr += "Tiredness ";
        iTxtSymptoms.setText("Symptoms: "+symptomsstr);
    });

    btnCancel.setOnAction(e -> {
        txtName.setText("");
        taAddress.setText("");
        rbMale.setSelected(false);
        rbFemale.setSelected(false);
        ageSlider.setValue(20);//ageLabel
        nationality.setValue("Indian");
        travelHistory.getSelectionModel().clearSelection();
        chkFever.setSelected(false);
        chkDryCough.setSelected(false);
        chkTiredness.setSelected(false);
    });

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Unit 8 Program"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
}
/**
* The main method is only needed for the IDE with limited
* JavaFX support. Not needed for running from the command line.
* The launch method is a static method defined in 
* the Application class for launching a stand-alone JavaFX application
*/
public static void main(String[] args) {
    Application.launch(args);
}
}