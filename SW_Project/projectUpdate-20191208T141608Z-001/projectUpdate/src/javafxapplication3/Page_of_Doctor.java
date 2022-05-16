/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 
 */
public class Page_of_Doctor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
        VBox v= new VBox();
        Button update = new Button("Update Docotr");
        Button Delet = new Button("Delet Docotr");
        Button search = new Button("Search Docotr");
        Button Add = new Button("Add New Docotr");
        Button Display = new Button("Display Docotr");
         Button back = new Button("Back");
         
        v.getChildren().addAll(update,Delet,search,Add,Display,back);
        VBox.setMargin(Add, new Insets(10));
        VBox.setMargin(update, new Insets(10));
        VBox.setMargin(Delet, new Insets(10));
        VBox.setMargin(search, new Insets(10));
        VBox.setMargin(Display, new Insets(10));
        VBox.setMargin(back, new Insets(10));
        
        BorderPane root= new BorderPane();
       
        //Label text = new Label("Welcom to the Page of Docotr");
        //root.setCenter(text);
        
        root.setLeft(v);
        //text.setPadding(new Insets(20));
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(Page_of_Doctor.class.getResource("Page_of_Doctor.css").toExternalForm());
        
        Add.setOnMouseClicked(e->{
        
            primaryStage.close();
            new AddNewDoctor().start(primaryStage);
        
        });
        
        update.setOnMouseClicked(e->{
            primaryStage.close();
            new UpdateNweDoctor().start(primaryStage);
        });
       Delet.setOnMouseClicked(e->{
           primaryStage.close();
           new DeletDoctor().start(primaryStage);
       
       });
        search.setOnMouseClicked(e->{
           primaryStage.close();
           new SearchONDoctor().start(primaryStage);
       
       });
         Display.setOnMouseClicked(e->{
           primaryStage.close();
           new DisplayAllDoctor().start(primaryStage);
       
       });
         
         back.setOnMouseClicked(e->{
           primaryStage.close();
           new Adminfx().start(primaryStage);
       
       });
       
        
        
        
        primaryStage.setTitle("Page_of_Doctor");
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
