/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projh.Admin;
import projh.ResidentPatient;
import projh.patient;

/**
 *
 * @author Mennatuallah
 */
public class ShowAllTimeTabel {

    /**
     * @param args the command line arguments
     */
    public void start(Stage primaryStage) {
       
        ResidentPatient p = new ResidentPatient();
        GridPane root = new GridPane() ;
       root.setAlignment(Pos.CENTER);
       root.setHgap(10);
       root.setVgap(10);
       Button back = new Button("Back");
       root.add(back, 0, 9);
       Text text = new Text();
       text.setId("hh");
       p.showALLTimeTable();
       
       if(text != null)
       {
           root.add(text, 0, 0);
       }
       else
          // System.out.println("jj");
           text.setText("empty");
           
       /*
       Label fname = new Label("First Name: ");
       Label lname = new Label("Last Name: ");
       Label id = new Label("ID: ");
       Label age = new Label("Age: ");
       Label addresse = new Label("Addresse: ");
       Label email = new Label("Email: ");
       Label pass = new Label("Password: ");
       Label dept = new Label("Deparment: ");
       Label spec = new Label("Sepcilization: ");
       Label salary = new Label("Salary");
       Label Time= new Label("Time");
        */
       
            back.setOnMouseClicked(e->{
            
                new Page_of_Doctor().start(primaryStage);
            });
        
        Scene scene = new Scene(root, 1000, 700);
        scene.getStylesheets().add(DisplayAllDoctor.class.getResource("DisplayAllDoctor.css").toExternalForm());
        primaryStage.setTitle("Display All Doctor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
                launch(args);
    }
    
}
