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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projh.Admin;
import projh.department;
import projh.Doctor;
import projh.ProjH;
import projh.person;


/**
 *
 * @author 
 */
public class AddNewDoctor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       
        
        Text sub= new Text();
        
       GridPane root = new GridPane() ;
       root.setAlignment(Pos.CENTER);
       root.setHgap(10);
       root.setVgap(10);
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
       
        TextField fn = new TextField();
        TextField ln = new TextField();
        TextField idn = new TextField();
        TextField agen = new TextField();
        TextField addressen = new TextField();
        TextField emailn = new TextField();
        PasswordField passn = new PasswordField();
        TextField deptn = new TextField();
        TextField specn = new TextField();
        TextField salaryn= new TextField();
        TextField timen = new TextField();
        Button submit = new Button("Submit");
        Button back = new Button("Back");
       
       RadioButton r1 = new RadioButton("Surgery");
       RadioButton r2 = new RadioButton("the Heart");
       RadioButton r3 = new RadioButton("The belly");
       RadioButton r4 = new RadioButton("Bones");
       
        
        ToggleGroup toggleGroup = new ToggleGroup();

            r1.setToggleGroup(toggleGroup);
            r2.setToggleGroup(toggleGroup);
            r3.setToggleGroup(toggleGroup);
            r4.setToggleGroup(toggleGroup);


       
        
       HBox l=new HBox();
       l.setSpacing(5);
       l.getChildren().addAll(r1,r2,r3,r4);
       
       
    
        
        
       root.add(fname,0,0);
       root.add(lname,0,1);
       root.add(id,0,2);
       root.add(age,0,3);
       root.add(addresse,0,4);
       root.add(email,0,5);
       root.add(pass,0,6);
       root.add(salary,0,7);
       root.add(Time,0,8);
       root.add(dept,0,9);
       
               
       root.add(fn,1,0);
       root.add(ln,1,1);
       root.add(idn,1,2);
       root.add(agen,1,3);
       root.add(addressen,1,4);
       root.add(emailn,1,5);
       root.add(passn,1,6);
       root.add(salaryn,1,7);
       root.add(timen,1,8);
       root.add(l, 1, 9);
       root.add(submit,2,12);
       root.add(sub,1,13);
       root.add(back,0,12);
       
        Scene scene = new Scene(root, 550,500);
        scene.getStylesheets().add(AddNewDoctor.class.getResource("AddNewDoctor.css").toExternalForm());
        Admin x = new Admin();
           
        sub.setOnMouseEntered(new EventHandler<javafx.scene.input.MouseEvent>(){
        
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                sub.setText("");
            }
            
            
            });
            
        
        
        submit.setOnAction(e->{
            
            if(!fn.getText().isEmpty() &&!ln.getText().isEmpty()&&!idn.getText().isEmpty()&&!agen.getText().isEmpty()&&!addressen.getText().isEmpty()&&!emailn.getText().isEmpty()&&!passn.getText().isEmpty()&&!salaryn.getText().isEmpty())
                
        {
            //person h=new person() {
              
            Doctor k = new Doctor();
            //int id,String fname,String lname,String addresse,int age,Department dept,double salary,String username,String pass,String time,String spec
            if(isInt(idn,idn.getText())&&isInt(agen,agen.getText())&&isDouble(salaryn,salaryn.getText()))
            {
            int y = Integer.parseInt(idn.getText());
            int i = Integer.parseInt(agen.getText());
            double j = Double.parseDouble(salaryn.getText());
            String n1 = fn.getText();String n2 = ln.getText();String n3 = addressen.getText();String n4 = emailn.getText();
            String n5 = passn.getText();String n6 = timen.getText();String n7 = specn.getText();
            
            //String user, String pass, int id, String fname, String lname, int age,double salary, department dept,String timetable
            
            k.setFName(fn.getText());k.setID(y);k.setLName(ln.getText());k.setAge(i);k.setUserName(emailn.getText());k.setPass(passn.getText());
            k .setTimeTable(timen.getText());k.setDept(ProjH.Surgery);
            //id, fname, lname, addresse, age, dept, salary, username, pass, time, spec
           if(r1.isSelected())
               
//            x.AddNewDoctor(y,fn.getText(),ln.getText(),addressen.getText(),i,Main.Surgery,j,
//                    emailn.getText(),passn.getText(),timen.getText(),specn.getText());
               
               //x.AddNewDoctor(i, n1, n2, n3, i, Main.Surgery, j, n4, n5, n6, n7);
               x.addNewDoctor(emailn.getText(),passn.getText(),y,fn.getText(),ln.getText(),i,j,ProjH.the_Heart,timen.getText() );
           else if(r2.isSelected())
               //String user, String pass, int id, Sttring fname, String lname, int age,double salary, department dept,String timetable
            x.addNewDoctor(emailn.getText(),passn.getText(),y,fn.getText(),ln.getText(),i,j,ProjH.the_Heart,timen.getText() );
           else if(r3.isSelected())
               x.addNewDoctor(emailn.getText(),passn.getText(),y,fn.getText(),ln.getText(),i,j,ProjH.the_belly,timen.getText() );
           else if(r4.isSelected())
               x.addNewDoctor(emailn.getText(),passn.getText(),y,fn.getText(),ln.getText(),i,j,ProjH.Bones,timen.getText() );
           
           
           
            sub.setText("Done....");
            sub.setFill(Color.RED);
             sub.setFont(new javafx.scene.text.Font(20));
             fn.setText(" ");ln.setText(" ");idn.setText("");agen.setText(" ");addressen.setText(" ");emailn.setText(" ");passn.setText(" ");
             timen.setText(" ");deptn.setText("");specn.setText(" ");salaryn.setText(" ");
             r1.setSelected(false);
             r2.setSelected(false);
             r3.setSelected(false);
             r4.setSelected(false);
            }
            else
            {
                sub.setText("Error Entered Number in TextField ");
                sub.setFill(Color.RED);
                sub.setFont(new javafx.scene.text.Font(20));
            }
                
           
        }
            else
            {
                        sub.setText("You are Ignored Field");
                   sub.setFill(Color.RED);
                    sub.setFont(new javafx.scene.text.Font(20));
            }
            
            
             
//        
        });
       
            back.setOnMouseClicked(e->{
            
                new Page_of_Doctor().start(primaryStage);
            });
            
        
        primaryStage.setTitle("Add New Doctor");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
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
          
          private boolean isDouble(TextField input,String message)
    {
        try{
        double number = Double.parseDouble(input.getText());
        return true;
        }catch(NumberFormatException e)
        {
            return false;
        }
    
    }
}

