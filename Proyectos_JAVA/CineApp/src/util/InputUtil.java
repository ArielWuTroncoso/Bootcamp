package util;

import java.util.Scanner;


public class InputUtil {

    public static int pedirNumeroEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);

                // convierte lo que escribió el usuario a número
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                // si meten letras por error, el programa no se cae y pregunta otra vez
                System.out.println("Error: debes ingresar un número entero válido.");
            }
        }
    }


    public static String pedirTextoNoVacio(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);

            // trim limpia espacios antes y después del texto
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("Error: el texto no puede estar vacío.");
        }
    }
}