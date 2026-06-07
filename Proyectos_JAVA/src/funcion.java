import java.util.Scanner;


// funcion principal

public class funcion {

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//CREAR FUNCION QUE IMPRIMA UN MENSAJE:

    static void impresion(String mensaje){
        System.out.println("mensaje: "+ mensaje);

    }

    //CREAR FUNCION SUMAR
    // SI LE OTORGO UNA PROPIEDAD COMO int ENTONCES LA F DEVUELVE ALGO (NUMERO)
    // SI SOLO TIENE VOID ENTONCES SIRVE PARA EJECUTAR ACCIONES

    static int sumar(int a, int b){
        return a + b;
    }

    //CREAR FUNCION SIN PARÁMETROS

    static void saludarC25(){
        System.out.println("Hola Cohorte 25 ");

    }

    //CREAR FUNCION PAR

    // Crear una función esPar
    static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }






    // FUNCION:
    public static void main(String[] args) {
        // Luego de Scanner esta el nombre del parámetro a usar.
        Scanner sc = new Scanner(System.in);
        //FUNCION
        System.out.println("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        impresion(mensajeIngresado);

        //FUNCION SUMAR
        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Resultado: " + sumar(num1, num2));

        saludarC25();

        System.out.printf("Su número %d es par: %b \n", num1, esPar(num1));



    }
}


/*

import java.util.Scanner;

public class Funciones {
    // Crear nueva función que imprima un mensaje
    static void impresion(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    // Crear función sumar
    static int sumar(int a, int b){
        return a + b;
    }

    // Crear función sin parametros
    static void saludarC25(){
        System.out.println("Hola Cohorte 25");
    }

    // Crear una función esPar
    static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        impresion(mensajeIngresado);

        System.out.print("Ingrese un número: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();

        System.out.println("Resultado: "+ sumar(num1, num2) );

        System.out.printf("Su número %d es par: %b \n", num1, esPar(num1));





        saludarC25();

    }

}
 */


