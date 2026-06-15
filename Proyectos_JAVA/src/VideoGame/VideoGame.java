package VideoGame;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoGame {

    // ATRIBUTOS
    private String nombre;
    private String genero;
    private int precio;

    //ATRIBUTOS GENERADOS POR GETTER Y SETTER (ENCAPSULACIÓN)
    public String getNombre() {

        return nombre;
    }

    public String getGenero() {

        return genero;
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {

        if (precio <= 0) {
            System.out.println("Precio inválido");
        } else {
            // GUARDAMOS EL PRECIO EN EL ATRIBUTO DEL OBJETO
            this.precio = precio;

            System.out.println("Precio: " + precio);
        }
    }

    //PARTE 2: CON CONSTRUCTOR
    public VideoGame(String nombre, String genero, int precio) {

        //Ahora constructor
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
    }

    public void showInfo() {

        //Usamos \n PARA QUE SE VEA EN COLUMNA
        // MOSTRAMOS LA INFORMACIÓN GUARDADA EN EL OBJETO
        // USAMOS getPrecio() PORQUE precioInput SOLO EXISTE EN PreciosInt()

        System.out.println();

        System.out.println("\nNombre: " + getNombre() +
                        " \ngenero: " + getGenero() +
                        " \nPrecio: " + getPrecio()
        );
    }

    public void PreciosInt() {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nIngrese el precio del juego: " + getNombre());

        // VARIABLE LOCAL QUE RECIBE EL PRECIO INGRESADO
        int precioInput = scan.nextInt();

        // ENVIAMOS EL PRECIO AL SETTER PARA VALIDARLO Y GUARDARLO
        setPrecio(precioInput);
    }
    ;

}