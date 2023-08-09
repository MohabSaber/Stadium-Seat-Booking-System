/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author felfe
 */
public class MatchesInfo extends Application {
    @Override
    
    public void start(Stage primaryStage2) {
       
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(10);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));


Scene scene = new Scene (grid,500,450);
primaryStage2.setTitle("MatchesInfo");
primaryStage2.setScene(scene);
primaryStage2.show();

        
        Text scenetitle = new Text("Matches Info");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,21));

grid.add(scenetitle,0,0,2,1);
    
    Label label1 = new Label ("Here are the available Matches : ");
grid.add(label1, 0, 1);
label1.setFont(new Font("Times New Roman", 20));



ArrayList<String> matches=new ArrayList<String>();
        matches.add("1- FC Barcelona VS Real Madrid on Saturday at 10:00 PM");
        matches.add("2- Manchester City VS Manchester United on Sunday at 9:00 PM");
        matches.add("3- Arsenal VS Chelsea on Monday at 8:00 PM");
        
        String one = matches.get(0);
        String two=matches.get(1);
        String three=matches.get(2);
        
        
   Label label2 = new Label ("1- FC Barcelona VS Real Madrid on Saturday at 10:00 PM");
grid.add(label2, 0, 2);


Label label3 = new Label (two);
grid.add(label3, 0, 3);

Label label4 = new Label (three);
grid.add(label4, 0, 4);


  Label label5 = new Label ("Here are the Categories : ");
grid.add(label5, 0, 6);
label5.setFont(new Font("Times New Roman", 20));


Label label7 = new Label ("1- Platinum -- 300$ per 1 ticket");
grid.add(label7, 0, 7);

Label label8 = new Label ("2- Gold -- 200$ per 1 ticket");
grid.add(label8, 0, 8);

Label label9 = new Label ("3- Silver -- 100$ per 1 ticket");
grid.add(label9, 0, 9);


Button back = new Button("Main Menu ");
grid.add(back, 1, 10);
Mainmenu backk = new Mainmenu();
back.setOnAction(e ->backk.start(primaryStage2));


Button refresh = new Button("Refresh for new matches");
grid.add(refresh, 0, 11);

Button refresh2 = new Button("Refresh for new ticket prices updates");
grid.add(refresh2, 0, 12);




refresh2.setOnAction(f -> {
try{
  FileInputStream read = new FileInputStream("updatedticket.txt");
  BufferedReader reader = new BufferedReader(new InputStreamReader(read));
  String line = reader.readLine();
  Label l1 = new Label(line);
  grid.add(l1, 1, 7);
  
  
  reader.close();
  read.close();
   
  
}



catch(IOException e )
{
    e.printStackTrace();
}

});




refresh.setOnAction(f -> {
try{
  FileInputStream read = new FileInputStream("addedmatch.txt");
  BufferedReader reader = new BufferedReader(new InputStreamReader(read));
  String line = reader.readLine();
  Label l1 = new Label(line);
  grid.add(l1, 0, 5);
  
  
  reader.close();
  read.close();
   
  
}



catch(IOException e )
{
    e.printStackTrace();
}

});


    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
}
