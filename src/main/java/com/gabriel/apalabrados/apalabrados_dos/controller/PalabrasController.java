package com.gabriel.apalabrados.apalabrados_dos.controller;

import com.gabriel.apalabrados.apalabrados_dos.model.PalabrasModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PalabrasController {
    private PalabrasModel palabrasModel;
    private String palabra;
    public StringProperty hiidenPalabra ;

    public PalabrasController() {
        this.palabrasModel = new PalabrasModel();
        this.palabra = palabrasModel.getPalabra();
        this.hiidenPalabra = this.palabrasModel.hiddenPalabraProperty();

    }

    public String getHiidenPalabra() {
        return  hiidenPalabra.get();
    }

    public void setHiddenPalabra(String newHidden){
        palabrasModel.setHiddenPalabra(newHidden);
    }

}
