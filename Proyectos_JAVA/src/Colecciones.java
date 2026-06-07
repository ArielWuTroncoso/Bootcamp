/*
========================================
COLECCIONES EN JAVA
========================================

OBJETIVOS
---------
- Entender qué es una colección.
- Conocer los principales tipos de colecciones.
- Diferenciar Array, List, Set, Map y Stream.
- Saber cuándo utilizar cada una.
- Reconocer buenas y malas prácticas.

========================================
1. ¿QUÉ ES UNA COLECCIÓN?
========================================

Una colección es una estructura que permite:

✔ Almacenar datos
✔ Agrupar datos
✔ Manipular múltiples elementos

Hasta ahora hemos trabajado con variables
individuales:

int edad = 20;

Pero en aplicaciones reales necesitamos manejar:

- muchos trabajadores
- muchos productos
- muchos usuarios
- muchos registros

Para eso existen las colecciones.

========================================
PROBLEMA SIN COLECCIONES
========================================

String nombre1;
String nombre2;
String nombre3;

Problemas:

✘ No escala.
✘ Difícil de mantener.
✘ Poco flexible.

========================================
SOLUCIÓN CON COLECCIONES
========================================

Con Arrays:

String[] nombres = new String[3];

O mejor aún:

List<String> nombres = new ArrayList<>();

========================================
2. TIPOS DE COLECCIONES EN JAVA
========================================

TIPO       | DESCRIPCIÓN
-----------|----------------------------
Array      | Tamaño fijo
List       | Lista flexible y ordenada
Set        | Elementos únicos
Map        | Clave → Valor
Stream     | Procesamiento de datos

Ejemplos mentales:

Array   → Lista cerrada
List    → Lista editable
Set     → Conjunto único
Map     → Diccionario
Stream  → Filtro o tubería de datos

========================================
3. COMPARACIÓN GENERAL
========================================

ARRAY
------
✔ Tamaño fijo
✔ Duplicados permitidos
✔ Ordenado
✔ Acceso por índice

LIST
-----
✔ Tamaño dinámico
✔ Duplicados permitidos
✔ Mantiene orden
✔ Acceso por índice

SET
----
✔ Tamaño dinámico
✔ NO permite duplicados
✔ Sin índice
✔ Orden depende de la implementación

MAP
----
✔ Tamaño dinámico
✔ Clave → valor
✔ Claves únicas
✔ Sin índice

========================================
4. ¿CUÁNDO USAR CADA UNO?
========================================

----------------------------------------
ARRAY
----------------------------------------

Usar cuando:

✔ Conoces la cantidad exacta.
✔ El tamaño no cambiará.

Ejemplos:

- 12 meses
- 7 días
- 3 trabajadores

----------------------------------------
LIST (ArrayList)
----------------------------------------

Usar cuando:

✔ No sabes cuántos elementos habrá.
✔ Necesitas agregar o eliminar.
✔ El orden importa.

Ejemplos:

- Lista de alumnos
- Carrito de compras
- Historial

----------------------------------------
SET
----------------------------------------

Usar cuando:

✔ No quieres duplicados.
✔ La unicidad es importante.

Ejemplos:

- Correos únicos
- RUT únicos
- IDs únicos

----------------------------------------
MAP
----------------------------------------

Usar cuando:

✔ Necesitas buscar por clave.
✔ Necesitas acceso rápido.

Ejemplos:

usuario → contraseña

idProducto → precio

rut → trabajador

----------------------------------------
STREAM
----------------------------------------

Usar cuando:

✔ Necesitas procesar datos.
✔ Filtrar información.
✔ Transformar datos.
✔ Resumir resultados.

Ejemplos:

- Filtrar sueldos
- Contar trabajadores
- Calcular promedios

========================================
5. EJEMPLOS BÁSICOS
========================================
*/

import java.util.*;

public class Colecciones {

    public static void main(String[] args) {

        /*
        ----------------------------------------
        ARRAY
        ----------------------------------------
        */

        int[] edades = {20, 25, 30};

        System.out.println(edades[0]);

        /*
        ----------------------------------------
        LIST
        ----------------------------------------
        */

        List<String> nombres =
                new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Juan");

        System.out.println(nombres);

        /*
        ----------------------------------------
        SET
        ----------------------------------------
        */

        Set<String> correos =
                new HashSet<>();

        correos.add("a@mail.com");
        correos.add("a@mail.com");

        System.out.println(correos);

        /*
        Solo aparecerá una vez porque
        Set elimina duplicados.
        */

        /*
        ----------------------------------------
        MAP
        ----------------------------------------
        */

        Map<String, Integer> sueldos =
                new HashMap<>();

        sueldos.put("Juan", 500000);

        System.out.println(
                sueldos.get("Juan")
        );

        /*
        ----------------------------------------
        STREAM
        ----------------------------------------
        */

        nombres.stream()
                .forEach(System.out::println);

        /*
        Stream NO almacena datos.

        Procesa los datos que ya están
        dentro de una colección.
        */
    }
}

/*
========================================
6. BUENAS PRÁCTICAS
========================================

✔ Elegir la colección adecuada.

✔ Usar List cuando el tamaño cambie.

✔ Usar Set para evitar duplicados.

✔ Usar Map cuando exista una relación
  clave → valor.

✔ Pensar en el problema antes que en la
  herramienta.

========================================
7. MALAS PRÁCTICAS
========================================

✘ Usar Arrays para todo.

✘ Forzar índices innecesarios.

✘ Usar List cuando no importa el orden.

✘ Usar Map porque parece más avanzado.

✘ Crear loops complejos cuando un
  Stream sería más claro.

========================================
8. ERROR TÍPICO
========================================

"¿Por qué no usar siempre List?"

Respuesta:

Porque cada colección tiene un propósito.

No existe una colección universal.

Cada una tiene ventajas y costos.

========================================
RESUMEN RÁPIDO
========================================

Array
-----
Tamaño fijo.

List
----
Ordenada y flexible.

Set
---
Sin duplicados.

Map
---
Clave → valor.

Stream
------
Procesa datos.

========================================
REFLEXIÓN
========================================

No existen colecciones buenas o malas.

Existen colecciones bien o mal elegidas.
*/