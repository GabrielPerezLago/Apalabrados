package com.gabriel.apalabrados.utils;

public class Juego {

    protected boolean isEqualsPalabras(String origin, String gamePal) {
        gamePal = gamePal.replaceAll(" ", "");
        if (origin == gamePal) {
            return true;
        }
        return false;
    }


}
