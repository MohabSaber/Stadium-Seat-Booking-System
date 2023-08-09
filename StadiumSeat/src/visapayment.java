/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;





public class visapayment extends Application {
    int counter=0;
    @Override
       
    public void start(Stage primaryStage2) {

GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(10);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));


Scene scene = new Scene (grid,400,300);
primaryStage2.setTitle("Payment");
primaryStage2.setScene(scene);
primaryStage2.show();
        
        Text scenetitle = new Text("Visa Payment");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,21));

grid.add(scenetitle,0,0,2,1);

Label label1 = new Label ("Enter your Visa card number : ");
TextField textfield = new TextField();
grid.add(label1, 0, 1);
grid.add(textfield, 1, 1);
label1.setFont(new Font("Times New Roman", 15));

Label label2 = new Label ("Pin : ");
PasswordField field1 = new PasswordField();
grid.add(label2, 0, 2);
grid.add(field1, 1, 2);
label2.setFont(new Font("Times New Roman", 15));
    
Button btn1 = new Button("Pay ");
grid.add(btn1, 0, 3);
Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("Payment");
alert.setHeaderText("Payment is completed Successfuly");

Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
alert1.setTitle("xxx");
alert1.setHeaderText("Data not entered");

TextField textfield1 = new TextField();
textfield1.setText("0");
    Label label5 = new Label ();

btn1.setOnAction(e -> {
    
    
        if(textfield.getText().isEmpty() || field1.getText().isEmpty()){
      alert1.show();
    }
    else{
    alert.show();
    }  
    
    
if(e.getSource()==btn1){
    counter++;
     label5.setText(Integer.toString(counter));
}

try{
  FileWriter Writer = new FileWriter("counter.txt",true);
  Writer.write(label5.getText());
  Writer.close();

}
catch(IOException f )
{
    f.printStackTrace();
}


});
    
 grid.add(label5, 0, 4);
 
 Button btn01 = new Button("Menu ");
grid.add(btn01, 0, 5);
Mainmenu m1 = new Mainmenu();
 btn01.setOnAction(e ->m1.start(primaryStage2));

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
