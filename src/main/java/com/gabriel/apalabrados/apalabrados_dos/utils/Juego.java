package com.gabriel.apalabrados.apalabrados_dos.utils;

import java.util.List;
import java.util.Map;

public abstract class Juego {
    public void  StartJuego(String palabra) {};

    public abstract String LogicJuego(String palabra, String hidden, String inputPalabra);

    public abstract Boolean equalsPalabras (String palabra, String inputPalabra);

    public abstract List<Character> checkLeters(String palabra, String inputPalabra);

    public abstract Map<Integer, Character> getLetraPosition(String palabra, List<Character> letras);

    public abstract String chengeHiddenToLetra(Map<Integer, Character> letras, String hiddenPal);
 }
