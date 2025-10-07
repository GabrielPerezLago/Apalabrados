package com.gabriel.apalabrados.model;

import com.gabriel.apalabrados.model.interfaces.AbecedarioModelnterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AbecedarioModel implements AbecedarioModelnterface {

    @Override
    public List<Character> getAbecedario() {
        List<Character> abcdario = new ArrayList();
        for(char letra = 'a'; letra <= 'z'; letra++ ){
            abcdario.add(letra);
        }
        return abcdario;
    }
}
