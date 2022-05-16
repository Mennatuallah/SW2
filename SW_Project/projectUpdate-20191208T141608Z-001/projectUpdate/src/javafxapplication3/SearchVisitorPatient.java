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
import javafx.stage.Stage;
import projh.ResidentPatient;
import projh.VisitorPatient;

/**
 *
 * @author 
 */
public class SearchVisitorPatient extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      GridPane root =new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        TextField searchn = new TextField();
        Button search= new Button ("Search");
        Button back = new Button("Back");
        Label found = new Label();
        found.setId("hh");
        root.add(searchn,1,0);
        root.add(search,2,2);
        root.add(back,0,2);
        root.add(found,1,1);
        Scene scene = new Scene(root, 500, 500);
        scene.getStylesheets().add(SearchONPatient.class.getResource("SearchONPatient.css").toExternalForm());
        
        VisitorPatient h = new VisitorPatient();
        search.setOnMouseClicked(e->{
        if(!searchn.getText().isEmpty())
         {
              if(isInt(searchn,searchn.getText()))
              {
                    int i = (Integer.parseInt(searchn.getText()));
                  String j =  h.searchPatient(i);
                  if(j == null)
                  {
                      found.setText("Not Found");
                     
                  }
                   else
                  {
                      
                     found.setText(j+"\n");
                  }
              }else
                  found.setText("Error Entered Number");
               
        }
      });
        
        primaryStage.setTitle("Search ON Visitor Patient");
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
