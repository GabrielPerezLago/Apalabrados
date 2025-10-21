package com.gabriel.apalabrados.apalabrados_dos.view;

import com.gabriel.apalabrados.apalabrados_dos.controller.AbecedarioController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.lang.classfile.ClassBuilder;
import java.util.List;

public class AbecedarioView {
    private AbecedarioController abecedarioController;

    public AbecedarioView() {
        this.abecedarioController = new  AbecedarioController();
    }
    public FlowPane getAbecedarioView() {
        FlowPane abecedarioView = new FlowPane();
        List<Character> letras = abecedarioController.getAbecedario();
        for (Character l : letras) {
            Label letra = new Label(l.toString());
            letra.setStyle("-fx-text-fill: black; -fx-padding: 20px");
            abecedarioView.getChildren().add(letra);
        }
        abecedarioView.setAlignment(Pos.CENTER);
        abecedarioView.setStyle("-fx-padding: 20px");
        return abecedarioView;
    }

    public void changeColor(Label letra){
        letra.setStyle("-fx-text-fill: gray");
    }
}
