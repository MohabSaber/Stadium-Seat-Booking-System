/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;




/**
 *
 * @author felfe
 */
public class BookTicket extends Application {
    
 @Override
    public void start(Stage primaryStage){
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(20);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));

Scene scene = new Scene (grid,600,700);
primaryStage.setTitle("TicketBooking");
primaryStage.setScene(scene);
primaryStage.show();

Text scenetitle = new Text("Ticket Booking");
scenetitle.setFont(Font.font("Verdana Pro Semibold",FontWeight.NORMAL,19));
grid.add(scenetitle,0,0,2,1);

    Label label1 = new Label ("Choose a match ");
grid.add(label1, 0, 1);
label1.setFont(new Font("Times New Roman", 20));


final ToggleGroup group = new ToggleGroup(); 


RadioButton rb1 = new RadioButton ("1- FC Barcelona VS Real Madrid on Saturday at 10:00 PM");
rb1.setToggleGroup(group); 
RadioButton rb2 = new RadioButton ("2- Manchester City VS Manchester United on Sunday at 9:00 PM ");
rb2.setToggleGroup(group); 
RadioButton rb3 = new RadioButton ("3- Arsenal VS Chelsea on Monday at 8:00 PM ");
rb3.setToggleGroup(group); 

grid.add(rb1, 0, 2);
grid.add(rb2, 0, 3);
grid.add(rb3, 0, 4);



ComboBox <String> x = new ComboBox<>();
x.getItems().addAll("one" , "Two","Three");
x.setOnAction((event) -> {
        String selected = x.getValue();
    });


Label label5 = new Label ("Tickets : ");
label5.setFont(new Font("Times New Roman", 20));
grid.add(label5, 0, 5);
grid.add(x, 0, 6);

    Label label3 = new Label ("Categories : ");
grid.add(label3, 0, 7);
label3.setFont(new Font("Times New Roman", 20));
final ToggleGroup group1 = new ToggleGroup(); 
RadioButton rb4 = new RadioButton ("Platinum");
rb4.setToggleGroup(group1); 
RadioButton rb5 = new RadioButton ("Gold");
rb5.setToggleGroup(group1); 
RadioButton rb6 = new RadioButton ("Silver");
rb6.setToggleGroup(group1); 

grid.add(rb4, 0, 8);
grid.add(rb5, 0, 9);
grid.add(rb6, 0, 10);

   
 
Button book = new Button("Book ");
grid.add(book, 0, 11);
book.setOnAction(e -> {
    RadioButton match = (RadioButton) group.getSelectedToggle();
    RadioButton categ = (RadioButton) group1.getSelectedToggle();
    String matchinfo = match.getText();
    String categinfo = categ.getText();

    int y= 0;
    int price = 0 ;
     String number =x.getValue();
        if(categinfo==rb4.getText() && number == "one"){
          price= 300;
        }
        if(categinfo==rb4.getText() && number == "Two"){
          price= 600;
        }
        if(categinfo==rb4.getText() && number == "Three"){
          price= 900;
        }
          if(categinfo==rb5.getText() && number == "one"){
          price= 200;
        }
        if(categinfo==rb5.getText() && number == "Two"){
          price= 400;
        }
        if(categinfo==rb5.getText() && number == "Three"){
          price= 800;
        }
          if(categinfo==rb6.getText() && number == "one"){
          price= 100;
        }
        if(categinfo==rb6.getText() && number == "Two"){
          price= 200;
        }
        if(categinfo==rb6.getText() && number == "Three"){
          price= 300;
        }
         
TextArea textfield1 = new TextArea("The number of tickets = "+ number + "\r\n" + "\nThe choosen match is = " + matchinfo +"\r\n"+ "\nThe category choosen is = " + categinfo + "\r\n"+ "\nYou have choosen -> " + number + " " + categinfo + " Tickets and their price =  " + price);
textfield1.setPrefSize(300, 300);
grid.add(textfield1, 1, 12);
Button print = new Button("Printing details ");
grid.add(print, 1, 13);
Button btn0 = new Button("Pay ");
grid.add(btn0, 0, 13);
visapayment z1 = new visapayment();
btn0.setOnAction(s ->z1.start(primaryStage));

Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("printing details");
alert.setHeaderText("Ticket Printing ");
alert.setContentText("Visit the nearest branch to get your ticket ");
print.setOnAction(s -> alert.show());
});

    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
