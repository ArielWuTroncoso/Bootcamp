import java.util.*;
import java.util.Map;
import java.util.logging.Filter;



public class ejerciciosColecciones {
    public static void main (String[] args) { // EN MAIN ENTRA A LA JVM

        Scanner scan = new Scanner(System.in);
 /*




/*
========================================
EJERCICIOS DE COLECCIONES
========================================

OBJETIVO GENERAL
----------------
Practicar el uso de:

✔ ArrayList
✔ Set
✔ Map
✔ Stream

Aplicando conceptos de:

- almacenamiento de datos
- validación
- recorridos
- procesamiento de colecciones

========================================
EJERCICIO 1
ARRAYLIST - REGISTRO DE PRODUCTOS
========================================

OBJETIVO
--------
Practicar la creación, almacenamiento y
recorrido de un ArrayList.
/*

----------------------------------------
INSTRUCCIONES
----------------------------------------
/*


PASO 1

Crear un:

List<String> productos
*/

        List<String> productos = new ArrayList<>();

/*
----------------------------------------
PASO 2

Preguntar al usuario:

¿Cuántos productos desea registrar?
*/

        System.out.println("¿Cuántos productos desea registrar?");
        int cantidad = scan.nextInt();
        System.out.println(cantidad);

/*
----------------------------------------

PASO 3

Solicitar cada producto e incorporarlo
a la lista.
*/


        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese productos :");
            String productosInput = scan.next();
            productos.add(productosInput);

        }




/*
----------------------------------------

PASO 4

Mostrar todos los productos registrados.
*/
        System.out.println("Lista productos: ");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }

/*
----------------------------------------
PASO 5

Mostrar cuántos productos fueron
ingresados.
*/
        System.out.println("Cantidad de productos fueron ingresados: ");
        System.out.println(productos.size());


 /*
----------------------------------------
PISTAS
----------------------------------------

Crear la lista:

List<String> productos =
        new ArrayList<>();

Agregar elementos:

productos.add(producto);

Cantidad de elementos:

productos.size();

Recorrer la lista:

for(String producto : productos){

}

 */




 /*
========================================
EJERCICIO 2
SET - REGISTRO DE USUARIOS ÚNICOS
========================================

OBJETIVO
--------
Comprender cómo un Set evita
elementos duplicados.

----------------------------------------
INSTRUCCIONES
----------------------------------------

PASO 1

Crear un:

HashSet<String> usuarios
*/
        Set<String> usuarios = new HashSet<>();


 /*
----------------------------------------

PASO 2

Preguntar:

¿Cuántos usuarios desea registrar?
*/
        System.out.println("¿Cuantos usuarios desea registrar?");
        int cantidadUsuarios = scan.nextInt();

 /*
----------------------------------------

PASO 3

Solicitar cada nombre de usuario.
*/
// A DIFERENCIA DE LIST, EN set NO PODEMOS AGREGAR ELEMENTOS CON INDICES

        for (int i = 0; i < cantidadUsuarios; i++) {

            System.out.println("Ingrese usuario: ");
            String usuariosInput = scan.next();

            for (String usuario : usuarios) {
                //Aquí se debe usar Objects.equals(x,x) para comparar Strings

                if (Objects.equals(usuariosInput, usuario)) {
                    System.out.println("Usuario repetido");
                }
            }









 /*
----------------------------------------

PASO 4

Intentar agregar cada nombre al Set.



  */
            usuarios.add(usuariosInput);

        }

   /*
----------------------------------------

PASO 5

Si el usuario ya existe mostrar:

"Usuario repetido"
*/


/*
----------------------------------------
PASO 6

Mostrar todos los usuarios únicos.
  */
        System.out.println("Mostrando usuarios unicos en lista: ");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }




/*
----------------------------------------

PASO 7

Mostrar la cantidad total de usuarios
únicos registrados.
*/
        System.out.println("Cantidad de usuarios únicos: ");
        System.out.println(usuarios.size());



/*
----------------------------------------
PISTAS
----------------------------------------

Crear Set:

HashSet<String> usuarios =
        new HashSet<>();

Agregar elemento:

usuarios.add(nombre);

Recorrer Set:

for(String usuario : usuarios){

}

Pregúntate:

¿Cómo puedo saber si un elemento
ya existía antes de agregarlo?

========================================
EJERCICIO 3
MAP - AGENDA TELEFÓNICA
========================================

OBJETIVO
--------
Aprender a trabajar con relaciones
clave → valor.

----------------------------------------
INSTRUCCIONES
----------------------------------------

PASO 1

Crear un:

HashMap<String, String>
*/
        Map <String,Integer > contactos = new HashMap<>();
