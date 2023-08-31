package udem.edu.co.controller;

import udem.edu.co.model.entity.Lechugas;
import udem.edu.co.model.entity.Moras;
import udem.edu.co.model.entity.Zanahorias;
import udem.edu.co.model.interfaces.Especies;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    public static void imp(){
        List<Especies> lista = new ArrayList<>();
        lista.add(new Lechugas("Romana","Verde"));
        lista.add(new Moras("mora","azul"));
        lista.add(new Zanahorias("baby","naranja"));
        System.out.printf(lista.toString());
    }
}
