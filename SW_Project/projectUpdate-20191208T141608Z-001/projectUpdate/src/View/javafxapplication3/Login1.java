/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author الاستاذ
 */
public class Login1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      primaryStage.setTitle("Choice ");
        GridPane g = new GridPane();
        g.setAlignment(Pos.CENTER);
        g.setHgap(5);
        g.setVgap(5);
        g.setPadding(new Insets(20,20,20,20));
        g.setBackground(new Background (new BackgroundFill(Color.CADETBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Label l = new Label("Choose your request : ");
        l.setTextFill(Color.WHITE);
        l.setAlignment(Pos.CENTER);
        l.setFont(Font.font("tahoma", FontWeight.BOLD,35));
        
        Button b = new Button("Receptoinest Page");
        b.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
       

        Button b1 = new Button("Admin Page");
        
        b1.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
        
        
        Button b2 = new Button("Patient Page");
        
        b2.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
        
        Button b3 = new Button("Doctors Page");
        
        b3.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
        final Text actiontarget = new Text();
        g.add(actiontarget, 1,6);
         
         g.add(l, 1, 0);
         g.add(b, 1, 5);
         g.add(b1,5, 5);
         g.add(b2,1, 10);
         g.add(b3,5, 10);
        
        b.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
              
               
                    primaryStage.close();
                    pageOfreceptionist admin = new pageOfreceptionist();
                    try {
                        Stage s = new Stage();
                        admin.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
         }
     });
        b1.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
              
               
                    primaryStage.close();
                    Adminfx admin = new Adminfx();
                    try {
                        Stage s = new Stage();
                        admin.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
         }
     });
        b2.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
              
               
                    primaryStage.close();
                    pageOfpatient admin = new pageOfpatient();
                    try {
                        Stage s = new Stage();
                        admin.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
         }
     });
        b3.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
              
               
                    primaryStage.close();
                    pageOfdotor admin = new pageOfdotor();
                    try {
                        Stage s = new Stage();
                        admin.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
         }
     });
         
         
         
         
        Scene s = new Scene(g, 700, 800);
        s.getStylesheets().add(Login.class.getResource("name.css").toExternalForm());
        primaryStage.setScene(s);
        primaryStage.show();
    }
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
