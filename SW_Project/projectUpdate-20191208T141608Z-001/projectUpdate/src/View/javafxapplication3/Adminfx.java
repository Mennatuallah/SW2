/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed GH
 */
public class Adminfx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        Button b1= new Button("Login as Admin");
        Button b2= new Button("Login as Doctor");
        Button b3= new Button("Login as Receptionist");
       root.add(b1, 0, 0);
        root.add(b2, 1, 1);
         root.add(b3, 2, 2);
         root.setPadding(new Insets(13,13,13,13));
         root.setHgap(20);
        */
        
        //GridPane root = new GridPane();
        
        VBox v = new VBox();
      
        
        Button b1= new Button("Page of Patient");
        Button b2= new Button("Page of Doctor");
         Button b3= new Button("Back");
        
        v.getChildren().addAll(b1,b2,b3);
       
        VBox.setMargin(b2, new Insets(10));
        VBox.setMargin(b1, new Insets(10));
        VBox.setMargin(b3, new Insets(10));
//        
        BorderPane root= new BorderPane();
        
        
        root.setLeft(v);
      
        
        
       // root.setPadding(new Insets(30,0,0,0));
//        BorderPane.setMargin(b1, new Insets(20));
//         BorderPane.setMargin(b2, new Insets(20));
        b1.setPrefSize(150, 50);
        b2.setPrefSize(150, 50);
        b3.setPrefSize(150, 50);
//        
        Scene scene = new Scene(root, 500, 400);
        scene.getStylesheets().add(Adminfx.class.getResource("Adminfx.css").toExternalForm());
       b2.setOnMouseClicked(e->{
           primaryStage.close();
           new Page_of_Doctor().start(primaryStage);
       });
       
       b1.setOnMouseClicked(e->{
           primaryStage.close();
           new Page_of_Patient().start(primaryStage);
       });
       
       b3.setOnMouseClicked(e->{
           primaryStage.close();
           new Login1().start(primaryStage);
       
       });
        primaryStage.setTitle("Admin Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
