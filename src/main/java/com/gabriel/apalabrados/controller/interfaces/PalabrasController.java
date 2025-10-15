package com.gabriel.apalabrados.controller.interfaces;

import com.gabriel.apalabrados.model.PalabrasModel;
import com.gabriel.apalabrados.model.interfaces.PalabrasInterface;
import javafx.beans.property.StringProperty;

public class PalabrasController implements PalabarasControllerInterface {
    private static final PalabrasModel palabras = new PalabrasModel();

    @Override
    public String getPalabra() {
        return palabras.getPalabra();
    }

    @Override
    public String getHiddenPalabra() {
        return palabras.getHiddenPalabra();
    }

    public void setHiddenPalabra(String newHidden){
        palabras.setHiddenPalabra(newHidden);
    }

    public StringProperty hiddenPalabraProperty() {
        return palabras.hiddenPalabraProperty();
    }
}
