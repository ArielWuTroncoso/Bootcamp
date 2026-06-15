package Abstracción;

class Gato extends Animal {
     String color;

    public Gato (String nombre, int edad , String color) {
        super(nombre,edad);
        this.nombre = nombre;
        this.color=color;
    }


    void hacerSonido(){
        System.out.println("Miau");
    }

}