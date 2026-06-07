
import java.util.Scanner;

public class ejemploScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = entrada.nextInt(); // 25\n
        System.out.print("Ingresa otro númerp: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresa un nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Resultado: " + num + ", " + nombre + " y " + num1);
    }
}