/*
----------------------------------------

PASO 2

Registrar 5 contactos.

Para cada contacto solicitar:

- Nombre
- Teléfono
*/      for (int i=0; i < 5; i++) {
            System.out.println("Ingrese nombre de contacto : ");
            String contactoInput = scan.next();
            System.out.println("Ingrese teléfono del contacto : ");
            int telefono = scan.nextInt();




 /*
----------------------------------------
/*

PASO 3

Guardar la información en el Map.
  */

            contactos.put(contactoInput, telefono);

        }

  /*
----------------------------------------

PASO 4

Mostrar todos los contactos registrados.
*/

        // Entry = define que parámetros buscar al entrar en Map
        //Luego, entry = entra al MAP guarda valores pares del map en entrySET()
        //y entrySet devuelve un conjunto de pares de key y valor en modo lista {}
        for (Map.Entry<String,Integer>entry:
                contactos.entrySet()) {
            System.out.println
                    (entry.getKey() + " -> " + entry.getValue());

        }
  /*
----------------------------------------

PASO 5

Solicitar un nombre.
*/
        System.out.println("Ingrese nombre para buscar información : ");
        String contactoInfo = scan.next();





 /*
----------------------------------------

PASO 6

Mostrar el teléfono asociado a ese
nombre.
*/
    int contactTelefono = contactos.get(contactoInfo);
        System.out.println(contactTelefono);


 /*
----------------------------------------
PISTAS
----------------------------------------

Crear Map:

HashMap<String, String> agenda =
        new HashMap<>();

Guardar información:

agenda.put(nombre, telefono);

Buscar teléfono:

agenda.get(nombre);

Recorrer Map:

for(var contacto : agenda.entrySet()){

}

Pregúntate:

¿Cómo obtengo la clave?

¿Cómo obtengo el valor?





 /*
========================================
EJERCICIO 4
STREAM - FILTRAR NOTAS APROBADAS
========================================

OBJETIVO
--------
Aprender a utilizar Stream para
procesar colecciones.

----------------------------------------
INSTRUCCIONES
----------------------------------------

PASO 1

Crear una lista de notas.
*/
    //Las listas no pueden llevar declaraciones primitivas (int) Sólo Wrappers
        List <Float> listaNotas = new ArrayList<>();

/*

----------------------------------------

PASO 2

Agregar varias notas al ArrayList.
 */

        float nota=5;
        for(int i=0; i < nota;i++){

        System.out.println("Ingrese una nota: ");
        float notaInput = scan.nextFloat();
        listaNotas.add(notaInput);

    }

/*


----------------------------------------

PASO 3

Utilizar Stream para mostrar
únicamente las notas aprobadas.

Considerar aprobadas las notas:

Mayor o igual a 4.0

 */
        System.out.println("Notas aprobadas: ");
 listaNotas.stream()
         .filter(n -> n >= 4)
         .forEach(System.out :: println);


/*
----------------------------------------

PASO 4

Contar cuántas notas aprobadas existen.
*/

    System.out.println("Conteo de elementos de en lista de notas: ");
    long conteo = listaNotas.stream().count();
    System.out.println(conteo);


/*
----------------------------------------
PISTAS
----------------------------------------

Crear Stream:

notas.stream()

----------------------------------------

Filtrar:

.filter(...)

Pregúntate:

¿Qué condición debe cumplir una nota
para considerarse aprobada?

----------------------------------------

Mostrar resultados:

.forEach(...)

----------------------------------------

Contar resultados:

.count()

----------------------------------------

Estructura esperada:

notas.stream()
     .filter(...)
     .forEach(...);

========================================
CONCEPTOS QUE DEBES PRACTICAR
========================================

ARRAYLIST
----------
✔ add()
✔ size()
✔ recorrido con for-each

SET
----
✔ add()
✔ evitar duplicados
✔ recorrido de elementos

MAP
----
✔ put()
✔ get()
✔ entrySet()
✔ clave y valor

STREAM
-------
✔ stream()
✔ filter()
✔ forEach()
✔ count()

========================================
DESAFÍO PERSONAL
========================================

Antes de programar cada ejercicio,
intenta responder:

1. ¿Qué colección es la más adecuada?

2. ¿Qué información necesito guardar?

3. ¿Cómo recorreré los datos?

4. ¿Necesito evitar duplicados?

5. ¿Necesito una relación clave → valor?

6. ¿Necesito procesar o filtrar datos?

========================================
REGLA DE ORO
========================================

No memorices colecciones.

Aprende qué problema resuelve cada una.

La mejor colección siempre será la que
se adapte mejor al problema.
*/


    }
}