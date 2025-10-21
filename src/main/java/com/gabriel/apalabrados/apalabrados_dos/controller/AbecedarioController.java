package com.gabriel.apalabrados.apalabrados_dos.controller;

import com.gabriel.apalabrados.apalabrados_dos.model.AbecedarioModel;

import java.util.List;

public class AbecedarioController {
    public List<Character> getAbecedario () {
        AbecedarioModel abecedario = new  AbecedarioModel();
        return abecedario.getAbecedario();
    }
}
