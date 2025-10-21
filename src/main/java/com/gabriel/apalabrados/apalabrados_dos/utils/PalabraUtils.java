package com.gabriel.apalabrados.apalabrados_dos.utils;

public class PalabraUtils {

    public String filterSpaces(String hidden) {
        hidden = hidden.replaceAll(" ", "");
        return hidden;
    }
}
