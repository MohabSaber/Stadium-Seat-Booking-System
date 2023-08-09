/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
public class SignedupInfo extends Application {
    
       @Override
    public void start(Stage primaryStage){
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(20);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));



Scene scene = new Scene (grid,300,300);
primaryStage.setTitle("Info");
primaryStage.setScene(scene);
primaryStage.show();


        
Text scenetitle = new Text("Sign up Information");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,21));

grid.add(scenetitle,0,0,2,1);


Button btn1 = new Button("get Info ");
grid.add(btn1, 0, 2);

Button btn2 = new Button("Admin ");
grid.add(btn2, 0, 5);
Admin a1 = new Admin();
btn2.setOnAction(e ->a1.start(primaryStage));


btn1.setOnAction(f -> {
try{
  FileInputStream read = new FileInputStream("addedInfo.txt");
  BufferedReader reader = new BufferedReader(new InputStreamReader(read));
  String line = reader.readLine();
  Label l1 = new Label(line);
  grid.add(l1, 0,3);
   l1.setFont(new Font("Times New Roman", 20));
 
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
