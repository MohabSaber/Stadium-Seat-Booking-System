/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author felfe
 */
public class Signup extends Application {
    
    @Override
    public void start(Stage primaryStage1) {

        GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(10,10,10,10));

Scene scene2 = new Scene (grid,400,400);
primaryStage1.setTitle("Sign up Form");
primaryStage1.setScene(scene2);
primaryStage1.show();

Text scenetitle = new Text("Sign up");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,19));

grid.add(scenetitle,0,0,2,1);




Label label1 = new Label ("Firstname : ");
TextField textfield = new TextField();
grid.add(label1, 0, 1);
grid.add(textfield, 1, 1);

Label label2 = new Label ("Lastname : ");
TextField textfield1 = new TextField();
grid.add(label2, 0, 2);
grid.add(textfield1, 1, 2);

Label label3 = new Label ("Username : ");
TextField textfield2 = new TextField();
grid.add(label3, 0, 3);
grid.add(textfield2, 1, 3);

Label label5 = new Label ("Email : ");
TextField textfield3 = new TextField();
grid.add(label5, 0, 4);
grid.add(textfield3, 1, 4);

Label label4 = new Label ("Password : ");
PasswordField textfield4 = new PasswordField();
grid.add(label4, 0, 5);
grid.add(textfield4, 1, 5);


Button btn2 = new Button("Sign up ");
grid.add(btn2, 1, 6);

Button btn3 = new Button("Save your Info ");
grid.add(btn3, 2, 6);


btn3.setOnAction(s -> {
try{
  BufferedWriter Writer = new BufferedWriter(new FileWriter("addedInfo.txt",true));
  Writer.write(textfield.getText());
  
  Writer.write(textfield1.getText());
  
  Writer.write(textfield2.getText());
  
  Writer.write(textfield3.getText());

  Writer.write(textfield4.getText());
  Writer.close();

}
catch(IOException e )
{
    e.printStackTrace();
}

});




Mainmenu m1 = new Mainmenu();
Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("xxx");
alert.setHeaderText("Data not entered");
btn2.setOnAction(s -> {
if(!textfield.getText().isEmpty() && !textfield1.getText().isEmpty() && !textfield2.getText().isEmpty() && !textfield3.getText().isEmpty() && !textfield4.getText().isEmpty()){
m1.start(primaryStage1);
}
else{
     alert.show();
        }

    
    
});


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    

    
}
