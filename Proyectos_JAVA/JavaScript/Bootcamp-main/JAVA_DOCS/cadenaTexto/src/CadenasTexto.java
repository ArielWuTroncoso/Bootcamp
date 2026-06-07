import java.util.Scanner;

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Kathy";
        final String CONTRASENIA = "1234";
        System.out.println(" Mi nombre es " + nombre);
        System.out.println("Longitud: " + nombre.length());
        System.out.println("Caracter: " + nombre.charAt(3));
        System.out.println("Minúscula:" + nombre.toLowerCase());
        System.out.println("Mayúscula:" + nombre.toUpperCase());
        System.out.println(nombre.contains("hy"));

        System.out.println(nombre == "Kathy");
        System.out.println(nombre.equals("KATHY"));

        // PROMPT de JAVA
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa una contraseña: ");
        String contraseniaIngresada = consola.nextLine();
        System.out.println(CONTRASENIA.equalsIgnoreCase(contraseniaIngresada));



    }
}