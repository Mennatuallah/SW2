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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/**
 *
 * @author 
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
    
         primaryStage.setTitle("Login");
     GridPane g = new GridPane();
     g.setAlignment(Pos.CENTER);
     g.setHgap(5);
     g.setVgap(5);
     g.setPadding(new Insets(20,20,20,20));
    
     Text t = new Text("login : ");
     t.setFont(Font.font("tahoma", FontWeight.LIGHT,0));
     Label l = new Label("User Name : ");
     l.setFont(Font.font("tahoma", FontWeight.BOLD,20));

     TextField tf = new TextField();
     Label l2 = new Label("password :");
     l2.setFont(Font.font("tahoma", FontWeight.BOLD,20));
     PasswordField pf = new PasswordField();
     
     g.add(t, 0, 0,2,1);
     g.add(l,0,1);
     g.add(tf, 1,1);
     g.add(l2, 0,2);
     g.add(pf, 1,2);
 
     g.setGridLinesVisible(false);
     Button b = new Button("submit");
     b.setFont(Font.font("tahoma", FontWeight.BOLD,20));
     HBox hb = new HBox(20);
     hb.setAlignment(Pos.BOTTOM_RIGHT);
     hb.getChildren().add(b);
     g.add(hb, 1, 3);
     final Text actiontarget = new Text();
     g.add(actiontarget, 1,6);
     b.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent e) {
              
                if(tf.getText().equals("Admin")&&pf.getText().equals("12345678")){
                    primaryStage.close();
                    Adminfx AdminPage = new Adminfx();
                    try {
                        Stage s = new Stage();
                        AdminPage.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                              else if(tf.getText().equals("Patient")&&pf.getText().equals("123")){
                    primaryStage.close();
                    pageOfpatient PatientPage = new pageOfpatient();
                    try {
                        Stage s = new Stage();
                        PatientPage.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                               else if(tf.getText().equals("Doctor")&&pf.getText().equals("1234")){
                    primaryStage.close();
                    pageOfdotor DoctorPage = new pageOfdotor();
                    try {
                        Stage s = new Stage();
                        DoctorPage.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                               else if(tf.getText().equals("Staff")&&pf.getText().equals("12345")){
                    primaryStage.close();
                    pageOfreceptionist StaffPage = new pageOfreceptionist();
                    try {
                        Stage s = new Stage();
                        StaffPage.start(s);

                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    actiontarget.setFill(Color.CADETBLUE);
                    actiontarget.setText("Invalid Username and Password!");
                }
            }
     });
     
     
     Scene s = new Scene(g,700,700);
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
