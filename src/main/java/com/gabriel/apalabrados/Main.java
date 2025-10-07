package com.gabriel.apalabrados;

import com.gabriel.apalabrados.model.AbecedarioModel;
import com.gabriel.apalabrados.model.ApalabradosModel;
import com.gabriel.apalabrados.model.interfaces.PalabrasInterface;
import com.gabriel.apalabrados.view.AbecedarioView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.accessibility.AccessibleRelation;
import javax.swing.*;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        AbecedarioView abcPanel = new AbecedarioView();

        // Titulo Principal
        Label apalabradosTittle = new Label("Apalabrados");
        apalabradosTittle.setAlignment(Pos.CENTER);
        apalabradosTittle.setStyle("-fx-font-size: 80px; -fx-text-color: red");


        FlowPane letrasBox = abcPanel.getAbecedarioPanel();
        StackPane titulo = new StackPane();
        titulo.getChildren().add(apalabradosTittle);



        VBox root = new VBox();
        root.getChildren().addAll(titulo,letrasBox);

        Scene apalabradosScene = new Scene(root,700, 700);
        primaryStage.setTitle("Prueba");
        primaryStage.setScene(apalabradosScene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
        /*AbecedarioModel abecedario = new AbecedarioModel();
        List<Character> letras = abecedario.getAbecedario();

        ApalabradosModel apalabrados = new ApalabradosModel();
        for(char letra : letras){
            System.out.print(letra);
        }
        apalabrados.juego();*/


    }
}
