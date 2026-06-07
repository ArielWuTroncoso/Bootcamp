
/*
## Objetivo

Crear un programa en Java que permita administrar una lista de frutas utilizando funciones (métodos) para organizar el código.

---

## Requerimientos

### 1. Crear una lista de frutas

Dentro del método `main`, crea una lista vacía que almacenará frutas.

### 2. Agregar frutas

Crea una función que solicite al usuario ingresar frutas y las agregue a la lista.

### 3. Mostrar frutas

Crea una función que recorra la lista y muestre todas las frutas almacenadas.

### 4. Mostrar cantidad

Crea una función que muestre cuántas frutas contiene actualmente la lista.

### 5. Reemplazar una fruta

Crea una función que permita cambiar una fruta existente por otra.

Por ejemplo:
```
Pera → Sandía
```

La fruta a reemplazar y la nueva fruta deben ser solicitadas al usuario.

### 6. Eliminar una fruta

Crea una función que solicite una fruta al usuario y la elimine de la lista.

### 7. Mostrar resultado final

Después de realizar todas las operaciones, muestra nuevamente la lista actualizada.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class tareaGestiondefrutas {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] HOLA) {
        Scanner scan = new Scanner(System.in);
        List<String> frutasLista = new ArrayList<>();
        tareaGestiondefrutas.frutasInput(frutasLista,scan);
        tareaGestiondefrutas.recorrerLista(frutasLista);
        tareaGestiondefrutas.frutasReemplazar(frutasLista,scan);
        tareaGestiondefrutas.frutasEliminar(frutasLista,scan);
        tareaGestiondefrutas.frutasActualizadas(frutasLista);

    }


//AÑADIMOS COMO PARÁMETROS LA LISTA Y EL SCANNER CREADOS
    static void frutasInput(List <String> frutasLista,Scanner scan) {


            while (true) {

                System.out.println(" 1 )Ingresar nueva fruta ");
                System.out.println(" 2) Salir ");
                System.out.println(" Ingrese opción: ");
                int opcion = scan.nextInt();


                switch (opcion){
                    case 1:
                        System.out.println("Ingrese Fruta: ");
                        String frutaInt = scan.next();
                        frutasLista.add(frutaInt);
                        break;
                    case 2:
                        System.out.println("Saliendo");
                        return;
                }
            }
    }


    //DEBIDO A QUE "LIST" ESTÁ EN MAIN DEBE SER INVOCADA CÓMO PARÁMETRO
     static void recorrerLista(List<String> frutasLista){

        for(int i=0; i < frutasLista.size(); i++ ) {
           System.out.println(i + "- " +frutasLista.get(i));

        }
    }

    static void frutasCantidad(List <String> frutasLista){
        System.out.println(frutasLista.size());
    }

    static void frutasReemplazar(List <String> frutasLista,Scanner scan){
        System.out.println("Ingrese índice de fruta a reemplazar :");
        int indice = scan.nextInt();
        System.out.println("Ingrese fruta nueva :");
        String fruta= scan.next();
        frutasLista.set(indice,fruta);

    }

    static void frutasEliminar(List <String> frutasLista,Scanner scan){

        while(true){
            System.out.println("Ingrese fruta a eliminar: ");
            String frutaEliminar= scan.next();
            boolean existe= frutasLista.contains(frutaEliminar);
        if (existe == true){
            System.out.println(frutasLista.remove(frutaEliminar));
            return;

        }else {System.out.println("La fruta no se encuentra en la lista.");}

    }}

    static void frutasActualizadas(List <String> frutasLista){
        for(int i=0; i < frutasLista.size(); i++ ) {
            System.out.println(i + "- " +frutasLista.get(i));

        }

    }

}
