package util;

import java.util.Scanner;

public class InputUtil {

    // SCANNER ÚNICO PARA TODO EL PROGRAMA
    private static Scanner scan = new Scanner(System.in);


    // MÉTODO PARA LEER NÚMEROS ENTEROS (int)
    public static int leerInt() {

        while (true) {
            try {
                return Integer.parseInt(scan.nextLine());

            } catch (NumberFormatException error) {
                // NumberFormatException : “Error cuando intentas convertir texto a número y el formato no es válido”
                // "error" es una variable que guardará la info de concretarse el error
                System.out.println("Ingrese un número válido:");
            }
        }
    }

    public static int leerEdad() {

        while (true) {
            int edad = leerInt();

            if (edad > 0) {
                return edad;
            }

            System.out.println("La edad debe ser mayor a 0:");
        }
    }


public static String leerString() {

    while (true) {

        try {

            String texto = scan.nextLine();

            // VALIDAMOS QUE NO ESTÉ VACÍO
            if (texto.isBlank()) { // isBlank() verifica si el texto está vacío

                System.out.println("Ingrese un texto válido:");
                continue;
            }
            return texto;

        } catch (Exception e) {
            System.out.println("Error al ingresar texto");
        }
    }
}

}