import java.util.Scanner;
import java.util.function.IntBinaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class calculadoraJava{


    static void menu(Scanner Scan) {

        while (true) {
            System.out.println("#### Bienvenido a su Calculadora: ");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");



            System.out.println("Ingrese una opción: ");
            int opcion = Scan.nextInt();

            switch (opcion){
                case 1: //LLAMAR LA CLASE Y PONER "::" PARA LLAMAR UN METODO CÓMO PARAMETRO
                    System.out.println(ejecutarAccion(calculadoraJava::suma));
                    break;
                case 2:
                    System.out.println(ejecutarAccion(calculadoraJava::resta));
                    break;
                case 3:
                    System.out.println(ejecutarAccion(calculadoraJava::multiplicar));
                    break;
                case 4:
                    System.out.println(ejecutarAccion(calculadoraJava::dividir));
                    break;
                case 5:
                    System.out.println("Saliendo");
                    return;
            }
        }
    }

    static int suma(int a, int b){

        return a + b;
    }

    static int resta(int a, int b){

        return a - b;
    }

    static int multiplicar(int a, int b){

        return a * b;
    }

    static int dividir(int a, int b){

        return a / b;
    }


    static int pedirNumero(){ //especificar donde iría "void" (vacío) por lo que entregará de vuelta el método
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese un número por favor: ");
        return Scan.nextInt();


    }

    static int ejecutarAccion(IntBinaryOperator operacion){ // funct IntBinaryOPerator define a operacion cómo un párametro
                                                            // que permite almacenar dos variables int.

        int a = pedirNumero();
        int b = pedirNumero();

        return operacion.applyAsInt(a, b);
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        //EN EL PARAMETRO DENTRO DEL MAIN SÓLO VA EL NOMBRE DE SCANNER
        menu(Scan);

    }



}


