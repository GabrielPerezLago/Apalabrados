package com.gabriel.apalabrados.model;

import com.gabriel.apalabrados.model.interfaces.ApalabradosModelInteface;

import javax.swing.*;
import java.util.Scanner;

public class ApalabradosModel implements ApalabradosModelInteface {
    private String palabra;
    public char letra;

    public ApalabradosModel() {}

    @Override
    public void juego() {
        int contador = 0;
        PalabrasModel randomWord = new PalabrasModel();

        this.palabra = randomWord.getPalabra();
        Scanner kb = new Scanner(System.in);

        while (contador < palabra.length()) {
            System.out.println("Dame una letra");
            letra = kb.next().charAt(0);
            if (inPalabra(palabra, letra)) {
                System.out.println("La letra esta en la palabra");
                contador++;
            } else {
                System.out.println("La letra NO esta en la palabra");
            }
        }

        if (contador == palabra.length()) {
            System.out.println("Enorabuena , has acertado la palabra , la palabra era : "  +  palabra );
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
}
