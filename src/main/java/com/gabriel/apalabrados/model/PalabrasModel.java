package com.gabriel.apalabrados.model;

import com.gabriel.apalabrados.model.interfaces.PalabrasInterface;

import java.util.Random;

public class PalabrasModel implements PalabrasInterface {
    final static String[] PALABRAS = {"perro", "gato", "pato" };

    public String getPalabras(){
        int index  = new Random().nextInt(PALABRAS.length);
        return  PALABRAS[index];
    }
}
