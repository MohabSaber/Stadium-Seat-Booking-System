/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;



public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(20);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));

Scene scene = new Scene (grid,300,300);
primaryStage.setTitle("LOGINForm");
primaryStage.setScene(scene);
primaryStage.show();
        
        Text scenetitle = new Text("Welcome");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,19));

grid.add(scenetitle,0,0,2,1);

Label label1 = new Label ("Username : ");
TextField textfield = new TextField();
grid.add(label1, 0, 1);
grid.add(textfield, 1, 1);

Label label2 = new Label ("Password : ");
PasswordField field1 = new PasswordField();
grid.add(label2, 0, 2);
grid.add(field1, 1, 2);

Button btn1 = new Button("Log in ");
grid.add(btn1, 0, 3);



Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("xxxx");
alert.setHeaderText("Data not entered");
Admin a1 = new Admin();
Mainmenu m1 = new Mainmenu();
btn1.setOnAction(e -> {
        if(textfield.getText().equals("admin") && field1.getText().equals("admin1")){
        a1.start(primaryStage);
        }
        else if(textfield.getText().equals("user") && field1.getText().equals("user11")){
            m1.start(primaryStage);
        }
        else{
            alert.show();
        }
});



Button btn2 = new Button("Sign up ");
grid.add(btn2, 1, 3);
Signup s1 = new Signup();
btn2.setOnAction(e ->s1.start(primaryStage));






        



    }


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
