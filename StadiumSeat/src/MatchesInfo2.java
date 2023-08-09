/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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





public class MatchesInfo2 extends Application {
    @Override
    
    public void start(Stage primaryStage2) {

        
GridPane grid = new GridPane();
grid.setAlignment(Pos.TOP_CENTER);
grid.setHgap(10);
grid.setVgap(20);
grid.setPadding(new Insets(20,20,20,20));


Scene scene = new Scene (grid,500,600);
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
        
        Admin a1 = new Admin();
        a1.equals(a1);
        
  
        
   Label label2 = new Label (one);
grid.add(label2, 0, 2);


Label label3 = new Label (two);
grid.add(label3, 0, 3);

Label label4 = new Label (three);
grid.add(label4, 0, 4);




  Label label5 = new Label ("Here are the Categories : ");
grid.add(label5, 0, 7);
label5.setFont(new Font("Times New Roman", 20));


Label label7 = new Label ("1- Platinum -- 300$ per 1 ticket");
grid.add(label7, 0, 8);

Label label8 = new Label ("2- Gold -- 200$ per 1 ticket");
grid.add(label8, 0, 9);

Label label9 = new Label ("3- Silver -- 100$ per 1 ticket");
grid.add(label9, 0, 10);



Button back = new Button(" Admin ");
grid.add(back, 1, 11);
Admin backk = new Admin();
back.setOnAction(e ->backk.start(primaryStage2));



Button update = new Button(" update ticket prices ");
grid.add(update, 0, 12);

Label label0 = new Label ("update tickes : ");
TextField text1= new TextField();

Button save1 = new Button(" save ticket update ");
grid.add(save1, 0, 13);

save1.setOnAction(f -> {
try{
  FileWriter Writer = new FileWriter("updatedticket.txt",true);
  Writer.write(text1.getText());
  Writer.close();

}
catch(IOException e )
{
    e.printStackTrace();
}

});



update.setOnAction(e -> {
    grid.add(label0, 1, 8);
    grid.add(text1, 1, 9);
});






Button add = new Button(" Add match ");
grid.add(add, 1, 12);




TextField label10 = new TextField();
//String addedmatch = label10.getText();


Button save = new Button(" save ");
grid.add(save, 1, 13);

save.setOnAction(f -> {
try{
  FileWriter Writer = new FileWriter("addedmatch.txt",true);
  Writer.write(label10.getText());
  Writer.close();

}
catch(IOException e )
{
    e.printStackTrace();
}

});


Label label13 = new Label ("Add new Matches : ");
MatchesInfo q1 = new MatchesInfo();
Button checkinfo = new Button("check update ");
grid.add(checkinfo, 1, 14);
checkinfo.setOnAction(e ->q1.start(primaryStage2));



add.setOnAction(e -> {
    grid.add(label13, 0, 5);
    grid.add(label10, 0, 6);
});

    }
    
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
