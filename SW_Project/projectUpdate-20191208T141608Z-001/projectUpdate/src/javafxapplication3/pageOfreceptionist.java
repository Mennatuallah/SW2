/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 
 */
public class pageOfreceptionist extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
    Stage window = new Stage();
        mainScene();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 public static void mainScene(){
            Stage window = new Stage();
        Text text = new Text ("welcome in Reception ....... ");
        text.setFont(javafx.scene.text.Font.font(20));
        text.setX(130);
        text.setY(70);
        Group root = new Group();
        root.getChildren().add(text);
        Scene scene1= new Scene(root, 550, 500);
        scene1.getStylesheets().add(pageOfreceptionist.class.getResource("receptionist.css").toExternalForm());
        window.setTitle("Hospital .....");
        
        // 2lButtons
        Button btn1 = new Button("Show Time Table");
        Button btn2 = new Button("Show All Appointments");
        Button btn3 = new Button("Filter Appointments");
        Button btn4 = new Button("Book an Appointment");
        
        //x-axis translation
        btn1.setTranslateX(100);
        btn2.setTranslateX(300);
        btn3.setTranslateX(100);
        btn4.setTranslateX(300);
        
        //y-axis translation
        btn1.setTranslateY(150);
        btn2.setTranslateY(150);
        btn3.setTranslateY(300);
        btn4.setTranslateY(300);
        
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        //Button3
        btn3.setOnAction((ActionEvent e) -> {
            window.close();
            scene__s.scene3();
            
            });
        //Button4
        btn4.setOnAction((ActionEvent e) -> {
            window.close();
            scene__s.scene4();
            
            });
        //دول عشان الحاجه تظهر و تشتعل 
        window.setScene(scene1);
	window.show();
    }
}

    /**
     * @param args the command line arguments
     */
   

