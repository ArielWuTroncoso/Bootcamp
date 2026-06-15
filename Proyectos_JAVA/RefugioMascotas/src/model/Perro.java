package model;


import interfaces.Entrenable; //IMPORTAMOS CLASS DESDE PACKAGE interfaces.
import interfaces.Adoptable;
public class Perro extends Mascota implements Adoptable, Entrenable {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {

        System.out.println(nombre + " dice: Guau 🐶");
    }

    @Override
    public String datosAdopcion() {//MÉTODO DE INTERFACE "ADOPTABLE"
        return "Perro " + nombre + " listo para adopción";
    }

    @Override
    public void entrenar() { //MÉTODO DE LA INTERFACE "ENTRENABLE"
        System.out.println(nombre + " ha sido entrenado 🐾");
    }
}
