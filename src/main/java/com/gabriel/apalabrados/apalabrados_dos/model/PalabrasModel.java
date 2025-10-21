package com.gabriel.apalabrados.apalabrados_dos.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


import java.util.Random;

public class PalabrasModel {
    final static String[] Palabras = new String[]{"perro", "lagarto", "nuevo"};
    private String[] getPalabrasCopia = Palabras;
    private String palabra;
    public StringProperty hiddenPalabra = new SimpleStringProperty("");

    public PalabrasModel() {
        this.palabra = randomPalabra();
        this.hiddenPalabra.set(getHiddenPalabra());
    }

    private String randomPalabra() {
        int index = new Random().nextInt(getPalabrasCopia.length);
        return getPalabrasCopia[index];
    }

    public String getPalabra() {
        return this.palabra;
    }

    private String getHiddenPalabra() {

        if (hiddenPalabra.get().length() > 0) {
            return hiddenPalabra.get();
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            builder.append(" _ ");
        }

        hiddenPalabra.set(builder.toString());
        return hiddenPalabra.get();
    }

    public StringProperty hiddenPalabraProperty() {
        return hiddenPalabra;
    }

    public String getRandomPalabra() {
        return this.hiddenPalabra.get();
    }
    public void setHiddenPalabra(String hiddenPalabra) {
        this.hiddenPalabra.set(hiddenPalabra);
    }
}
