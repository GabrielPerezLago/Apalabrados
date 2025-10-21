package com.gabriel.apalabrados.apalabrados_dos.model;

import java.util.ArrayList;
import java.util.List;

public class AbecedarioModel {

    public List<Character> getAbecedario() {
        List<Character> abcdario = new ArrayList();
        for(char letra = 'a'; letra <= 'z'; letra++ ){
            abcdario.add(letra);
        }
        return abcdario;
    }
}
