package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Persona { //CREANDO CLASS "Cliente" CON HERENCIA DE CLASS "Persona"
    private List<Mascota> mascotas = new ArrayList<>();//LISTA PARA AÑADIR MASCOTAS

    public Cliente(String nombre) {//Constructor de Cliente class
        super(nombre);
    }

    public void agregarMascota(Mascota m) { //Método para añadir a mascotas a lista "mascotas"
        //Al ser void, no devuelve nada

        mascotas.add(m);
    }
    // MASCOTA ES EL FORMATO O INTERFACE (CÓMO STRING,INT...) AHORA USADO COMO LA LISTA
    // Y "m" ES LA VARIABLE DONDE SE AÑADIRÁN DATOS HACÍA LA LISTA "mascotas"

    public List<Mascota> getMascotas() { // Mostrando la lista

        return mascotas;
    }
}
