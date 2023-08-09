/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
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
public class Mainmenu extends Application {
    
    @Override
    public void start(Stage primaryStage1) {

        GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(10,10,10,10));

Scene scene2 = new Scene (grid,400,300);
primaryStage1.setTitle("Main menu Form");
primaryStage1.setScene(scene2);
primaryStage1.show();

Text scenetitle = new Text("Main Menu");
scenetitle.setFont(Font.font("Verdana Pro Semibold",FontWeight.NORMAL,19));

grid.add(scenetitle,0,0,2,1);

Label label1 = new Label ("For checking available matches and categories press Check button ");
grid.add(label1, 0, 1);

Button check = new Button("Check ");
grid.add(check, 0, 2);
MatchesInfo info1 = new MatchesInfo();
check.setOnAction(e ->info1.start(primaryStage1));

Label label2 = new Label ("For booking your ticket press Book button ");
grid.add(label2, 0, 3);

Button Book = new Button("Book ");
grid.add(Book, 0, 4);
BookTicket b1  = new BookTicket();
Book.setOnAction(e ->b1.start(primaryStage1));


Label label3 = new Label ("To leave a comment for Stadium owner press the 'messege' button ");
grid.add(label3, 0, 5);

Button btn3 = new Button("messege ");
grid.add(btn3, 0, 6);

Button btn4 = new Button("save ");
grid.add(btn4, 0, 8);
 TextField f1 = new TextField();
 
btn4.setOnAction(e -> {    
    try{
  FileWriter Writer = new FileWriter("comentwritten.txt",true);
  Writer.write(f1.getText());
  Writer.close();

}
catch(IOException f )
{
    f.printStackTrace();
}
});



btn3.setOnAction(e -> {

    grid.add(f1, 0, 7);
    
});




    }
    
    

    public static void main(String[] args) {
        launch(args);
    }
    
}
