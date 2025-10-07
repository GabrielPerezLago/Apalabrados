package com.gabriel.apalabrados.controller;

import com.gabriel.apalabrados.controller.interfaces.AbecedarioControllerInterface;
import com.gabriel.apalabrados.model.AbecedarioModel;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AbecedarioController implements AbecedarioControllerInterface {

    public static List<Character> getAbecedario () {
        AbecedarioModel abecedario = new  AbecedarioModel();
        return abecedario.getAbecedario();
    }
}
