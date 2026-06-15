package model;


public class Persona {
    private String nombreCompleto;


    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombre() {
        return nombreCompleto;
    }
}