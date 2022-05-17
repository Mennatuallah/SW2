/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.javafxapplication3;

import java.awt.Canvas;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projh.ResidentPatient;
import projh.VisitorPatient;
import projh.person;

/**
 *
 * @author
 */
public class pageOfpatient extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane grid = new Pane();

        Text txt1 = new Text("WELCOME....");
        txt1.setFont(Font.font("RED", FontWeight.EXTRA_BOLD, 50));
        txt1.setFill(Color.BLUEVIOLET);
        txt1.setLayoutX(10);
        txt1.setLayoutY(50);

        Button b = new Button("Show All Timetable");
        b.setFont(Font.font("RED", FontWeight.BOLD, 30));
        b.setLayoutX(200);
        b.setLayoutY(120);

        ResidentPatient rp = new ResidentPatient();
        VisitorPatient vp = new VisitorPatient();
        b.setOnAction((ActionEvent event) -> {
            rp.showALLTimeTable();
            vp.showALLTimeTable();
        });

        Button b2 = new Button("Show My Report");
        b2.setFont(Font.font("RED", FontWeight.BOLD, 30));
        b2.setLayoutX(200);
        b2.setLayoutY(220);
        b2.setOnAction((ActionEvent event) -> {
            rp.showMyReport(rp.id);
            vp.showMyReport(vp.id);
        });

        Button b3 = new Button("EXIT");
        b3.setLayoutX(640);
        b3.setLayoutY(410);
        b3.setFont(Font.font("RED", FontWeight.EXTRA_BOLD, 15));
        b3.setOnAction((ActionEvent e) -> {
            if (e.getSource() == b3) {
                Platform.exit();
            }
        });

        grid.getChildren().addAll(b, txt1, b2, b3);
        Scene scene = new Scene(grid, 700, 450);

        primaryStage.setTitle("Hospital");
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
