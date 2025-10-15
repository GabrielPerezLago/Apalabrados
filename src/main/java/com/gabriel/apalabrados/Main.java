package com.gabriel.apalabrados;

import com.gabriel.apalabrados.view.AbecedarioView;
import com.gabriel.apalabrados.view.ApalabradosView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        AbecedarioView abcView = new AbecedarioView();
        ApalabradosView apalabradosView = new ApalabradosView();

        // Titulo Principal
        Label apalabradosTittle = new Label("Apalabrados");
        apalabradosTittle.setAlignment(Pos.CENTER);
        apalabradosTittle.setStyle("-fx-font-size: 80px;");
        FlowPane tituloPanel = new FlowPane();
        tituloPanel.setAlignment(Pos.CENTER);
        tituloPanel.getChildren().add(apalabradosTittle);

        FlowPane palabraPanel = apalabradosView.showPalabra();
        FlowPane letrasPanel = abcView.getAbecedarioPanel();

        VBox juegoContainer = new VBox();
        juegoContainer.setAlignment(Pos.CENTER);
        juegoContainer.getChildren().addAll(palabraPanel, letrasPanel);

        VBox root = new VBox();
        root.getChildren().addAll(tituloPanel, juegoContainer);

        Scene apalabradosScene = new Scene(root,700, 700);
        primaryStage.setTitle("Prueba");
        primaryStage.setScene(apalabradosScene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
