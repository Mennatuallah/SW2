/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import projh.VisitorPatient;
import projh.appointment;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projh.receptionist;
import projh.VisitorPatient;
import javafx.scene.control.TableView;

public class scene__s {

    public static void scene1() {

    }

    public static void scene2() {

    }

    public static void scene3() {
        Stage window = new Stage();
        Text text3 = new Text("Filter Appointments ..........");
        text3.setFont(javafx.scene.text.Font.font(20));
        text3.setX(130);
        text3.setY(70);
        Group root3 = new Group();
        root3.getChildren().add(text3);
        Scene scene3 = new Scene(root3, 550, 500);
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button = new Button("Filter Appointment");

        Label doctorIDLabel = new Label("Doctor ID");
        textField1.setPromptText("Enter Doctor Id");
        Label appointmentLabel = new Label("Time");
        textField2.setPromptText("Enter Appointment");

        doctorIDLabel.setTranslateX(80);
        doctorIDLabel.setTranslateY(155);
        appointmentLabel.setTranslateX(90);
        appointmentLabel.setTranslateY(255);
        textField1.setTranslateX(150);
        textField1.setTranslateY(150);
        textField2.setTranslateX(150);
        textField2.setTranslateY(250);
        button.setTranslateX(177);
        button.setTranslateY(340);

        textField1.setPrefWidth(300);
        textField2.setPrefWidth(300);
        button.setPrefWidth(200);

        root3.getChildren().add(doctorIDLabel);
        root3.getChildren().add(appointmentLabel);
        root3.getChildren().add(textField1);
        root3.getChildren().add(textField2);
        root3.getChildren().add(button);

        receptionist x = new receptionist();
        appointment y = new appointment();
        Button backBtn = new Button("Back");
        //action of filterAppointment
        button.setOnAction((ActionEvent e) -> {
            x.filterAppointment(x.getID(), y.gettime());
        });
        //action of back button
        backBtn.setOnAction((ActionEvent e) -> {
            window.close();
            pageOfreceptionist.mainScene();

        });
        root3.getChildren().add(backBtn);
        backBtn.setTranslateX(245);
        backBtn.setTranslateY(400);
        window.setScene(scene3);
        window.show();
    }

    public static void scene4() {
        Stage window = new Stage();
        Group root4 = new Group();
        Scene scene4 = new Scene(root4, 550, 500);
        Text text4 = new Text("Book an Appointment .........");
        text4.setX(130);
        text4.setY(70);
        text4.setFont(javafx.scene.text.Font.font(20));
        TextField textField3 = new TextField();
        Label patientIDLabel = new Label("Patient ID");
        textField3.setPromptText("Enter Your Id");

        textField3.setTranslateX(230);
        textField3.setTranslateY(220);
        patientIDLabel.setTranslateX(170);
        patientIDLabel.setTranslateY(225);

        Button bookBtn = new Button("Book The Appointment");
        Button backBtn4 = new Button("Back");
        root4.getChildren().add(text4);
        root4.getChildren().add(textField3);
        root4.getChildren().add(patientIDLabel);
        root4.getChildren().add(backBtn4);
        root4.getChildren().add(bookBtn);

        backBtn4.setTranslateX(245);
        backBtn4.setTranslateY(400);
        bookBtn.setTranslateX(210);
        bookBtn.setTranslateY(320);

        receptionist x = new receptionist();
        VisitorPatient z = new VisitorPatient();
        bookBtn.setOnAction((ActionEvent e) -> {
            x.BookAppForVisitor(z.getID());
        });
        backBtn4.setOnAction((ActionEvent e) -> {
            window.close();
            pageOfreceptionist.mainScene();

        });
        window.setScene(scene4);
        window.show();
    }

}
