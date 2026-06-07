

    /*
========================================
MAP EN JAVA
========================================

OBJETIVOS:
---------
- Entender qué es un Map en Java.
- Comprender el concepto clave → valor.
- Usar HashMap correctamente.
- Agregar, obtener y eliminar datos.
- Recorrer un Map.
- Evitar errores comunes.
- Saber cuándo usar Map vs List vs Set.
- Aplicar buenas prácticas.

========================================
1. ¿QUÉ ES UN MAP?
========================================

Un Map almacena datos en pares:

clave → valor

Ejemplo:

Nombre → Teléfono
RUT → Trabajador

¿Por qué existe?

Porque hay problemas que NO se resuelven bien con List o Set:

✘ Buscar por índice
✘ Recorrer todo para encontrar algo
✘ Validaciones manuales

Map permite:

✔ Búsquedas rápidas
✔ Relaciones claras
✔ Código más expresivo

========================================
2. JERARQUÍA
========================================

Map → HashMap

- Map = interfaz
- HashMap = implementación

Buena práctica:

Map<String, Integer> sueldos = new HashMap<>();

========================================
3. DECLARACIÓN
========================================
*/

import java.util.HashMap;
import java.util.Map;

    public class map {

        public static void main(String[] args) {

        /*
        ========================================
        4. AGREGAR ELEMENTOS (put)
        ========================================
        */

            Map<String, Integer> sueldos = new HashMap<>();

            sueldos.put("Juan", 500000);
            sueldos.put("Ana", 650000);

        /*
        Si la clave ya existe,
        el valor se reemplaza.
        */

            sueldos.put("Juan", 700000);

        /*
        ========================================
        5. OBTENER ELEMENTOS (get)
        ========================================
        */

            int sueldoJuan = sueldos.get("Juan");

            System.out.println("Sueldo Juan: " + sueldoJuan);

        /*
        Validar antes de obtener:
        */

            if (sueldos.containsKey("Juan")) {
                System.out.println(sueldos.get("Juan"));
            }

        /*
        ========================================
        6. ELIMINAR ELEMENTOS
        ========================================
        */

            sueldos.remove("Ana");

        /*
        ========================================
        7. TAMAÑO DEL MAP
        ========================================
        */

            int total = sueldos.size();

            System.out.println("Total registros: " + total);

        /*
        ========================================
        8. RECORRER UN MAP
        ========================================
        */

            // Recorrer claves
            for (String clave : sueldos.keySet()) {
                System.out.println("Clave: " + clave);
            }

            // Recorrer valores
            for (int valor : sueldos.values()) {
                System.out.println("Valor: " + valor);
            }

            // Recorrer clave y valor (RECOMENDADO)
            for (Map.Entry<String, Integer> entry : sueldos.entrySet()) {
                System.out.println(
                        entry.getKey() + " → " + entry.getValue()
                );
            }

        /*
        ========================================
        9. ERRORES COMUNES
        ========================================

        ERROR 1:
        HashMap NO garantiza orden.

        System.out.println(sueldos);

        ERROR 2:
        No existen índices.

        sueldos.get(0); // ERROR

        ERROR 3:
        No validar claves inexistentes.

        Integer sueldo = sueldos.get("Pedro");

        Puede devolver null.
        */

        /*
        ========================================
        10. BUENAS PRÁCTICAS
        ========================================

        ✔ Usar claves únicas.
        ✔ Validar con containsKey().
        ✔ Usar entrySet() para recorrer.
        ✔ Usar Map cuando existe relación directa.
        ✔ Mantener claves inmutables.

        ========================================
        11. MALAS PRÁCTICAS
        ========================================

        ✘ Usar Map cuando basta una lista.
        ✘ Usar claves complejas sin necesidad.
        ✘ Asumir orden en HashMap.
        ✘ Usar Map porque "se ve más avanzado".

        ========================================
        12. LIST VS SET VS MAP
        ========================================

        LIST
        ----
        ✔ Permite duplicados
        ✔ Tiene orden
        ✔ Acceso por índice

        SET
        ---
        ✘ No permite duplicados
        ✘ No tiene índice

        MAP
        ---
        ✔ Clave → valor
        ✔ Búsqueda directa
        ✘ No tiene índice

        ========================================
        13. EJEMPLO REAL
        ========================================

        Antes:

        List<String> nombres;
        List<Integer> sueldos;

        Problema:
        Los datos pueden desalinearse.

        Después:
        */

            Map<String, Integer> payroll = new HashMap<>();

            payroll.put("Juan", 500000);
            payroll.put("Maria", 700000);

            System.out.println(payroll.get("Juan"));

        /*
        Ventajas:

        ✔ Relación clara
        ✔ Búsqueda directa

        ========================================
        14. EJERCICIO PROPUESTO
        ========================================

        Crear un programa que:

        1. Use Map<String, Integer>.
        2. Permita agregar trabajadores.
        3. Permita consultar sueldos.
        4. Permita eliminar trabajadores.
        5. Muestre todos los registros.

        ========================================
        REFLEXIÓN
        ========================================

        Cuando un dato depende de otro,
        Map es la estructura correcta.
        */
        }
    }

