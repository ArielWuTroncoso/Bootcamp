package model;

import util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println(nombre + " | Edad: " + edad);
    }
}
