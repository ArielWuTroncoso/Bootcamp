/*
========================================
STREAM EN JAVA
========================================

OBJETIVOS
---------
- Entender qué es un Stream.
- Saber qué problema resuelve.
- Diferenciar colección vs Stream.
- Usar operaciones básicas:
    * filter()
    * map()
    * forEach()
    * count()
- Leer código con Streams.
- Saber cuándo usar Streams y cuándo NO.
- Reconocer buenas y malas prácticas.

========================================
1. ¿QUÉ ES UN STREAM?
========================================

Un Stream es una secuencia de datos que se procesa paso a paso.

IMPORTANTE:

✔ NO almacena datos.
✔ NO reemplaza List, Set o Map.
✔ Se usa para procesar colecciones.

Un Stream es como una línea de producción:

Datos → Filtro → Transformación → Resultado

----------------------------------------
¿Por qué existe Stream?
----------------------------------------

Antes de Java 8 se utilizaban principalmente loops:

for (int n : numeros) {
    if (n > 10) {
        System.out.println(n);
    }
}

Funciona, pero:

✘ Es más largo.
✘ Mezcla lógica y control.
✘ Cuesta leerlo rápidamente.

Stream nace para:

✔ Escribir código más expresivo.
✔ Separar el QUÉ del CÓMO.
✔ Facilitar operaciones comunes.

========================================
2. COLECCIÓN VS STREAM
========================================

COLECCIÓN
----------
✔ Almacena datos.
✔ Tiene estado.
✔ Es reutilizable.
✔ add()
✔ remove()

STREAM
-------
✔ Procesa datos.
✔ No guarda estado.
✔ Se consume una sola vez.
✔ filter()
✔ map()

REGLA DE ORO

Primero guardas los datos en una colección,
luego los procesas utilizando Stream.

========================================
3. CREAR UN STREAM
========================================
*/

import java.util.*;
import java.util.stream.Stream;
import java.util.Arrays;

public class stream {

    public static void main(String[] args) {

        /*
        ----------------------------------------
        DESDE UNA LIST
        ----------------------------------------
        */

        List<String> nombres =
                List.of("Ana", "Juan", "Pedro");


        nombres.stream();

        /*
        ----------------------------------------
        DESDE UN SET
        ----------------------------------------
        */

        Set<String> set = new HashSet<>();

        set.stream();

        /*
        ----------------------------------------
        DESDE UN MAP
        ----------------------------------------
        */

        Map<String, Integer> mapa =
                new HashMap<>();

        mapa.entrySet().stream();

        /*
        ----------------------------------------
        DESDE UN ARRAY
        ----------------------------------------
        */

        int[] numeros = {1, 2, 3, 4, 5};

        Arrays.stream(numeros);

        /*
        ========================================
        4. OPERACIONES PRINCIPALES
        ========================================
        */

        /*
        ----------------------------------------
        forEach()
        ----------------------------------------

        Acción final.
        Similar a foreach.
        */

        nombres.stream();
        nombres.forEach(System.out::println);

        /*
        ✔ Mostrar elementos.
        ✔ Ejecutar acciones.
        */

        /*
        ----------------------------------------
        filter()
        ----------------------------------------

        Filtra elementos según una condición.
        */
        System.out.print("Usando filter >4 y luego forEach");
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

        /*
        ✔ Devuelve solo los elementos
          que cumplen la condición.
        */

        /*
        ----------------------------------------
        map()
        ----------------------------------------

        Transforma cada elemento.
        */
        System.out.print("Transformando con :: toUperCase");
        nombres.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*
        ✔ Convierte cada elemento.
        ✔ No modifica la colección original.
        */

        /*
        ----------------------------------------
        count()
        ----------------------------------------
        */

        long total = nombres.stream().count();
        System.out.println("Usando count()");
        System.out.println("Total: " + total);

        /*
        ========================================
        5. FLUJO TÍPICO DE UN STREAM
        ========================================
        */
        System.out.println("Flujo Típico de un stream: primero nombres.Stream - .filter - .map . forEach");
        nombres.stream()
                .filter(nombre -> nombre.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /*
        Se lee de arriba hacia abajo.

        Como una frase:

        "Tomar nombres,
         filtrar los que tengan más de 3 letras,
         convertirlos a mayúsculas,
         mostrarlos."
        */

        /*
        ========================================
        6. ERRORES COMUNES
        ========================================
        */

        /*
        ERROR 1:
        Pensar que modifica la colección.
        */
        nombres.stream()
                .filter(nombre -> nombre.length() > 4);

        /*
        Esto NO cambia la lista nombres.
        */

        /*
        Para modificar resultados,
        normalmente se guarda en otra colección.
        */

        /*
        ERROR 2:
        Reutilizar un Stream.
        */

        Stream<String> s = nombres.stream();

        s.forEach(System.out::println);

        // ERROR:
        // s.forEach(System.out::println);

        /*
        Un Stream solo puede consumirse una vez.
        */

        /*
        ERROR 3:
        Usar Stream para todo.
        */

        nombres.stream()

                .forEach(System.out::println);

        /*
        A veces un foreach normal
        es más simple y legible.
        */

        /*
        ========================================
        7. BUENAS PRÁCTICAS
        ========================================

        ✔ Usar Stream para leer y procesar.
        ✔ Mantener Streams cortos.
        ✔ Priorizar claridad.
        ✔ Usar nombres descriptivos.
        ✔ Leer el Stream como una frase.
        */

        /*
        ========================================
        8. MALAS PRÁCTICAS
        ========================================

        ✘ Streams demasiado largos.
        ✘ Streams anidados complejos.
        ✘ Reemplazar loops simples sin razón.
        ✘ Copiar Streams sin entenderlos.
        */

        /*
        ========================================
        9. LOOP VS STREAM
        ========================================

        LOOP
        ----
        ✔ Control total.
        ✔ Paso a paso.
        ✔ Fácil de aprender.

        STREAM
        ------
        ✔ Menos código.
        ✔ Más declarativo.
        ✔ Más expresivo.

        NO COMPITEN.
        SE COMPLEMENTAN.
        */

        /*
        ========================================
        10. EJEMPLO APLICADO (PAYROLL)
        ========================================
        */
        System.out.println("Ejemplo aplicado a PAYROLL, usando .stream .filter. forEach  :" +
                "" +
                "sueldos.values()\n" +
                "                .stream()\n" +
                "                .filter(sueldo -> sueldo > 500000)\n" +
                "                .forEach(System.out::println);");


        Map<String, Integer> sueldos =
                new HashMap<>();

        sueldos.put("Juan", 450000);
        sueldos.put("Ana", 650000);
        sueldos.put("Pedro", 800000);

        sueldos.values()
                .stream()
                .filter(sueldo -> sueldo > 500000)
                .forEach(System.out::println);

        /*
        Muestra:

        650000
        800000
        */

        /*
        ========================================
        11. EJERCICIO PROPUESTO
        ========================================

        Dada una List<Integer>:

        1. Mostrar solo los mayores a 10.
        2. Transformarlos al doble.
        3. Contar cuántos quedaron.
        4. Mostrar el resultado.
        */



        /*
        ========================================
        REFLEXIÓN
        ========================================

        Stream no reemplaza
        el conocimiento básico.

        Lo potencia.

        ========================================
        RESUMEN GENERAL
        ========================================

        Ya conoces:

        ✔ Arrays
        ✔ List
        ✔ Set
        ✔ Map
        ✔ Stream

        Lo importante no es conocerlos.

        Lo importante es saber
        CUÁNDO utilizar cada uno.
        */
    }
}