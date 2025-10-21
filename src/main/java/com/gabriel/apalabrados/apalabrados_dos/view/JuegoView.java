package com.gabriel.apalabrados.apalabrados_dos.view;


import com.gabriel.apalabrados.apalabrados_dos.controller.ApalabradosController;
import com.gabriel.apalabrados.apalabrados_dos.model.ApalabradosModel;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class JuegoView {
    private ApalabradosController  apalabradosController;

    public JuegoView(){
        this.apalabradosController = new ApalabradosController();
    }

    private TextField inputPalabra() {
        TextField input = new TextField();
        input.setPromptText("Ingrese palabra");
        input.setAlignment(Pos.CENTER);
        input.setStyle("-fx-font-size: 20; -fx-padding: 20; -fx-border-radius: 50px; -fx-margin: 20px 0;");
        return input;
    }

    private Button botonPalabra() {
        Button botonPalabra = new Button("Enviar");
        botonPalabra.setStyle("-fx-font-size: 15; -fx-padding: 12");
        return botonPalabra;
    }

    public HBox inputLabel() {

        TextField input = this.inputPalabra();

        Button btnPal = this.botonPalabra();
        btnPal.setOnAction(e -> {
            String palabra =  input.getText();
            this.apalabradosController.juego(palabra);
        });

        HBox inputLabel = new HBox();
        inputLabel.setAlignment(Pos.CENTER);
        inputLabel.getChildren().addAll(input, btnPal);
        return inputLabel;
    }





}
