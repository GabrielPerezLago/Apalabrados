package com.gabriel.apalabrados.apalabrados_dos.model;

import com.gabriel.apalabrados.apalabrados_dos.utils.Juego;
import com.gabriel.apalabrados.apalabrados_dos.utils.LogManager;
import com.gabriel.apalabrados.apalabrados_dos.utils.PalabraUtils;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApalabradosModel extends Juego {
    private PalabraUtils palabraUtils;
    private LogManager log;

    public  ApalabradosModel() {
        this.palabraUtils = new PalabraUtils();
        this.log = new LogManager(ApalabradosModel.class.getName());
    }

    @Override
    public String LogicJuego(String palabra, String hidden, String inputPalabra) {
        try {

        } catch (Exception ex) {

        }


        return null;
    }

    @Override
    public Boolean equalsPalabras(String palabra, String inputPalabra) {
        if (palabra.equals(inputPalabra)) {
            return true;
        }
        return false;
    }

    @Override
    public List<Character> checkLeters(String palabra, String inputPalabra) {
        List<Character> letras = new ArrayList<>();
        for (int i = 0; i < inputPalabra.length(); i++) {
            for  (int j = 0; j < palabra.length(); j++) {
                if (inputPalabra.charAt(i) == palabra.charAt(j)) {
                    letras.add(palabra.charAt(i));
                }
            }
        }
        return letras;
    }

    @Override
    public Map<Integer, Character> getLetraPosition(String palabra, List<Character> letras) {
        Map<Integer, Character> letrasPosition = new HashMap<>();
        for(int i = 0; i < palabra.length(); i++) {
            for (Character letra : letras) {
                if (palabra.charAt(i) == letra) {
                    letrasPosition.put(i, letra);
                }
            }
        }
        return letrasPosition;
    }

    @Override
    public String chengeHiddenToLetra(Map<Integer, Character> letras, String hiddenPal) {
        String h = this.palabraUtils.filterSpaces(hiddenPal);
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < hiddenPal.length(); i++) {
            int finalI = i;
            letras.forEach((j, letra) -> {
                if (finalI == j) {
                    builder.append(" " + letra + " ");
                } else {
                    builder.append(" _ ");
                }
            });
        }
        return builder.toString();
    }

}
