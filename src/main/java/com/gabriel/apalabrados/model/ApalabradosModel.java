package com.gabriel.apalabrados.model;

import com.gabriel.apalabrados.model.interfaces.ApalabradosModelInteface;

import javax.management.StringValueExp;
import javax.swing.*;
import java.util.Scanner;

public class ApalabradosModel implements ApalabradosModelInteface {
    public char letra;

    public ApalabradosModel() {}

    @Override
    public String juego(String palabra, String hiddenPalabra, char letra) {
        if (inPalabra(palabra, letra)) {
           hiddenPalabra = this.parseHiddenLetra(palabra, hiddenPalabra, letra);
            return hiddenPalabra;
        }  else {
           System.out.println("La letra no esta en la palabra");
           return hiddenPalabra;
        }

    }

    public Boolean inPalabra(String palabra, char letra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                return  true;
            }
        }
        return false;
    }

    private String parseHiddenLetra(String palabra, String hiddenPalabra, char  letra) {
        StringBuilder sb = new StringBuilder();
        int pos = this.getLetraPossition(palabra, letra);
        String newHidden = this.changeHiddenLetter(hiddenPalabra, pos, letra);
        return newHidden;
    }

    private int getLetraPossition(String palabra , char letra) {
        int pos = 0;
        try {

            for (int i = 0; i < palabra.length(); i++) {
                if (letra == palabra.charAt(i)) {
                    pos = i;
                }
            }
        } catch (Exception e) {
            System.out.println("Error" +  e.getMessage());
        }
        return pos;
    }

    private String changeHiddenLetter(String hidden, int pos, char letra) {
        StringBuilder sb = new StringBuilder();
        hidden = hidden.replaceAll(" ", "");
        for (int i = 0; i <= hidden.length()-1; i++) {
            if (pos == i) {
                sb.append(" " + letra + " ");
            } else if(hidden.charAt(i) != '_') {
                sb.append(" " + hidden.charAt(i) + " ");
            }  else {
                sb.append(" _ ");
            }
        }
        return sb.toString();
    }
}
