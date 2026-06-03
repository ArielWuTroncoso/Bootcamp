import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tarea1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    /*
    # Ejercicios Básicos

    ## 1. Calculadora de Edad

    Solicita:

    - nombre
    - año de nacimiento

    Muestra:

    - saludo personalizado
    - edad aproximada

    Ejemplo:

    Ingresa tu nombre: Ana
    Ingresa tu año de nacimiento: 2000

    Hola Ana, tienes aproximadamente 26 años.

     */
        //FIJARSE EN MAYUS EN LAS CLASES
        Scanner consola = new Scanner(System.in);
    /*
        System.out.println("Ingrese su nombre: ");
        String nombre = consola.nextLine();

        System.out.println("Ingrese su año de nacimiento: ");
        int nacimiento = consola.nextInt();

        int edad = 2026 - nacimiento;
    // Se usan + para concadenar
        System.out.println("Su nombre es "+ nombre + " y tiene: " + edad + " años");

        /*
        ## 2. Conversor de Temperatura

    Solicita una temperatura en Celsius y conviértela a Fahrenheit.

    Fórmula:
        F = (C * 9/5) + 32
         */
/*
    System.out.println("Ingrese temperatura en grados celcius: ");
    int celcius = consola.nextInt();

    int farent = ((celcius * 9/5) + 32);

    System.out.print("La temperatura en grados farentheid es : "+ farent + " grados");

    /*

    ## 3. Área y Perímetro de un Rectángulo

    Pide:

    - base
    - altura

    Calcula:

    - área
    - perímetro
     */
        /*
        System.out.print("Ingrese base de rectagulo en cm: ");
        int base = consola.nextInt();

        System.out.print("Ingrese altura de rectagulo en cm: ");
        int altura = consola.nextInt();

        int área = (base*altura);
        int perímetro = (base*2+altura*2);

        System.out.print( "El área y base del rectángulo es: "+ área+ " y " + perímetro
        );

    */


        /*
        ## 4. Calculadora de Descuento

        Solicita:

        - precio de un producto
        - porcentaje de descuento

        Muestra:

        - descuento aplicado
        - precio final
         */

        /*
        System.out.print("Ingrese precio del producto: ");
        int precio = consola.nextInt();

        System.out.print("Ingrese porcentaje de descuento a aplicar: ");
        int porcentaje = consola.nextInt();

        int descuento = (precio*porcentaje)/100;
        int total= precio - descuento;
        System.out.print("El precio con descuento aplicado es: $"+ total);
        */
      /*
            # Condicionales

        ## 5. Número Positivo o Negativo

        Pide un número y determina:

        - positivo
        - negativo
        - cero
     */
    /*


        while (true) {

            System.out.print("Ingrese un número (o una letra para salir): ");
            String entrada = consola.nextLine();

            try {
                int numero = Integer.parseInt(entrada);

                if (numero > 0) {
                    System.out.println("El número es positivo");
                } else if (numero == 0) {
                    System.out.println("El número es cero");
                } else {
                    System.out.println("El número es negativo");
                }

            } catch (NumberFormatException e) {
                System.out.println("Se ingresó una letra. Programa finalizado.");
                break;
            }
        }


        /*
        ## 6. Mayor de Edad

        Solicita la edad y muestra:

        - “Mayor de edad”
        - “Menor de edad”
         */
        /*


        System.out.print("Ingrese su edad: ");
        int edad = consola.nextInt();

        if (edad > 18){
            System.out.print("Mayor de edad ");

        }else{
            System.out.print("Menor de edad");
        }
        */

    /*
        ## 7. Número Par o Impar

        Solicita un número y usa el operador `%`.
     */

        /*


        System.out.print("Ingrese un número: ");
        int num = consola.nextInt();
        int numero= num%2;

        if (numero == 0){
            System.out.print("Número par ");

        }else{
            System.out.print("Número impar");
        }
        */



        /*
        9. Calculadora Simple

        Solicita:

        número 1

        número 2

        operador ( + , , , /)

        usa if o switch
         */
    /*
    menu: //añadiendo una Label (etiqueta) a While para que pueda romperlo con break menu;
        while (true) {

            System.out.println("#### Bienvenido a su calculadora ####");
            System.out.println("1) Sumar ");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar ");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");


            System.out.println("Ingrese su opción: ");


            int opcion;
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = consola.nextInt();
                    int resultado = (num1 + num2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    resultado = (num1 - num2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    resultado = (num1 * num2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = consola.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = consola.nextInt();
                    if (num2 != 0) {
                        resultado = (num1 / num2);
                        System.out.println("El resultado es: " + resultado);
                    } else {
                        System.out.println("Ingrese un divisor diferente de 0");
                    }
                    break;

                case 5:
                    break menu;
            }
        }


    /*
    ## 10. Clasificador de Notas

    Pide una nota del 1 al 7 y muestra:



      Rango	Resultado
      1.0 - 3.9	Reprobado
      4.0 - 5.9	Aprobado
      6.0 - 7.0	Excelente
        */

    /*
        System.out.println("Ingrese una nota: ");
        float nota =consola.nextFloat();

        if (nota >= 6.0){
            System.out.println("Excelente");
        } else if (nota >= 4.0) {
            System.out.println("Aprobado");
        } else if (nota >= 1.0){
            System.out.println("Reprobado");
        }
    */


        /*

        # String

        ## 11. Contador de Letras

        Solicita un nombre y muestra cuántos caracteres tiene usando:

        ```
        texto.length()
        ```
         */
        /*
        System.out.println("Ingrese un Nombre: ");
        String nombre = consola.next();
        System.out.println(nombre.length());// length entrega cantidad de letras de un String.
        */


        /*
        ## 12. Iniciales del Nombre

        Solicita:

        - nombre
        - apellido

        Muestra las iniciales.

        Ejemplo:

        Juan Pérez
        JP
         */

        /*

        System.out.println("Ingrese un Nombre: ");
        String nombre2= consola.next();
        System.out.println("Ingrese un Apellido: ");
        String apellido= consola.next();
        // char entrega una letra, charAt entrega un char determinado.
        System.out.print(nombre.charAt(0));
        System.out.print(apellido.charAt(0));
        */


        /*

        ## 13. Verificador de Contraseña

        Pide una contraseña y verifica si es:

        ```
        "java123"
        ```

        Usa:

        ```
        equals()
        ```
         */
        /*
        while (true) {//fijarse de no poner un break dentro del while
            System.out.println("Ingrese contraseña: ");
            String contraseña = consola.next();
            if (contraseña.equals("java123")) {
                System.out.println("Acceso concedido");
                break;

            } else System.out.println("Contraseña incorrecta");

        }

        /*

        ## 14. Convertidor de Texto

    Solicita una frase y muestra:

    - mayúsculas
    - minúsculas

        System.out.println("Ingrese una frase: ");
        String frase = consola.next();
        String minus= frase.toLowerCase();
        String mayus= frase.toUpperCase();
        System.out.println(minus +", "+mayus);

        */

        /*
        # Bucles

        ## 15. Contador del 1 al 10

        Usa `for`.
         */


        /*
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);

        }

        /*
        ## 16. Tabla de Multiplicar

        Solicita un número y muestra su tabla del 1 al 10.

        Ejemplo:
         */
        /*
        System.out.println("Ingrese un número a multiplicar: ");
        int num3=consola.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            int multi = num3*i;
            System.out.println(multi);


        }

        /*
        ## 17. Suma de Números

        Solicita un número `N` y suma desde 1 hasta `N`.

        Ejemplo:
         */

        /*
        System.out.println("Ingrese un número límite, para sumar en secuencia: ");
        int num4=consola.nextInt();
        int sumando=0;
        for (int i = 0; i <= num4 ; i++) {

            int totalsumando= i;
            System.out.println(i);;
            sumando += totalsumando;

        }
        System.out.println("Suma total: "+ sumando);

        /*
         ## 18. Contador de Pares

        Muestra todos los números pares entre 1 y 100.

         */

        System.out.println("Total números pares entre 1 y 100: ");

        for (int i = 0; i <= 100 ; i++) {
            if(i %2 == 0){

                System.out.println(i);
            }
        }


        /*

        ## 19. Adivina el Número

        El programa tiene un número fijo:

        ```
        intsecreto=7;
        ``
        El usuario debe adivinar usando un `while`.
         */
        /*
        int numElegido=0; //while me permite nombrar con un cero a una var y no interpretarla en la condición
        while(numElegido != 7) {
            System.out.println("Ingrese el número ganador :");
                numElegido = consola.nextInt();
        }


        /*
        ## 20. Menú Interactivo

        Crea un menú:

        ```
        1. Saludar
        2. Mostrar fecha ficticia
        3. Salir
        ```

        El programa debe repetirse hasta elegir “Salir”.

         */
        menu2:
            while (true) {

                System.out.println("#### Bienvenido a información ####");
                System.out.println("1) Saludar ");
                System.out.println("2) Fechas");
                System.out.println("3) Salir ");

                System.out.println("Ingrese su opción: ");

                int opcion2;
                opcion2 = consola.nextInt();

                    switch(opcion2){
                        case 1:
                            System.out.println("Muy Buen día estimad@");
                            break;
                        case 2:
                            System.out.println("Hoy es: 18 de septiembre de 2100");
                            break;
                        case 3:
                            System.out.println("Adiós");
                            break menu2;
                    }
        }


    }}