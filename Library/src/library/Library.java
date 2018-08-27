/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;
import java.io.FileNotFoundException;
import javafx.animation.RotateTransition;
import javafx.application.Application; 
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;  
import javafx.util.Duration;

/**
 *
 * @author Admin
 */
public class Library extends Application {
    
    @Override
    public void start(Stage stage) throws FileNotFoundException{

        
       Polygon hexagon = new Polygon();        
      
      //Adding coordinates to the hexagon 
      hexagon.getPoints().addAll(new Double[]{        
         200.0, 50.0, 
         400.0, 50.0, 
         450.0, 150.0,          
         400.0, 250.0, 
         200.0, 250.0,                   
         150.0, 150.0, 
      }); 
      //Setting the fill color for the hexagon 
      hexagon.setFill(Color.BLUE); 
       
      //Creating a rotate transition    
      RotateTransition rotateTransition = new RotateTransition(); 
      
      //Setting the duration for the transition 
      rotateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      rotateTransition.setNode(hexagon);       
      
      //Setting the angle of the rotation 
      rotateTransition.setByAngle(360); 
      
      //Setting the cycle count for the transition 
      rotateTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      rotateTransition.setAutoReverse(false); 
      
      //Playing the animation 
      rotateTransition.play(); 
        
        Text date = new Text();
        date.setText("Date: 11/12/13");
        
        date.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        date.setX(50);
        date.setY(50);
        
        Text time = new Text();
        time.setText("Time: 11:22 PM");
        time.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        time.setX(350);
        time.setY(50);
        
        Text day = new Text();
        day.setText("Day: Friday");
        day.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        day.setX(50);
        day.setY(100);
        
        Group root = new Group(date,time,day,hexagon);
  
        
        Scene scene = new Scene(root,1200,700);
        
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
