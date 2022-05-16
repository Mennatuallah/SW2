/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import projh.*;

/**
 *
 * @author 
 */
public class pageOfdotor extends Application {
    
   
    Doctor doc=new Doctor(); 
    @Override
    public void start(Stage primaryStage) {
        Label lb1=new Label("Doctor");
        Label lb2=new Label("To write the report & cheak the health of the patient");
        Button btn1=new Button("My Patient");
        Label lb3=new Label("To show the history of the Visitor patient");
        Button btn2=new Button("Visitor Patient History");
        Label lb88=new Label("To show the history of the Resident patient");
        Button btn8=new Button("Resident Patient History");
        Label lb4=new Label("To show the private message from patient");
        Button btn3=new Button("Private Message");
        ////////////////////////////////////////////////////////////
        Stage stage1 = new Stage();
                Label l1=new Label();
                Label l2=new Label();

        Label lb5=new Label("Report");
        Label lb6=new Label("Enter your ID:");
        Label lb7=new Label("Enter patient ID");
        Label lb8=new Label("Write a report");
        TextField tx1 = new TextField();
        TextField tx2 = new TextField();
        TextArea ta1 =new TextArea();
        Button btn4=new Button("Send");
        ta1.setPrefSize(10,5);
              

             VBox root1 = new VBox();
                root1.setSpacing(6);

              
       lb5.setFont(new Font("Cambria", 60));
        lb6.setFont(new Font("Cambria", 20));
        lb7.setFont(new Font("Cambria", 20));
        lb8.setFont(new Font("Cambria", 20));
        btn4.setFont(new Font("Cambria", 30));
        tx1.setFont(new Font("Cambria", 20));
        tx2.setFont(new Font("Cambria", 20));  
        ta1.setFont(new Font("Cambria", 20));  
        lb5.setTextFill(Color.CORNFLOWERBLUE);
        btn4.setTextFill(Color.CORNFLOWERBLUE);



        Scene scene1 = new Scene(root1, 500, 530);
        root1.setStyle("-fx-background-color: lightyellow");
        root1.setAlignment(Pos.CENTER);
        root1.setPadding(new Insets(35,35,35,35));
        
        root1.getChildren().add(lb5);
        root1.getChildren().add(lb6);
        root1.getChildren().add(tx1);     
        root1.getChildren().add(lb7);
        root1.getChildren().add(tx2);
        root1.getChildren().add(lb8);
        root1.getChildren().add(ta1);
        root1.getChildren().add(btn4);
        root1.getChildren().add(l1);
        root1.getChildren().add(l2);

        stage1.setTitle("Report");

        stage1.setScene(scene1);
        /////////////////////////history of visitor patient//////////////////////////////////////
        Stage stage2 = new Stage();
        
        Label l3=new Label();
        Label l4=new Label();

        Button btn5 = new Button("OK");
        Label lb9=new Label("Patient ID");
        Label lb10=new Label("Visitor History");
        
        TextField tx3 = new TextField();

            VBox root2 = new VBox();
        root2.setPadding(new Insets(35,35,35,35));

        root2.getChildren().add(lb10);
        root2.getChildren().add(lb9);
        root2.getChildren().add(tx3);
        root2.getChildren().add(btn5);
        root2.getChildren().add(l3);
        root2.getChildren().add(l4);

        Scene scene2 = new Scene(root2, 500, 330);
                root2.setSpacing(6);
        
        lb10.setFont(new Font("Cambria", 50));
        lb9.setFont(new Font("Cambria", 20));
        btn5.setFont(new Font("Cambria", 20));
        tx3.setFont(new Font("Cambria", 20));
        btn5.setTextFill(Color.DEEPPINK);
        lb10.setTextFill(Color.DEEPPINK);


        root2.setStyle("-fx-background-color: lightyellow");
        root2.setAlignment(Pos.CENTER);

        stage2.setTitle("Hello");
        stage2.setScene(scene2);
        //////////////////////////////////////////////////////////////
        
        Stage stage4 = new Stage();
        
        Label l5=new Label();
        Label l6=new Label();

        Button btn7= new Button("OK");
        Label lb000=new Label("Resident History");
        Label lb00=new Label("Patient ID");
        TextField tx0 = new TextField();

            VBox root4 = new VBox();
        root4.setPadding(new Insets(35,35,35,35));

        root4.getChildren().add(lb000);
        root4.getChildren().add(lb00);
        root4.getChildren().add(tx0);
        root4.getChildren().add(btn7);
        root4.getChildren().add(l5);
        root4.getChildren().add(l6);

        
        Scene scene4 = new Scene(root4, 500, 330);
                root4.setSpacing(6);
        
        lb000.setFont(new Font("Cambria", 50));
        lb00.setFont(new Font("Cambria", 20));
        btn7.setFont(new Font("Cambria", 20));
        tx0.setFont(new Font("Cambria", 20));
        btn7.setTextFill(Color.DARKMAGENTA);
        lb000.setTextFill(Color.DARKMAGENTA);


        root4.setStyle("-fx-background-color: lightyellow");
        root4.setAlignment(Pos.CENTER);

        stage4.setTitle("Hello World!");
        stage4.setScene(scene4);
        //////////////////////////////////////////////////////////////
        Stage stage3 = new Stage();
        
        Button btn6 = new Button("Seen");
        Label lb13 =new Label("message");
        TextArea ta2=new TextArea();
        Label lb11 =new Label("from");
        TextField tx5 = new TextField();
        Label lb12 =new Label("Private Message");

        btn6.setFont(new Font("Cambria", 20));
        lb13.setFont(new Font("Cambria", 20));
        ta2.setFont(new Font("Cambria", 20));
        lb11.setFont(new Font("Cambria", 20));
        tx5.setFont(new Font("Cambria", 20));        
        lb12.setFont(new Font("Cambria", 50));

        btn6.setTextFill(Color.YELLOWGREEN);
        lb12.setTextFill(Color.YELLOWGREEN);
        
         VBox root3 = new VBox();
                root3.setSpacing(6);
                root3.getChildren().add(lb12);

                root3.getChildren().add(lb11);
        root3.getChildren().add(tx5);
        root3.getChildren().add(lb13);
        root3.getChildren().add(ta2);
        root3.getChildren().add(btn6);

        Scene scene3 = new Scene(root3, 500, 330);
        root3.setStyle("-fx-background-color: lightyellow");
        root3.setAlignment(Pos.CENTER);
        root3.setPadding(new Insets(35,35,35,35));

        stage3.setTitle("Private Message");
        stage3.setScene(scene3);
        
        ///////////////////////////////////////////////////////////
        lb1.setFont(new Font("Cambria", 70));
        lb2.setFont(new Font("Cambria", 20));
        lb3.setFont(new Font("Cambria", 20));
        lb88.setFont(new Font("Cambria", 20));
        lb4.setFont(new Font("Cambria", 20));
        btn1.setFont(new Font("Cambria", 20));
        btn2.setFont(new Font("Cambria", 20));
        btn8.setFont(new Font("Cambria", 20));
        btn3.setFont(new Font("Cambria", 20));
        
        lb2.setTextFill(Color.CORNFLOWERBLUE);
        lb3.setTextFill(Color.DEEPPINK);
        lb88.setTextFill(Color.DARKMAGENTA);
        
        lb4.setTextFill(Color.YELLOWGREEN);
        
        
        
                   VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(15,15,15,15));

        
        root.getChildren().add(lb1);
        root.getChildren().add(lb2);
        root.getChildren().add(btn1);
        root.getChildren().add(lb3);
        root.getChildren().add(btn2);
        root.getChildren().add(lb88);
        root.getChildren().add(btn8);
        root.getChildren().add(lb4);
        root.getChildren().add(btn3);
        
