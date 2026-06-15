package Herencia;

public class Gato extends Animal {
     String color;

    public Gato (String nombre, int edad , String color) {
        super(nombre,edad);
        this.nombre = nombre;
        this.color=color;
    }

    public void maullar(){
        System.out.println(super.nombre + "Miau");
    }

}