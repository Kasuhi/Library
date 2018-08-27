/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.beans.EventHandler;
import java.io.FileNotFoundException;
import javafx.application.Application; 
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;  

/**
 *
 * @author Admin
 */
public class Library extends Application {
    
    Scene scene1,scene2;
    
    @Override
    public void start(Stage stage) throws FileNotFoundException{

        
       
        
        
        
        
        
        
        
        
        
        Text date = new Text();
        date.setText("Date: 11/12/13");        
        date.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        
        Text time = new Text();
        time.setText("Time: 11:22 PM");
        time.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
       
        
        Text day = new Text();
        day.setText("Day: Friday");
        day.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        
        Button entry = new Button("Entry Page");
        entry.setStyle("-fx-font: normal normal 15px 'verdana';");
        entry.setOnMouseClicked((new EventHandler <MouseEvent>(){
            public void handle(MouseEvent event){
                System.out.println("hi");
            }
        }));
        
        
        Button rtrn = new Button("Return Page");
        rtrn.setStyle("-fx-font: normal normal 15px 'verdana';");
        
        Button new_std = new Button("Enter a new student");
        new_std.setStyle("-fx-font: normal normal 15px 'verdana';");
                
        Button new_book = new Button("Enter a new book");
        new_book.setStyle("-fx-font: normal normal 15px 'verdana';");
                
        Button dtbs = new  Button("Show issued books databse");
        dtbs.setStyle("-fx-font: normal normal 15px 'verdana';");
        
        
        
        
        
        GridPane gp = new GridPane();
        gp.setStyle("-fx-background-color: BEIGE;");
        gp.setAlignment(Pos.CENTER);
        gp.setMinSize(800, 600);
        gp.setVgap(20);
        gp.setHgap(100);
        
        gp.add(date,0,1);           gp.add(day,1,1);
        gp.add(time,0,2);
        gp.add(entry,0,3);          gp.add(rtrn,1,3);
        gp.add(new_std,0,4);
        gp.add(new_book,0,5);
        gp.add(dtbs,0,6);
        
        Scene scene = new Scene(gp);
        
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    public void entry(Stage entry){
        Text t = new Text(10,10,"hi");
        entry.setTitle("Entry Page");
        entry.setScene(scene1);
        entry.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
