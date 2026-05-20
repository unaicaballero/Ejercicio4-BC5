package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Botones
        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");

        // HBox para los dos primeros botones
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(boton1, boton2);
        hbox.setAlignment(Pos.CENTER_LEFT);

        // VBox para agregar el tercer botón debajo
        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(hbox, boton3);
        vbox.setAlignment(Pos.CENTER_LEFT);

        // Escena
        Scene scene = new Scene(vbox, 400, 200);

        // Ventana
        stage.setTitle("Ejercicio 4");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}