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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Page_of_Patient extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox v = new VBox();
        Button Add = new Button("Add New Resident Patient");
        Button update = new Button("Update Resident Patient");
        Button Delet = new Button("Delet Resident Patient");
        Button search = new Button("Search Resident Patient");
        Button Display = new Button("Display Resident Patient");
        Button back = new Button("Back");

        VBox r = new VBox();
        Button Addv = new Button("Add New Visitor Patient");
        Button updatev = new Button("Update Visitor Patient");
        Button Deletv = new Button("Delet Visitor Patient");
        Button searchv = new Button("Search Visitor Patient");
        Button Displayv = new Button("Display Visitor Patient");

        v.getChildren().addAll(Add, update, Delet, search, Display, back);
        r.getChildren().addAll(Addv, updatev, Deletv, searchv, Displayv);
        VBox.setMargin(Add, new Insets(10));
        VBox.setMargin(update, new Insets(10));
        VBox.setMargin(Delet, new Insets(10));
        VBox.setMargin(search, new Insets(10));
        VBox.setMargin(Display, new Insets(10));
        VBox.setMargin(back, new Insets(10));

        VBox.setMargin(Addv, new Insets(10));
        VBox.setMargin(updatev, new Insets(10));
        VBox.setMargin(Deletv, new Insets(10));
        VBox.setMargin(searchv, new Insets(10));
        VBox.setMargin(Displayv, new Insets(10));

        BorderPane root = new BorderPane();

        root.setLeft(v);
        root.setRight(r);

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(Page_of_Patient.class.getResource("Page_of_Patient.css").toExternalForm());

        primaryStage.setTitle("Page_of_Patient");
        primaryStage.setScene(scene);
        primaryStage.show();

        Add.setOnMouseClicked(e -> {

            primaryStage.close();
            new AddNewPatient().start(primaryStage);

        });

        update.setOnMouseClicked(e -> {
            primaryStage.close();
            new UpdateNewPatient().start(primaryStage);
        });
        Delet.setOnMouseClicked(e -> {
            primaryStage.close();
            new DeletPatient().start(primaryStage);

        });
        search.setOnMouseClicked(e -> {
            primaryStage.close();
            new SearchONPatient().start(primaryStage);

        });
        Display.setOnMouseClicked(e -> {
            primaryStage.close();
            new DisplayAllPatient().start(primaryStage);

        });

        Addv.setOnMouseClicked(e -> {

            primaryStage.close();
            new AddNewVisistorPatient().start(primaryStage);

        });

        updatev.setOnMouseClicked(e -> {
            primaryStage.close();
            new UpdataVisitorPatient().start(primaryStage);
        });
        Deletv.setOnMouseClicked(e -> {
            primaryStage.close();
            new DeletVisitorPatient().start(primaryStage);

        });
        searchv.setOnMouseClicked(e -> {
            primaryStage.close();
            new SearchVisitorPatient().start(primaryStage);

        });
        Displayv.setOnMouseClicked(e -> {
            primaryStage.close();
            new DisplayAllVisitorPatient().start(primaryStage);

        });

        back.setOnMouseClicked(e -> {
            primaryStage.close();
            new Adminfx().start(primaryStage);

        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
