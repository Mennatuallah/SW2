/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import projh.Admin;
import projh.Doctor;


/**
 *
 * @author Mohamed GH
 */
public class DeletDoctor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label found= new Label();
       found.setId("found");
       Label text = new Label();
        TextField searchn = new TextField();
        Button search =new Button("Search");
        Button submit = new Button("Submit");
        Button back = new Button("Back");
        GridPane root =new GridPane();
        VBox box = new VBox();
        box.getChildren().add(back);
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.add(searchn,1,0);
        root.add(search,2,0);
        root.add(found, 1, 1);
        root.add(submit, 2, 2);
        root.add(box, 1, 2);
        root.add(text, 1, 3);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(DeletDoctor.class.getResource("DeletDoctor.css").toExternalForm());
        primaryStage.setTitle("Delet Doctor");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
         Doctor h =new Doctor();
        search.setOnMouseClicked(e->{
        if(!searchn.getText().isEmpty())
         {
              if(isInt(searchn,searchn.getText()))
              {
                    int i = (Integer.parseInt(searchn.getText()));
                  String j =  h.searchDoctor(i);
                  if(j == null)
                  {
                      found.setText("Not Found");
                     
                  }
                   else
                  {
                      
                     found.setText(j+"\n"+"Delet data");
                  }
              }else
                  found.setText("Error Entere Number");
               
        }
      });
        
        Admin x =new Admin();
        submit.setOnMouseClicked(e->{
            if(isInt(searchn,searchn.getText()))
            {
            int i = (Integer.parseInt(searchn.getText()));
            x.deleteDoctor(i);
            text.setText("Done...");
            }else
                text.setText("Error Entered Number");
        
        });
        
         back.setOnMouseClicked(e->{
            
                new Page_of_Doctor().start(primaryStage);
            });
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
        private boolean isInt(TextField input,String message)
    {
        try{
        int number = Integer.parseInt(input.getText());
        return true;
        }catch(NumberFormatException e)
        {
            return false;
        }
    
    }
}
