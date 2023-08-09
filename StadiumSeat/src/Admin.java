/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
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




public class Admin extends Application {
    
   @Override
    public void start(Stage primaryStage){
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(20);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));



Scene scene = new Scene (grid,465,450);
primaryStage.setTitle("Admin panel");
primaryStage.setScene(scene);
primaryStage.show();


        
Text scenetitle = new Text("Admin Panel");
scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,21));

grid.add(scenetitle,0,0,2,1);



Label label1 = new Label("To check matches info press 'check Button' ");
grid.add(label1, 0, 1);
    label1.setFont(new Font("Times New Roman", 14));

Button btn = new Button("Check ");
grid.add(btn, 0, 2);

Label label2 = new Label("To check Signed up people info press 'check' ");
grid.add(label2, 0, 3);
    label2.setFont(new Font("Times New Roman", 14));

Button btn1 = new Button("Check info ");
grid.add(btn1, 0, 4);


Label label3 = new Label("To check messeges for the Stadium owner press 'check messeges' ");
grid.add(label3, 0, 5);
    label3.setFont(new Font("Times New Roman", 14));

Button btn3= new Button("Check messeges ");
grid.add(btn3, 0, 6);

btn3.setOnAction(e -> {
 try{
  FileInputStream read = new FileInputStream("comentwritten.txt");
  BufferedReader reader = new BufferedReader(new InputStreamReader(read));
  String line = reader.readLine();
  Label l1 = new Label(line);
   l1.setFont(new Font("Times New Roman", 20));
  grid.add(l1, 0, 7);
  
  
  reader.close();
  read.close();
   
  
}



catch(IOException f )
{
    f.printStackTrace();
}
    
});

Label label8 = new Label("To know how many Transactions done today press 'check Transactions' ");
grid.add(label8, 0, 8);
  label8.setFont(new Font("Times New Roman", 14));

  Button btn8= new Button("Check Transactions ");
grid.add(btn8, 0, 9);
  
btn8.setOnAction(e -> {
 try{
  FileInputStream read = new FileInputStream("counter.txt");
  BufferedReader reader = new BufferedReader(new InputStreamReader(read));
  String line = reader.readLine();
  Label l19 = new Label(line);
   l19.setFont(new Font("Times New Roman", 20));
  grid.add(l19, 0, 10);
  
  
  reader.close();
  read.close();
   
  
}



catch(IOException s )
{
    s.printStackTrace();
}
  
});
    
    
SignedupInfo s1 = new SignedupInfo();
btn1.setOnAction(e ->s1.start(primaryStage));


MatchesInfo2 f1 = new MatchesInfo2();
btn.setOnAction(e ->f1.start(primaryStage));



    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
