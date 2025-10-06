package com.gabriel.apalabrados;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane firstStack = new StackPane();
        StackPane secondStack = new StackPane();

        Scene sceneOne = new Scene(firstStack ,400, 400);
        Scene  sceneTwo = new Scene(secondStack,400,400);

        Button btn = new Button();
        btn.setText("Inicio");
        btn.setOnAction(e -> primaryStage.setScene(sceneTwo) );


        Label label = new Label();
        label.setText("Esto es otra prueba");
        Button btnClose = new Button("Cerrar");
        btnClose.setOnAction(e -> primaryStage.close() );

        firstStack.getChildren().add(btn);
        secondStack.getChildren().add(label);
        secondStack.getChildren().add(btnClose);

        primaryStage.setTitle("Prueba");
        primaryStage.setScene(sceneOne);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
