package Polimorfismo;

public class Animal {
    // Atributos
    public String nombre;
    public int edad;

    public Animal(String nombre, int edad) {

        this.nombre =nombre;
        this.edad=edad;
    }
    public void comer(){

        System.out.println("Esta comiendo...");
    }

    // Método que usaremos para sobrescribir en clases hijas usando @Overrride
    public void hacerSonido(){
        System.out.println("Haciendo sonido...");
    }


}
