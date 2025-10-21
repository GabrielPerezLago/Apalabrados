package com.gabriel.apalabrados.apalabrados_dos.view;

import com.gabriel.apalabrados.apalabrados_dos.controller.PalabrasController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class PalabraView {

    public Label hidenPalabra() {
        PalabrasController palContr = new PalabrasController();
        Label hpLabel = new Label(palContr.getHiidenPalabra());
        hpLabel.setStyle("-fx-font-size: 40; -fx-padding: 30px");
        hpLabel.setAlignment(Pos.CENTER);
        return hpLabel;
    }
}
