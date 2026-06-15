package model;

import interfaces.Adoptable;
//IMPORTAMOS métodos DE PACKAGE "interfaces" por medio de "implements"
public class Gato extends Mascota implements Adoptable {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // ESTE MÉTODO PERTENECE A LA CLASS ABSTRACT DE "Mascota" Y AQUÍ LE AÑADIMOS UNA FUNCIÓN
    //LO MISMO SE HARÁ DONDE CLASS "Perro" Y SIRVEN PARA AHORRAR CÓDIGO
    @Override
    public void hacerSonido() {

        System.out.println(nombre + " dice: Miau 🐱");
    }

    //AQUÍ USAMOS MÉTODO DE INTERFACE
    @Override
    public String datosAdopcion() {

        return "Gato " + nombre + " disponible para adopción";
    }
}
