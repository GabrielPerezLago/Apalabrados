package com.gabriel.apalabrados.view;

import com.gabriel.apalabrados.controller.AbecedarioController;
import com.gabriel.apalabrados.controller.ApalabradosController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

import java.awt.*;
import java.util.List;

public class AbecedarioView {

    public FlowPane getAbecedarioPanel(){
        AbecedarioController  abecedarioController = new AbecedarioController();
        List<Character> letras = abecedarioController.getAbecedario();
        ApalabradosController apalabradosController = new ApalabradosController();
        FlowPane letrasBox = new FlowPane();
        letrasBox.setAlignment(Pos.CENTER);
        for (Character letra : letras) {
            Button boton = new Button(String.valueOf(letra));
            boton.setStyle("-fx-font-size: 20px");
            boton.setOnAction(e -> apalabradosController.juego(letra));
            letrasBox.getChildren().add(boton);
        }
        letrasBox.setStyle("-fx-padding: 100px;");
        return  letrasBox;
    }
}
