package udem.edu.co.model.entity;

import udem.edu.co.model.abs.Plantas;

public class Moras extends Plantas {
    private String nombre;
    private String color;
    private int EDAD = 6;

    @Override
    public String toString() {
        return "<Moras>\n" +
                "  <nombre>" + nombre + "</nombre>\n" +
                "  <color>'" + color + "</color>\n" +
                "  <EDAD>" + EDAD + "</EDAD>\n" +
                "</Moras>";
    }

    public Moras(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }
}
