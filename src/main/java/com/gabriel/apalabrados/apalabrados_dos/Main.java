package com.gabriel.apalabrados.apalabrados_dos;

import com.gabriel.apalabrados.apalabrados_dos.view.AbecedarioView;
import com.gabriel.apalabrados.apalabrados_dos.view.JuegoView;
import com.gabriel.apalabrados.apalabrados_dos.view.PalabraView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        JuegoView juegoView = new JuegoView();
        PalabraView palabraView = new PalabraView();
        AbecedarioView abecedarioView = new AbecedarioView();


        Label tittle = new Label("Apalabrados");
        tittle.setAlignment(Pos.CENTER);
        FlowPane titulo = new FlowPane();
        titulo.setAlignment(Pos.CENTER);
        titulo.setStyle("-fx-padding: 40px; -fx-font-size: 50px");
        titulo.getChildren().add(tittle);

        Label hpLabel = palabraView.hidenPalabra();
        HBox  juegoPane = juegoView.inputLabel();
        FlowPane letras = abecedarioView.getAbecedarioView();

        VBox juegoContainer = new VBox();
        juegoContainer.setAlignment(Pos.CENTER);
        juegoContainer.setStyle("-fx-padding: 40px; -fx-font-size: 20px");
        juegoContainer.getChildren().addAll( hpLabel, juegoPane,  letras);

        VBox root =  new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(titulo ,juegoContainer);

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Apalabrados");

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
