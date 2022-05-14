/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projh.Admin;


/**
 *
 * @author Mohamed GH
 */
public class DisplayAllPatient extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Admin x = new Admin();
        GridPane root = new GridPane() ;
        
       
        Button back = new Button("Back");
       root.setAlignment(Pos.CENTER);
       root.setHgap(10);
       root.setVgap(10);
       root.add(back, 0, 9);
       Text text = new Text();
       text.setId("hh");
        ScrollBar sc= new ScrollBar();
        
       VBox d= new VBox();
       d.getChildren().add(sc);
       text.setText(x.displayAllResidentPatient());
        
       
       if(text != null)
       {
           root.add(text, 0, 0); 
       }
       else
       {
          text.setText("null");
          
       }
               
        Scene scene = new Scene(root, 1000, 700);
        scene.getStylesheets().add(DisplayAllPatient.class.getResource("DispalyAllPatient.css").toExternalForm());
        
        primaryStage.setTitle("Display All Patient");
        primaryStage.setScene(scene);
        primaryStage.show();
         back.setOnMouseClicked(e->{
            
                new Page_of_Patient().start(primaryStage);
            });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
