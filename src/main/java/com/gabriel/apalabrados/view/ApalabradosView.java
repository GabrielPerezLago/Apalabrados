package com.gabriel.apalabrados.view;

import com.gabriel.apalabrados.controller.ApalabradosController;
import com.gabriel.apalabrados.controller.interfaces.PalabrasController;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ApalabradosView {

    public FlowPane showPalabra(){
        ApalabradosController apalabradosController = new ApalabradosController();
        PalabrasController palabrasController = new PalabrasController();
        StringProperty hp = palabrasController.hiddenPalabraProperty();
        Label palabraLabel = new Label();
        palabraLabel.textProperty().bind(hp);
        palabraLabel.setWrapText(true);
        palabraLabel.setStyle("-fx-font-size: 80");

        FlowPane palabraFlowPane = new FlowPane();
        palabraFlowPane.setAlignment(Pos.CENTER);
        palabraFlowPane.getChildren().add(palabraLabel);

        return palabraFlowPane;
    }
}