         root.setStyle("-fx-background-color: lightyellow");
        
        Scene scene = new Scene(root, 800, 650);
   
        
        primaryStage.setTitle("Doctor");
        primaryStage.setScene(scene);
        primaryStage.show();
    
     btn1.setOnAction((ActionEvent event) -> {
         stage1.show();
        });
     
     btn2.setOnAction((ActionEvent event) -> {
         stage2.show();
        });
     btn8.setOnAction((ActionEvent event) -> {
         stage4.show();
        });
        btn3.setOnAction((ActionEvent event) -> {
         stage3.show();
        });
        btn4.setOnAction((ActionEvent event) -> {
            String  did =tx1.getText();
            String pid=tx2.getText();
            String report=ta1.getText();

            if (!did.equals("") && !pid.equals("") && !report.equals("") ) {
            
            tx1.setText("");
            tx2.setText("");
            ta1.setText("");
                        l2.setText("");

            l1.setText("The report is written");

            doc.MakeReport(Integer.parseInt(did),Integer.parseInt(pid),report);
            }
            else{
                            l1.setText("");

                l2.setText("Please sure that you add your data");
            
            }
 
   });
        
         btn5.setOnAction((ActionEvent event) -> {
            
            String pid = tx3.getText();
            
            if (!pid.equals("")){
            tx3.setText("");
                        l4.setText("");

            l3.setText("SUCCESSFUL");

           doc.showMHistoryofVisitor(Integer.parseInt(pid));
            }
            else{
                            l3.setText("");

                l4.setText("Please sure that you add the ID");
            
            }
            
   });
         
          btn7.setOnAction((ActionEvent event) -> {
            
            String pid = tx0.getText();
                      
           if (!pid.equals("")){

            tx0.setText("");
            l6.setText("");

             l5.setText("SUCCESSFUL");
           doc.showMHistoryofResident(Integer.parseInt(pid));
                        }
            else{
                            l5.setText("");

                l6.setText("Please sure that you add the ID");
            
            }
   });
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}

