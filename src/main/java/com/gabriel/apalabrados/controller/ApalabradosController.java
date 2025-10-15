package com.gabriel.apalabrados.controller;

import com.gabriel.apalabrados.controller.interfaces.ApalabradosControllerInterface;
import com.gabriel.apalabrados.controller.interfaces.PalabrasController;
import com.gabriel.apalabrados.model.ApalabradosModel;
import com.gabriel.apalabrados.utils.Juego;

public class ApalabradosController extends Juego implements ApalabradosControllerInterface {
    private static final ApalabradosModel  apalabradosModel = new ApalabradosModel();
    private static final PalabrasController palabras = new PalabrasController();
    private String hiddenpal = "";
    private String newHidden = "";
    private int intentos;



    @Override
    public void juego(char letra) {
        boolean igual;
        String palabra = palabras.getPalabra();
        if (newHidden.length() != 0) {
            igual = super.isEqualsPalabras(palabra, newHidden);
        } else {
            igual = super.isEqualsPalabras(palabra, hiddenpal);
        }

        if (igual) {

        }

    }

    public String getHiddenPalabra() {
        PalabrasController palabras = new PalabrasController();
        if (this.hiddenpal.length() <= 0 ){
            this.hiddenpal = palabras.getHiddenPalabra().toLowerCase();
        }
        return this.hiddenpal;
    }

}

