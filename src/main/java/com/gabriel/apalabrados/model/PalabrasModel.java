package com.gabriel.apalabrados.model;

import com.gabriel.apalabrados.model.interfaces.PalabrasInterface;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Random;

public class PalabrasModel {
    final static String[] PALABRAS = {"perro", "gato", "pato" };
    private String palabra;
    public StringProperty hiddenPalabra = new SimpleStringProperty("");

    public PalabrasModel() {
        this.palabra = this.randomPalabra();
        hiddenPalabra.set(getHiddenPalabra());
    }

    private String randomPalabra() {
        int index  = new Random().nextInt(PALABRAS.length);
        return PALABRAS[index];

    }

    public String getHiddenPalabra(){
        StringProperty hp = new  SimpleStringProperty();
        if (hiddenPalabra.get().length() > 0) {
            hp = hiddenPalabra;
            return hp.get();
        }

        StringBuilder pal = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            pal.append(" _ ");
        }
        hp.set(pal.toString());
        return hp.get();
    }

    public String getPalabra() {
        return palabra;
    }

    public void setHiddenPalabra(String hiddenpalabra) {
        hiddenPalabra.set(hiddenpalabra);
    }

    public StringProperty hiddenPalabraProperty() {
        hiddenPalabra = new SimpleStringProperty(hiddenPalabra.get());
        return hiddenPalabra;
    }
}
